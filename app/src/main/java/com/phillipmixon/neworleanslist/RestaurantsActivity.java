package com.phillipmixon.neworleanslist;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_entry_list);

        final ArrayList<ListEntry> listEntries = new ArrayList<ListEntry>();

        listEntries.add(new ListEntry(R.string.commanders_title, R.string.commanders_address, R.string.commanders_phone, R.drawable.ic_local_drink_black_24dp));
        listEntries.add(new ListEntry(R.string.august_title, R.string.august_address, R.string.august_phone, R.drawable.ic_local_drink_black_24dp));

        ListEntryAdapter adapter = new ListEntryAdapter(this, listEntries, R.color.restaurants_colors);

        ListView listView = (ListView) findViewById(R.id.list_entry_list);

        listView.setAdapter(adapter);
    }
}