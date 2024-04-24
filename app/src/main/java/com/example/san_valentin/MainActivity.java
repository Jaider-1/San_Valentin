package com.example.san_valentin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageButton4=(ImageButton) findViewById(R.id.imageButton4);

    }
   public void onClick(View view){
        final int imgBtm_1=R.id.imageButton4;
       Intent myIntent;
       myIntent=null;
       if (view.getId()==imgBtm_1){
           myIntent=new Intent(MainActivity.this, flores_del_mundo.class);
           Toast.makeText(this,"flores_del_mundo", Toast.LENGTH_SHORT).show();

       }
       startActivity(myIntent);
   }

}
