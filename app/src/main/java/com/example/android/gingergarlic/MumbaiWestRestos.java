package com.example.android.gingergarlic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MumbaiWestRestos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai_west_restos);
        //Create ArrayList for West Restos.
        ArrayList<Word> westRestos = new ArrayList<Word>();
        westRestos.add(0,new Word("Indian Spices","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(1,new Word("INDIAN ZAIKA","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(2,new Word("HOTEL JEEVAK","Veg-Fast Food",R.drawable.img_veg_1));
        westRestos.add(3,new Word("KISHNA LUNCH HOME","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(4,new Word("MARATHI JEVAN","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(5,new Word("MOMO KING","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(6,new Word("MUMBAI MASALA","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(7,new Word("HOTEL NATRAJ","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(8,new Word("MARGARET FOOD ZONE","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        westRestos.add(9,new Word("MUMBAI'S KITCHEN","Veg & Non-Veg",R.drawable.img_veg_1,
                R.drawable.img_non_veg1));
        //Create an ArrayAdapter.
        RestoAdapter restoWestAdapter = new RestoAdapter(this,westRestos,R.color.list_item);
        //Find ListView in the view hierarchy.
        ListView itemsView = (ListView)findViewById(R.id.list_view);
        //Attach Adapter to the listView.
        itemsView.setAdapter(restoWestAdapter);
    }
}
