package com.example.fragment.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment.R;
import com.example.fragment.fragment.ContatoFragment;
import com.example.fragment.fragment.ConversaFragment;

public class MainActivity extends AppCompatActivity {

    private Button btnConversas, btnContatos;
    private ConversaFragment conversaFragment;
    private ContatoFragment contatoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConversas = findViewById(R.id.btn_conversas);
        btnContatos = findViewById(R.id.btn_contatos);

        //Remover a sombra do ActionBar
        getSupportActionBar().setElevation(0);

        conversaFragment = new ConversaFragment();

        //Configurar objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_conteudo, conversaFragment);
        transaction.commit();

        btnContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatoFragment = new ContatoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_conteudo, contatoFragment);
                transaction.commit();
            }
        });

        btnConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                conversaFragment = new ConversaFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_conteudo, conversaFragment);
                transaction.commit();
            }
        });
    }
}