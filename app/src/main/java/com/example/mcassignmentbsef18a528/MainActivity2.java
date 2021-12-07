package com.example.mcassignmentbsef18a528;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
           listView=findViewById(R.id.list1);
           //
         //assigning list adapter
    }

    class Myadapter extends ArrayAdapter<String>{
           String text[];
           int img1[];
           int img2[];
           Myadapter(Context c,String t[],int i1[],int i2[]){
               super(c,R.layout.customized);



               ArrayList<CustomObject> allObjects = new ArrayList<>();

               allObjects.add("title", "http://url.com"));


               ArrayAdapter<NewsObject> adapter = new ArrayAdapter<NewsObject>(this,
                       android.R.layout.simple_list_item_1, android.R.id.text1, allNews);


               // Assign adapter to ListView
               listView.setAdapter(adapter);


               listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                   @Override
                   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                       Uri uri = Uri.parse( "http://www.google.com" );
                       startActivity(new Intent(Intent.ACTION_VIEW, uri));
                   }
               });
               // add array adapter





           }

    }
}