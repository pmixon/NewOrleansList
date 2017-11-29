package com.phillipmixon.neworleanslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView facts = (TextView) findViewById(R.id.facts_menu_item);

        // Set a click listener on that View
        facts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent factsIntent = new Intent(MainActivity.this, FactsActivity.class);

                // Start the new activity
                startActivity(factsIntent);
            }
        });

        TextView historical = (TextView) findViewById(R.id.historial_menu_item);
        historical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historicalIntent = new Intent(MainActivity.this,HistoricalActivity.class);
                startActivity(historicalIntent);
            }
        });

    }
}
