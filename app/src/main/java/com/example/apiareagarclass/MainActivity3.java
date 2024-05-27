package com.example.apiareagarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity3 extends AppCompatActivity {
    EditText edWeight,edFeet,edInch;
     Button edButton;
     TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edWeight=findViewById(R.id.edWeight);
        edFeet=findViewById(R.id.edFeet);
        edInch=findViewById(R.id.edInch);
        edButton=findViewById(R.id.edButton);
        tvText=findViewById(R.id.tvText);



        edButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWeight=edWeight.getText().toString();
                String sFeet=edFeet.getText().toString();
                String sInch=edInch.getText().toString();
                if (sWeight.length()>0&& sFeet.length()>0&&sInch.length()>0){
                    float Feet=Float.parseFloat(sFeet);
                    float Inch=Float.parseFloat(sInch);
                    float Weight=Float.parseFloat(sWeight);

                    float hight=(float)(Feet*0.3048+Inch*0.0254);

                    float bmiIndex=Weight/(hight*hight);
                    tvText.setText("your bmiindex is:"+bmiIndex);



                    if (bmiIndex>24){
                        tvText.setText(bmiIndex+"you are over weight");

                    } else if (bmiIndex>18) {
                        tvText.setText(bmiIndex+"you are perfect");

                    } else {
                        tvText.setText(bmiIndex+"you are under weight");

                    }




                }tvText.setText("please filed it");


            }
        });
    }
}