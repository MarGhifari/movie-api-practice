package com.example.movieapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.movieapi.Movies;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RequestQueue requestQueue;
    private List<Movies>moviesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        requestQueue= com.example.movieapi.VolleySingleton.getInstance(this).getRequestQueue();
        moviesList=new ArrayList<>();
        fetchMovies();

    }

    private void fetchMovies() {
        String url = "https://api.themoviedb.org/3/list/3?api_key=ceec81bd3dc9943c5be1a22e965cdba3";
        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        })

    }
}