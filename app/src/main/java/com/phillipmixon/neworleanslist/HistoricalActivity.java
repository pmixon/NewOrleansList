package com.phillipmixon.neworleanslist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.list_entry_list);

        final ArrayList<ListEntry> listEntries = new ArrayList<ListEntry>();
        listEntries.add(new ListEntry(R.string.st_louis_cathedral, R.string.st_louis_cathedral_address,
                R.string.st_louis_cathedral_phone, R.drawable.ic_local_see_black_24dp));

        listEntries.add(new ListEntry(R.string.preservation_hall, R.string.preservation_hall_address,
                R.string.preservation_hall_phone, R.drawable.ic_library_music_black_24dp));


        ListEntryAdapter adapter = new ListEntryAdapter(this, listEntries, R.color.historical_colors);


        ListView listView = (ListView) findViewById(R.id.list_entry_list);

        listView.setAdapter(adapter);
    }
}
