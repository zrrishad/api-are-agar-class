package com.example.apiareagarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText edText;
    TextView tvText;
    Button edButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edText=findViewById(R.id.edText);
        tvText=findViewById(R.id.tvText);
        edButton=findViewById(R.id.edButton);


        edButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number=edText.getText().toString();
                if (number.length()>0){

                    int Nnumber=Integer.parseInt(number);




                    if (Nnumber%5==0 & Nnumber%11==0){
                        tvText.setText("The number is divided with 5 or 11");
                    }else {
                        tvText.setText("The number is not divided with 11 or 5");
                    }




                }else {
                    edText.setError("please enter a number");
                }






            }
        });

    }
}