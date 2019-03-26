package com.example.opet.atividade1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class TelaPrincipal extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_tela_principal);
    }

    public void signOut(View view) {
        mAuth.signOut();
        Intent novaTela = new Intent(TelaPrincipal.this,MainActivity.class);
        startActivity(novaTela);


    }



    }
