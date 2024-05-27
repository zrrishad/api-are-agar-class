package com.example.apiareagarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    Button edButton;
    TextView tvText;
    EditText edWeek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        edButton=findViewById(R.id.edButton);
        tvText=findViewById(R.id.tvText);
        edWeek=findViewById(R.id.edWeek);


        edButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Number=edWeek.getText().toString();
                if (Number.length()>0){

                    int sNumber=Integer.parseInt(Number);


                    if (sNumber==1){
                        tvText.setText("Sunday");


                    } else if (sNumber==2) {
                        tvText.setText("Monday");

                    } else if (sNumber==3) {
                        tvText.setText("Tuesday");

                    } else if (sNumber==4) {
                        tvText.setText("Wednesday");

                    } else if (sNumber==5) {
                        tvText.setText("Thursday");
                    } else if (sNumber==6) {
                        tvText.setText("Friday");

                    } else if (sNumber==7) {
                        tvText.setText("Saturday");

                    }else {
                        tvText.setText("please enter 1 to 7");
                    }




                }else {
                    edWeek.setError("Please enter 1 to 7");
                }


            }
        });





    }
}