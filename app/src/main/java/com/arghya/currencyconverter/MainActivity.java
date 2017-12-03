package com.arghya.currencyconverter;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText rupees;
    public EditText dollars;
    public void clickFunction(View view){
        rupees = (EditText)findViewById(R.id.rupeesEditText);
        dollars = (EditText)findViewById(R.id.dollarsEditText);
        double d = Double.parseDouble(dollars.getText().toString());
        double r = Double.parseDouble(rupees.getText().toString());
        if(r!=0 && d==0){
            d=r/64.52;
            dollars.setText(Double.toString(d));
        }
        else if(r==0 && d!=0){
            r=d*64.52;
            rupees.setText(Double.toString(r));
        }
        Log.i("Info","Button clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

