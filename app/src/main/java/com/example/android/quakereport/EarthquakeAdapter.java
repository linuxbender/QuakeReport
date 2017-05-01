package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOCATION_SEPARATOR = " of ";

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> objects) {
        super(context, R.layout.list_item, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // get current Item
        final Earthquake earthquake = getItem(position);
        Date eventDate = new Date(earthquake.getEventDate());
        String locationData;
        String offsetData;

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(earthquake.getMagnitude());

        if (earthquake.getEventLocation().contains(LOCATION_SEPARATOR)) {
            String[] data = earthquake.getEventLocation().split(LOCATION_SEPARATOR, 2);
            locationData = data[0] + LOCATION_SEPARATOR;
            offsetData = data[1];
        } else {
            locationData = earthquake.getEventLocation();
            offsetData = getContext().getString(R.string.near_the);
        }

        TextView eventOffsetTextView = (TextView) listItemView.findViewById(R.id.eventOffset);
        eventOffsetTextView.setText(offsetData);

        TextView eventLocationTextView = (TextView) listItemView.findViewById(R.id.eventLocation);
        eventLocationTextView.setText(locationData);

        TextView eventDateTextView = (TextView) listItemView.findViewById(R.id.eventDate);
        eventDateTextView.setText(formatDate(eventDate));

        TextView eventTimeTextView = (TextView) listItemView.findViewById(R.id.eventTime);
        eventTimeTextView.setText(formatTime(eventDate));

        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Return the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }
}
