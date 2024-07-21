package com.example.clgevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.clgevents.model.Events;
import com.example.clgevents.retrifit.EventApi;
import com.example.clgevents.retrifit.RetrofitService;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EventForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_form);

        initializedComponents();
    }

    private void initializedComponents() {

        TextInputEditText inputEditTitle = findViewById(R.id.textfieldTitle);
        TextInputEditText inputEditDesc = findViewById(R.id.textfieldDescription);
        TextInputEditText inputEditFor = findViewById(R.id.textfielFor);
        MaterialButton buttonSave = findViewById(R.id.form_buttonSave);

        RetrofitService retrofitService = new RetrofitService();
        EventApi eventApi = retrofitService.getRetrofit().create(EventApi.class);

        buttonSave.setOnClickListener(view -> {

            String title = String.valueOf(inputEditTitle.getText());
            String description = String.valueOf(inputEditDesc.getText());
            String eventfor = String.valueOf(inputEditFor.getText());

            Events events = new Events();
            events.setTitle(title);
            events.setDescription(description);
            events.setEventfor(eventfor);

            eventApi.save(events).enqueue(new Callback<Events>() {
                @Override
                public void onResponse(Call<Events> call, Response<Events> response) {
                    Toast.makeText(EventForm.this, "Save successfully", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<Events> call, Throwable t) {
                    Toast.makeText(EventForm.this, "Save Failed", Toast.LENGTH_SHORT).show();
                    Logger.getLogger(EventForm.class.getName()).log(Level.SEVERE, "Error Occured",t);
                }
            });



        });

    }
}