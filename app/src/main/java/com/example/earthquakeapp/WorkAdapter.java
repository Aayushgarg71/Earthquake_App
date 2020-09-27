package com.example.earthquakeapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class WorkAdapter extends ArrayAdapter<Work> {
public WorkAdapter(Activity context, ArrayList<Work> word){
    super(context, 0, word );
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemview = convertView;
        if(listitemview == null){
            listitemview= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);}
            Work wq = getItem(position);
            TextView tq= (TextView) listitemview.findViewById(R.id.magnitude);
            tq.setText(wq.getmag().toString());
            TextView tq1= (TextView) listitemview.findViewById(R.id.location);
            tq1.setText(wq.getloc());
            Date dt = new Date(wq.getDate());
          SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM dd, yyyy");
            String dateToDisplay = dateFormatter.format(dt);
            TextView tq2= (TextView) listitemview.findViewById(R.id.date);
            tq2.setText(dateToDisplay);
        SimpleDateFormat dateFormatter1 = new SimpleDateFormat("HH:MM a");
        String dateToDisplay1 = dateFormatter1.format(dt);
        TextView tq3= (TextView) listitemview.findViewById(R.id.time);
        tq3.setText(dateToDisplay1);



        GradientDrawable magnitudeCircle = (GradientDrawable) tq.getBackground();


        int magnitudeColor = getMagnitudeColor(wq.getmag());


        magnitudeCircle.setColor(magnitudeColor);

        return listitemview;
        }
    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
    }

