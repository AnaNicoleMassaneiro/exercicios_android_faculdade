package com.example.conversor_de_temperatura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view){
        RadioButton rbCelsius = (RadioButton)findViewById(R.id.rbCelsius);
        RadioButton tbFh = (RadioButton)findViewById(R.id.tbFh);
        EditText input = (EditText)findViewById(R.id.txtValor);
        TextView output = (TextView)findViewById(R.id.txtResult);

        if(input.length() == 0 ){
            Toast.makeText(this, "Forneça uma temperatura", Toast.LENGTH_LONG).show();
            return;
        }

        float inputTemp = Float.parseFloat(input.getText().toString());
        if(rbCelsius.isChecked())
            output.setText("Resultado : " + String.valueOf(f2C(inputTemp)) + "C");
        else
            output.setText("Resultado : " + String.valueOf(C2F(inputTemp)) + "F");
    }

    private float F2C(float fahrenheit) {
        return ((fanrenheit -32) * 5 / 9);
    }

    private float C2f(float celsius) {
        return ((celsius * 9 / 5) + 32);
    }
}
