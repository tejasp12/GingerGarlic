package com.example.android.gingergarlic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MumbaiCentralRestos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai_central_restos);
        //Create an ArrayList for Central Restos.
        ArrayList<Word> centralRestos = new ArrayList<Word>();
        //Add elements in the ArrayList.
        centralRestos.add(0,new Word("NIKKUS CHINESE","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(1,new Word("HOTEL RASOI","Veg-FastFood",R.drawable.img_veg_1));
        centralRestos.add(2,new Word("ROLLS & MORE","Veg & Non.veg-FastFood",
                R.drawable.img_veg_1,R.drawable.img_non_veg1));
        centralRestos.add(3,new Word("ROYAL TREAT","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(4,new Word("SAI POOJA","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(5,new Word("SAI RAJ","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(6,new Word("SHETTY'S HUNGER PANG","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(7,new Word("SIRU'S MOMO","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(8,new Word("SPICE & RICE","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        centralRestos.add(9,new Word("HOTEL SANMAN","Veg & Non.veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));

        RestoAdapter mumbaiCentralAdapter = new RestoAdapter(this,centralRestos,R.color.list_item);
        ListView itemsView = (ListView)findViewById(R.id.list_view);
        itemsView.setAdapter(mumbaiCentralAdapter);

    }
}
