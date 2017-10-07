package com.example.android.gingergarlic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Please select your area",Toast.LENGTH_LONG).show();
        //Create Object from the Area Selection Class.
        //Attach the Object to the view.
        TextView mumbaiEast = (TextView)findViewById(R.id.mumbai_east);
        mumbaiEast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mumbaiEastIntent = new Intent(MainActivity.this,MumbaiEastRestos.class);
                startActivity(mumbaiEastIntent);
            }
        });
        TextView mumbaiWest = (TextView)findViewById(R.id.mumbai_west);
        mumbaiWest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mumbaiWestIntent = new Intent(MainActivity.this,MumbaiWestRestos.class);
                startActivity(mumbaiWestIntent);
            }
        });
        TextView mumbaiCentral = (TextView)findViewById(R.id.mumbai_central);
        mumbaiCentral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mumbaiCentralIntent = new Intent(MainActivity.this,MumbaiCentralRestos.class);
                startActivity(mumbaiCentralIntent);
                
            }
        });
        TextView harbour = (TextView)findViewById(R.id.harbour);
        harbour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent harbourIntent = new Intent(MainActivity.this,HarbourLineRestos.class);
                startActivity(harbourIntent);
            }
        });
    }
}
