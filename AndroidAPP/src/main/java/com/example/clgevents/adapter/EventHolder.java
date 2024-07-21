package com.example.clgevents.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clgevents.R;

public class EventHolder extends RecyclerView.ViewHolder {

    TextView timestamp, title, description, eventfor;

    public EventHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.eventListItem_Title);
        description = itemView.findViewById(R.id.eventListItem_Desc);
        eventfor = itemView.findViewById(R.id.eventListItem_For);
        timestamp = itemView.findViewById(R.id.eventListItem_DateTime);

    }
}
