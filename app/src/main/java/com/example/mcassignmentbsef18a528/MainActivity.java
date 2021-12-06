package com.example.mcassignmentbsef18a528;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button pracbtn,exambtn,gitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         pracbtn=findViewById(R.id.pracbtn);
         exambtn=findViewById(R.id.exambtn);
         gitbtn=findViewById(R.id.gitbtn);
         pracbtn.setOnClickListener(new View.OnClickListener(){
             @Override
              public void onClick(View v){
                switchpractice();

             }
         });
         exambtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 switchexam();
             }
         });
       gitbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               switchgit();
           }
       });


    }

    private void switchgit() {
        Intent switchActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(switchActivityIntent);
    }

    private void switchexam() {

        Intent switchActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(switchActivityIntent);
    }

    public void switchpractice(){
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);

    }
}