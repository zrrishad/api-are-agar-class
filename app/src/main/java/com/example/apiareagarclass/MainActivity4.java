package com.example.apiareagarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.time.Year;

public class MainActivity4 extends AppCompatActivity {
    Button bButton;
    EditText edYear;
    TextView tvText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        bButton=findViewById(R.id.bButton);
        edYear=findViewById(R.id.edYear);
        tvText=findViewById(R.id.tvText);

        bButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String year=edYear.getText().toString();
                if (year.length()>0){

                    int Year=Integer.parseInt(year);


                    if (Year%400==0){
                        tvText.setText("The year is lipyear");

                    } else if (Year%4==0&&Year%100!=0) {
                        tvText.setText("This is a lipyear");

                    }else {
                        tvText.setText("Its not a lipyear");
                    }




                }else {
                    edYear.setError("please enter a year");
                }

            }
        });
    }
}