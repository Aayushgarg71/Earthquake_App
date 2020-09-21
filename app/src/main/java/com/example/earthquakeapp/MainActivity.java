package com.example.earthquakeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Work> earthquakes = new ArrayList<Work>();
        earthquakes.add(new Work("2.3","San Francisco","23 Nov"));
        earthquakes.add(new Work("5.6","London","11 Sep"));
        earthquakes.add(new Work("11.2","Tokyo","12 Jan"));
        earthquakes.add(new Work("3.4","Mexico City","27 Feb"));
        earthquakes.add(new Work("6.7","Moscow","20 Aug"));
        earthquakes.add(new Work("11","Rio de Janeiro","19 Dec"));
        earthquakes.add(new Work("5.5","Paris","25 Jun"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        WorkAdapter we = new WorkAdapter(this,earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(we);
    }
}