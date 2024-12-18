package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2;
    TextView t1;
    String getNum1,getNum2,result;
    int num1,num2,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);

        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);

        e1=(EditText)findViewById(R.id.n1);
        e2=(EditText)findViewById(R.id.n2);
        t1=(TextView) findViewById(R.id.n3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=e1.getText().toString();
                getNum2=e2.getText().toString();

                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                div=num1/num2;
                result=String.valueOf(div);
                t1.setText(result);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i1);
            }
        });
    }
}