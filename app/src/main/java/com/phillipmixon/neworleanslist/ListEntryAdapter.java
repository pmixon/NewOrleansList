package com.phillipmixon.neworleanslist;

/**
 * Created by phill on 11/28/2017.
 */

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ListEntryAdapter extends ArrayAdapter<ListEntry>  {

    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    public ListEntryAdapter(Context context, ArrayList<ListEntry> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_entry, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        ListEntry currentListEntry = getItem(position);

        TextView textOne = (TextView) listItemView.findViewById(R.id.text_one);
        textOne.setText(currentListEntry.getmTextOneId());

        TextView textTwo = (TextView) listItemView.findViewById(R.id.text_two);
        textTwo.setText(currentListEntry.getmTextTwoId());

        TextView textThree = (TextView) listItemView.findViewById(R.id.text_three);
        textThree.setText(currentListEntry.getmTextThreeId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentListEntry.hasImage()) {
            imageView.setImageResource(currentListEntry.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
