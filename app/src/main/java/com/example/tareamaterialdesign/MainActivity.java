package com.example.tareamaterialdesign;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bfecha;
    EditText edtFecha,edtNombre,edtEmail,edtTelefono, edtDescricpion ;
    private int dia,mes,ano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bfecha =(Button) findViewById(R.id.bfecha);
        edtFecha=(EditText) findViewById(R.id.edtFecha);
        bfecha.setOnClickListener(this);

        edtNombre = (EditText)findViewById(R.id.edtNombre);
        edtEmail =(EditText)findViewById(R.id.edtEmail);
        edtTelefono = (EditText) findViewById(R.id.edtTelefono);
        edtDescricpion= (EditText) findViewById(R.id.edtDescripcion);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onClick(View v) {
        if(v==bfecha){
        final Calendar c = Calendar.getInstance();
        dia= c.get(Calendar.DAY_OF_MONTH);
        mes =c.get(Calendar.MONTH);
        ano = c.get(Calendar.YEAR);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                edtFecha.setText(dayOfMonth+"/"+(monthOfYear)+"/"+year);
                }
            }
            ,dia,mes,ano);
            datePickerDialog.show();
        }
    }
    public void Enviar(View view){
        Intent i = new Intent(this,DatosUsuario.class);
        i.putExtra("nombre",edtNombre.getText().toString());
        i.putExtra("email",edtEmail.getText().toString());
        i.putExtra("numero",edtTelefono.getText().toString());
        i.putExtra("descripcion",edtDescricpion.getText().toString());
        i.putExtra("fecha",edtFecha.getText().toString());

        startActivity(i);
    }
}
