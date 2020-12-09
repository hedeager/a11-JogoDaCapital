package com.example.a11_jogodacapital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Normalizer;
import java.util.Random;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int tentnum;
    int pontosnum;
    int x;


    public void starterson(View view){
        String[] estados =
                {"São Paulo(SP)",
                "Paraná(PR)",
                "Bahia(BA)",
                "Goiás(GO)",
                "Amazonas(AM)",
                "Acre(AC)",
                "Espirito Santo(ES)",
                "Rio de Janeiro(RJ)",
                "Alagoas(AL)",
                "Amapá(AP)",
                "Ceará(CE)",
                "Maranhão(MA)",
                "Minas Gerais(MG)",
                "Pará(PA)",
                "Paraíba(PB)"};

        TextView la1 = findViewById(R.id.textViewerson);
        TextView la2 = findViewById(R.id.textView4);
        Button b1 = findViewById(R.id.botaoinicio);
        TextView est = findViewById(R.id.estado);
        EditText input = findViewById(R.id.capital);
        TextView pontos = findViewById(R.id.pontuacao);
        Button b2 = findViewById(R.id.botaotentativa);
        TextView ac = findViewById(R.id.acertos);
        TextView fin = findViewById(R.id.finale);

        la1.setVisibility(view.VISIBLE);
        la2.setVisibility(view.VISIBLE);
        ac.setVisibility(view.VISIBLE);
        b1.setVisibility(view.INVISIBLE);
        fin.setVisibility(view.INVISIBLE);

        Random r = new Random();
        x = r.nextInt(15);
        est.setText(estados[x]);
        est.setVisibility(view.VISIBLE);

        input.setVisibility(view.VISIBLE);

        pontos.setVisibility(view.VISIBLE);
        pontos.setText("0");

        b2.setVisibility(view.VISIBLE);

        tentnum = 0;
        pontosnum = 0;
    }
    public void tentativa(View view){
        String[] capitais =
                {"sao paulo",
                        "curitiba",
                        "salvador",
                        "goiania",
                        "manaus",
                        "rio branco",
                        "vitoria",
                        "rio de janeiro",
                        "maceio",
                        "macapa",
                        "fortaleza",
                        "sao luis",
                        "belo horizonte",
                        "belem",
                        "joao pessoa",
                        "são paulo",
                        "curitiba",
                        "salvador",
                        "goiânia",
                        "manaus",
                        "rio branco",
                        "vitória",
                        "rio de janeiro",
                        "maceió",
                        "macapá",
                        "fortaleza",
                        "são luís",
                        "belo horizonte",
                        "belém",
                        "joão pessoa",
                };
        String[] estados =
                {"São Paulo(SP)",
                        "Paraná(PR)",
                        "Bahia(BA)",
                        "Goiás(GO)",
                        "Amazonas(AM)",
                        "Acre(AC)",
                        "Espirito Santo(ES)",
                        "Rio de Janeiro(RJ)",
                        "Alagoas(AL)",
                        "Amapá(AP)",
                        "Ceará(CE)",
                        "Maranhão(MA)",
                        "Minas Gerais(MG)",
                        "Pará(PA)",
                        "Paraíba(PB)"};
        TextView est = findViewById(R.id.estado);
        EditText input = findViewById(R.id.capital);
        TextView pontos = findViewById(R.id.pontuacao);
        TextView la1 = findViewById(R.id.textViewerson);
        TextView la2 = findViewById(R.id.textView4);
        Button b1 = findViewById(R.id.botaoinicio);
        Button b2 = findViewById(R.id.botaotentativa);
        TextView ac = findViewById(R.id.acertos);
        TextView fin = findViewById(R.id.finale);
        String inputerson = input.getText().toString().trim().toLowerCase();

        if(tentnum>=4){
            if((inputerson.equals(capitais[x]))||(inputerson.equals(capitais[x+15]))){
                la1.setVisibility(view.INVISIBLE);
                la2.setVisibility(view.INVISIBLE);
                ac.setVisibility(view.INVISIBLE);
                b1.setVisibility(view.VISIBLE);
                est.setVisibility(view.INVISIBLE);
                input.setVisibility(view.INVISIBLE);
                pontos.setVisibility(view.INVISIBLE);
                b2.setVisibility(view.INVISIBLE);
                b1.setText("RECOMEÇAR");
                pontosnum=pontosnum+10;
                fin.setText("Placar final:"+pontosnum+" pontos");
                fin.setVisibility(view.VISIBLE);
                pontosnum=0;
                pontos.setText("0");
                tentnum=0;
                input.setText("");
            }
            else {
                la1.setVisibility(view.INVISIBLE);
                la2.setVisibility(view.INVISIBLE);
                b1.setVisibility(view.VISIBLE);
                est.setVisibility(view.INVISIBLE);
                input.setVisibility(view.INVISIBLE);
                pontos.setVisibility(view.INVISIBLE);
                b2.setVisibility(view.INVISIBLE);
                b1.setText("Recomeçar");
                fin.setText("Placar final:"+pontosnum+" pontos");
                fin.setVisibility(view.VISIBLE);
                pontosnum = 0;
                pontos.setText("0");
                tentnum = 0;
                input.setText("");
            }
        }
        else{
            if((inputerson.equals(capitais[x]))||(inputerson.equals(capitais[x+15]))){
                ac.setText("Acertou");
                pontosnum=pontosnum+10;
                pontos.setText(Integer.toString(pontosnum));
                Random r = new Random();
                x = r.nextInt(15);
                est.setText(estados[x]);
                tentnum=tentnum+1;
                input.setText("");
            }
            else{
                ac.setText("Errou");
                Random r = new Random();
                x = r.nextInt(15);
                est.setText(estados[x]);
                tentnum=tentnum+1;
                input.setText("");
            }
        }
    }
}