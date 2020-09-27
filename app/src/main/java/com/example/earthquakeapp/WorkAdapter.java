package com.example.earthquakeapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
          SimpleDateFormat dateFormatter = new SimpleDateFormat("MMM DD, yyyy");
            String dateToDisplay = dateFormatter.format(dt);
            TextView tq2= (TextView) listitemview.findViewById(R.id.date);
            tq2.setText(dateToDisplay);
        SimpleDateFormat dateFormatter1 = new SimpleDateFormat("HH:MM a");
        String dateToDisplay1 = dateFormatter1.format(dt);
        TextView tq3= (TextView) listitemview.findViewById(R.id.time);
        tq3.setText(dateToDisplay1);
            return listitemview;
        }
    }

