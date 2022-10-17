package com.example.sumayresta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox check1, check2;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 =(EditText) findViewById(R.id.txt_valor1);
        et2 =(EditText) findViewById(R.id.txt_valor2);
        check1 =(CheckBox) findViewById(R.id.check_suma);
        check2 =(CheckBox) findViewById(R.id.check_resta);
        tv =(TextView) findViewById(R.id.textView);

    }

    public void calcular(View view){
        String valor1_S= et1.getText().toString();
        String valor2_S= et2.getText().toString();

        int valor1=Integer.parseInt(valor1_S);
        int valor2=Integer.parseInt(valor2_S);

        //Variable de acumulacion
        String resultado="";
        if(check1.isChecked()==true){
            int suma=valor1+valor2;
            resultado="La suma es: "+suma;
        }
        if(check2.isChecked()==true){
            int resta=valor1-valor2;
            resultado=resultado+" La resta es: "+resta;
        }
        tv.setText(resultado);
    }
}