package com.example.api1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.api1.model.movie;
import com.example.api1.network.api;
import com.example.api1.network.apimovie;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView movieTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieTextView = findViewById(R.id.movieTextView);

        apimovie apiService = api.getapi().create(apimovie.class);
        Call<List<movie>> call = apiService.getmovie();
        call.enqueue(new Callback<List<movie>>() {
            @Override
            public void onResponse(Call<List<movie>> call, Response<List<movie>> response) {
                if (response.isSuccessful()) {
                    List<movie> movies = response.body();
                    StringBuilder stringBuilder = new StringBuilder();
                    for (movie movie : movies) {
                        stringBuilder.append("ID: ").append(movie.getId()).append("\n");
                        stringBuilder.append("Nombre: ").append(movie.getNombre()).append("\n");
                        stringBuilder.append("Categoría: ").append(movie.getCataegoria()).append("\n");
                        stringBuilder.append("Estado: ").append(movie.getEstado()).append("\n");
                        stringBuilder.append("Descripción: ").append(movie.getDescripcion()).append("\n\n");
                    }
                    movieTextView.setText(stringBuilder.toString());
                } else {
                    Toast.makeText(MainActivity.this, "Error: " + response.code(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<movie>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}