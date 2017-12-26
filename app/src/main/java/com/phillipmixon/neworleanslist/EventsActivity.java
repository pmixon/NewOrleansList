package com.phillipmixon.neworleanslist;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_entry_list);

        final ArrayList<ListEntry> listEntries = new ArrayList<ListEntry>();

        listEntries.add(new ListEntry(R.string.aquarium, R.string.aquarium_address, R.string.aquarium_phone, R.mipmap.ic_event_seat_black_24dp));
        listEntries.add(new ListEntry(R.string.preservation_hall, R.string.preservation_hall_address, R.string.preservation_hall_phone, R.mipmap.ic_library_music_black_24dp));

        ListEntryAdapter adapter = new ListEntryAdapter(this, listEntries, R.color.events_colors);

        ListView listView = (ListView) findViewById(R.id.list_entry_list);

        listView.setAdapter(adapter);
    }
}
