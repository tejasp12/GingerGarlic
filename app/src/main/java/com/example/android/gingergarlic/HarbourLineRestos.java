package com.example.android.gingergarlic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HarbourLineRestos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harbour_line_restos);
        //Create an ArrayList for Harbour line Restos.
        ArrayList<Word> harbourLine = new ArrayList<Word>();
        //Add elements in the ArrayList.
        harbourLine.add(0,new Word("SPICIAA","Veg & Non-veg",
                R.drawable.img_veg_1,R.drawable.img_non_veg1));
        harbourLine.add(1,new Word("SPICY VILLAGE","Veg & Non-veg",
                R.drawable.img_veg_1,R.drawable.img_non_veg1));
        harbourLine.add(2,new Word("SRK COASTAL LUNCH HOME","Manglorean",
                R.drawable.img_veg_1,R.drawable.img_non_veg1));
        harbourLine.add(3,new Word("HOTEL SURABHI","Pure Veg",R.drawable.img_veg_1));
        harbourLine.add(4,new Word("THE GREAT CHINA","Veg & Non-veg",
                R.drawable.img_veg_1,R.drawable.img_non_veg1));
        harbourLine.add(5,new Word("VEG BELLY","Pure Veg",R.drawable.img_veg_1));
        harbourLine.add(6,new Word("VISHAL CHINES","Chines",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        harbourLine.add(7,new Word("UTSAV CHINES","Chines",R.drawable.img_veg_1,R.drawable.img_non_veg1));
        harbourLine.add(8,new Word("SHRI SRK RADHAKRISHNA","Pure Veg",R.drawable.img_veg_1));
        harbourLine.add(9,new Word("SOMETHING FISHY SOMETHING YUMMY","Veg & Non-veg",
                R.drawable.img_veg_1,R.drawable.img_non_veg1));
        //Creating Object of ArrayAdapter.
        RestoAdapter restoHarbourAdapter = new RestoAdapter(this,harbourLine,R.color.list_item);
        // Find ListView from the View Hierarchy.
        ListView itemsView = (ListView)findViewById(R.id.list_view);
        //Set ArrayAdapter on the ListView.
        itemsView.setAdapter(restoHarbourAdapter);

    }
}
