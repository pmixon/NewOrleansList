package com.phillipmixon.neworleanslist;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_entry_list);

        final ArrayList<ListEntry> listEntries = new ArrayList<ListEntry>();

        listEntries.add(new ListEntry(R.string.opera_title, R.string.opera_text_one));
        listEntries.add(new ListEntry(R.string.poker_title, R.string.poker_text_one));
        listEntries.add(new ListEntry(R.string.super_dome_title, R.string.super_dome_text_one));

        ListEntryAdapter adapter = new ListEntryAdapter(this, listEntries, R.color.facts_colors);

        ListView listView = (ListView) findViewById(R.id.list_entry_list);

        listView.setAdapter(adapter);

    }
}
