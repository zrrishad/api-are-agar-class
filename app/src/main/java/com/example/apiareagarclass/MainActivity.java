package com.example.apiareagarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    GridView edList;


    HashMap<String,String>hashMap=new HashMap<>();

    ArrayList< HashMap<String,String>>arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edList=findViewById(R.id.edList);
        MyAdapter myAdapter=new MyAdapter();
        createtable();

        edList.setAdapter(myAdapter);
    }
    public class MyAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {
            LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView=layoutInflater.inflate(R.layout.layout1,viewGroup,false);

            HashMap<String,String>hashMap=arrayList.get(position);

            TextView itemTitle=myView.findViewById(R.id.itemTitle);
            ImageView itemImage=myView.findViewById(R.id.itemImage);
            LinearLayout edLay=myView.findViewById(R.id.edLay);

            String Title=hashMap.get("Title");


            itemTitle.setText(Title);


edLay.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        if (Title.contains("214.1")){

            Intent myIntent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(myIntent);

        } else if (Title.contains("214.2")) {
            Intent myIntent=new Intent(MainActivity.this,MainActivity3.class);
            startActivity(myIntent);

        } else if (Title.contains("214.3")) {
            Intent myIntent=new Intent(MainActivity.this,MainActivity4.class);
            startActivity(myIntent);

        } else if (Title.contains("214.4")) {
            Intent myIntent=new Intent(MainActivity.this,MainActivity5.class);
            startActivity(myIntent);

        }


    }
});



            return myView;




        }
    }

///////////////////////////////////////
    private void createtable(){
        hashMap=new HashMap<>();
        hashMap.put("image_url","");
        hashMap.put("Title","214.1");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","214.2");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("Title","214.3");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("Title","214.4");
        arrayList.add(hashMap);


    }










}