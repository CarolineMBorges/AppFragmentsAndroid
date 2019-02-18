package com.android.fragments.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.fragments.R;
import com.android.fragments.fragment.ContatosFragment;
import com.android.fragments.fragment.ConversasFragment;

public class MainActivity extends AppCompatActivity {

    //quando o usuário clicar nesses botões, será carregado o fragmento respectivo a ele
    private Button buttonConversas, buttonContatos;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Remover a sombra do ActionBar
         *  getSupportActionBar() recupera o objeto ActionBar
         *  setElevation cria aparencia de profundidade - sombra
         * */

        buttonContatos = findViewById(R.id.buttonContatoId);
        buttonConversas = findViewById(R.id.buttonConversaId);


        getSupportActionBar().setElevation(0);

        conversasFragment = new ConversasFragment();
        contatosFragment = new ContatosFragment();

        //Configurar o objeto que consegue exibir nossos fragmentos

        //getSupportFragmentManager() - objeto que gerencia nossos fragmentos
        final FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        /*transaction.add() - recebe dois parametros, o primeiro é o container o lugar que você quer exibir esse fragmento
         * depois passamos o framento que queremos exibir
         */
        transaction.replace(R.id.frameConteudoId, conversasFragment);

        /*
         * Usamos beginTransection para iniciar a transação, agora precisamos encera-la
         * */
        transaction.commit();

        //quando o usuário clica no botao, ira carregar o fragmento
        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ContatosFragment contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.frameConteudoId, contatosFragment);
                transaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConversasFragment conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.frameConteudoId, conversasFragment);
                transaction.commit();
            }
        });
    }
}
