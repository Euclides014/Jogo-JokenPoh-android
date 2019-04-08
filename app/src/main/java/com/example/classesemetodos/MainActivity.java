package com.example.classesemetodos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void opcaoSelecionada(String opcaoUsuario){
        ImageView imagemResultado = (ImageView) findViewById(R.id.imageResultado);
        TextView textoResultado = (TextView) findViewById(R.id.textResultado);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numero = new Random().nextInt(3);
        String escolhaApp = opcoes[numero];

        switch ( escolhaApp ){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.iconrock);
                break;
            case  "papel" :
                imagemResultado.setImageResource(R.drawable.iconpapel);
                break;
            case "tesoura" :
                imagemResultado.setImageResource(R.drawable.iconscissors);
                break;
        }

        if (      (escolhaApp=="pedra"&& opcaoUsuario=="tesoura")
                ||(escolhaApp=="papel" && opcaoUsuario=="pedra")
                ||(escolhaApp=="tesoura" && opcaoUsuario=="papel")){

            textoResultado.setText("Você perdeu :'(");

        } else if ((opcaoUsuario=="pedra"&& escolhaApp=="tesoura")
                ||(opcaoUsuario=="papel" && escolhaApp=="pedra")
                ||(opcaoUsuario=="tesoura" && escolhaApp=="papel")){

            textoResultado.setText("Você ganhou : )");

        } else {

            textoResultado.setText("Empatamos ; )");
        }
    }

    public void selecionarPedra(View view){
        this.opcaoSelecionada( "pedra");

    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada( "papel");

    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada( "tesoura");
    }
}
