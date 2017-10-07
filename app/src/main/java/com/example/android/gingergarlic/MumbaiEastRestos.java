package com.example.android.gingergarlic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MumbaiEastRestos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai_east_restos);
        //Create an ArrayList of the Restaurants.
        ArrayList<Word> eastRestos = new ArrayList<Word>();
        //Add elements to the ArrayList.
        eastRestos.add(0, new Word("99 CHINA COTTAGE","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(1, new Word("HOTEL ASHOK","Pure Veg",R.drawable.img_veg_1));
        eastRestos.add(2, new Word("BALLE BELLY","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(3, new Word("CANTON HOUSE","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(4, new Word("CHAAT ON KHAAT","FastFood",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(5, new Word("CHAKH LO! PAAJI","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(6, new Word("FOOD EXPRESS","Pure Veg",R.drawable.img_veg_1));
        eastRestos.add(7, new Word("FUN-DO","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(8, new Word("HOT MEALS","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        eastRestos.add(9, new Word("GRILLED PUNJAB","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));

        RestoAdapter mumbaiEastRestoAdapter = new RestoAdapter(this, eastRestos,R.color.list_item);
        ListView itemsView = (ListView) findViewById(R.id.list_view);
        itemsView.setAdapter(mumbaiEastRestoAdapter);
    }
}
