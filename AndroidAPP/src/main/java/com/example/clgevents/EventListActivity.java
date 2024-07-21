package com.example.clgevents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.clgevents.adapter.EventAdapter;
import com.example.clgevents.model.Events;
import com.example.clgevents.retrifit.EventApi;
import com.example.clgevents.retrifit.RetrofitService;
import com.google.android.material.button.MaterialButton;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_list);

        recyclerView = findViewById(R.id.eventlist_recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MaterialButton materialButton = findViewById(R.id.form_buttonAdd);
        materialButton.setOnClickListener(view -> {
            Intent intent = new Intent(this,EventForm.class);
            startActivity(intent);
        });

        loadAllEvents();
    }

    private void loadAllEvents() {

        RetrofitService retrofitService = new RetrofitService();
        EventApi eventApi = retrofitService.getRetrofit().create(EventApi.class);
        eventApi.getAllEvent().enqueue(new Callback<List<Events>>() {
            @Override
            public void onResponse(Call<List<Events>> call, Response<List<Events>> response) {
                populateListView(response.body());
            }

            @Override
            public void onFailure(Call<List<Events>> call, Throwable t) {
                Toast.makeText(EventListActivity.this, "Server Not Working!!", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void populateListView(List<Events> eventsList) {
        EventAdapter eventAdapter = new EventAdapter(eventsList);
        recyclerView.setAdapter(eventAdapter);
    }
}