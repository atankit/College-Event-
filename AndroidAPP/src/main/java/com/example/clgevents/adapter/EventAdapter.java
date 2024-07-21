package com.example.clgevents.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clgevents.R;
import com.example.clgevents.model.Events;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventHolder> {

    private List<Events> eventsList;

    public EventAdapter(List<Events> eventsList) {
        this.eventsList = eventsList;
    }

    @NonNull
    @Override
    public EventHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_event_items, parent, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventHolder holder, int position) {
        Events events = eventsList.get(position);
        holder.title.setText(events.getTitle());
        holder.description.setText(events.getDescription());
        holder.eventfor.setText(events.getEventfor());
        holder.timestamp.setText(events.getTimestamp().toString());


    }

    @Override
    public int getItemCount() {
        return eventsList.size();
    }
}
