package com.example.opet.atividade1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private EditText editLogin,editSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();

        //editLogin = findViewById(R.id.editLogin);
        //editSenha = findViewById(R.id.editSenha);



    }
    @Override
    public void onStart(){
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }

    public void signIn(View view) {
        String login, senha;

        //login = EditLogin.toString();
        //senha = EditSenha.toString();

        //mAuth.signInWithEmailAndPassword(login,senha).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
            //@Override
            //public void onSuccess(AuthResult authResult) {
                Intent novaTela = new Intent(MainActivity.this,TelaPrincipal.class);
                startActivity(novaTela);
            }
        //}).addOnFailureListener(new OnFailureListener() {
            //@Override
            public void onFailure(@NonNull Exception e) {
                //Toast.makeText(this, "Errouuu", Toast.LENGTH_LONG).show();
            }
        //});
    }
//}
