package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables de EditText
    public EditText num1, num2, res;

    //Variables de botones
    public Button sum, rest, mult, div, modul;

    public Float numero1, numero2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.et_num1);
        num2 = (EditText) findViewById(R.id.et_num2);
        res = (EditText) findViewById(R.id.et_res);

        sum = (Button) findViewById(R.id.btn_sum);
        rest = (Button) findViewById(R.id.btn_rest);
        mult = (Button) findViewById(R.id.btn_mult);
        div = (Button) findViewById(R.id.btn_div);
        modul = (Button) findViewById(R.id.btn_modul);
    }

    public void sum(View view) {
        numero1 =  Float.parseFloat(num1.getText().toString());
        numero2 =  Float.parseFloat(num2.getText().toString());

        result = numero1 + numero2;

        res.setText(result.toString());
    }

    public void rest(View view){
        numero1 =  Float.parseFloat(num1.getText().toString());
        numero2 =  Float.parseFloat(num2.getText().toString());

        result = (numero1 - numero2);

        res.setText(result.toString());
    }

    public void mult(View view){
        numero1 =  Float.parseFloat(num1.getText().toString());
        numero2 =  Float.parseFloat(num2.getText().toString());

        result = numero1 * numero2;

        res.setText(result.toString());
    }

    public void div(View view){
        numero1 =  Float.parseFloat(num1.getText().toString());
        numero2 =  Float.parseFloat(num2.getText().toString());

        result = numero1 / numero2;

        res.setText(result.toString());
    }

    public void modul(View view){
        numero1 =  Float.parseFloat(num1.getText().toString());
        numero2 =  Float.parseFloat(num2.getText().toString());

        result = numero1 % numero2;

        res.setText(result.toString());
    }
}
