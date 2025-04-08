package com.example.aula_bd;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText editCod, editNome, editEmail, editTel;
    Button btnSalvar, btnExcluir, btnLimpar;
    ListView lista;
    PessoasDataBase bd = new PessoasDataBase(this);
    ArrayAdapter<String> adapter;
    ArrayList<String> arrayList;

    public void listarPessoas(){
        List<Pessoas> pessoas = bd.listarTodos();
        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        lista.setAdapter(adapter);
        for (Pessoas p:pessoas){
            arrayList.add(p.getCod() + " - " + p.getNome());
            adapter.notifyDataSetChanged();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editCod = findViewById(R.id.PlainCod);
        editNome = findViewById(R.id.PlainName);
        editTel = findViewById(R.id.PlainTel);
        editEmail = findViewById(R.id.PlainEmail);
        btnLimpar = findViewById(R.id.btn1);
        btnSalvar = findViewById(R.id.btn2);
        btnExcluir = findViewById(R.id.btn3);
        lista = findViewById(R.id.lista);

    }

}