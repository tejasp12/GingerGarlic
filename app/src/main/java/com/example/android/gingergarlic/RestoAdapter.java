package com.example.android.gingergarlic;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestoAdapter extends ArrayAdapter<Word> {
    private int mColorResourceID;
    //Define Constructor for a class.
    public RestoAdapter(Activity context, ArrayList<Word> listOfArrays,int colorResourceID){
        super(context,0,listOfArrays);
        mColorResourceID = colorResourceID;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        //Get the Word Object located at this position in the list.
        Word currentWord = getItem(position);
        //Find the TextView in the list_item.xml using the ID Resto name.
        TextView restoName = (TextView)convertView.findViewById(R.id.resto_name);
        //Find the TextView in the list_item.xml using the ID Resto Category.
        TextView restoCategory = (TextView)convertView.findViewById(R.id.resto_category);
        //Get the Resto name from the current Word object & set this text on retoName
        //TextView.
        restoName.setText(currentWord.getRestoName());
        //Get the Resto category from the current Word object & set this text on restoCategory
        //TextView.
        restoCategory.setText(currentWord.getRestoCategory());
        //Return the whole list item layout(which contains 2 TextViews)
        //so that it can be shown in the list View.
        ImageView vegIcon = (ImageView)convertView.findViewById(R.id.img_veg);
        vegIcon.setImageResource(currentWord.getVegImageResourceID());
        ImageView nonVegIcon = (ImageView)convertView.findViewById(R.id.img_non_veg);
        nonVegIcon.setImageResource(currentWord.getNonVegImageResourceID());
        //Set the theme color for the list item.
       // View textContainer = convertView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to.
        //int color = ContextCompat.getColor(getContext(),mColorResourceID);
        //Set the background color for the text container view.
       // textContainer.setBackgroundColor(color);
        return convertView;
    }
}
