package com.example.tareamaterialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DatosUsuario extends AppCompatActivity {
   // private TextView txvSNombre,txvSEmail,txvSTelefono,txvSDescripcion
    private EditText SedtNombre, edtSEmail, edtSTelefono, edtSDescripcion, edtSFecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_usuario);
        SedtNombre = (EditText)findViewById(R.id.SedtNombre);
        String nombre = getIntent().getStringExtra("nombre");
        SedtNombre.setText(nombre);

        edtSEmail = (EditText)findViewById(R.id.edtSEmail);
        String email = getIntent().getStringExtra("email");
        edtSEmail.setText(email);

        edtSTelefono = (EditText)findViewById(R.id.edtSTelefono);
        String numero = getIntent().getStringExtra("numero");
        edtSTelefono.setText(numero);

        edtSDescripcion= (EditText)findViewById(R.id.edtSDescripcion);
        String descripcion = getIntent().getStringExtra("descripcion");
        edtSDescripcion.setText(descripcion);

        edtSFecha = (EditText)findViewById(R.id.edtSFecha);
        String fecha = getIntent().getStringExtra("fecha");
        edtSFecha.setText(fecha);

    }
    public void Regresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
