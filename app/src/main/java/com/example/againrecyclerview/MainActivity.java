package com.example.againrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    adapterSetting adapterSetting;
    List<users> items;
    ProgressBar progressBar;
    Button  gridClick;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    WebView webView;
    GridLayoutManager gridLayoutManager;
    public  boolean statuc=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.web);
        recyclerView = findViewById(R.id.myRecycle);
        gridClick = findViewById(R.id.clickGrid);
        progressBar = findViewById(R.id.progressbar);
         items = new ArrayList<>();

        items.add(new users(1, "google", getResources().getDrawable(R.drawable.google),"https://www.google.com"));
        items.add(new users(2, "facebook", getResources().getDrawable(R.drawable.fb),"https://www.facebook.com"));
        items.add(new users(3, "instagram", getResources().getDrawable(R.drawable.instagram),"https://www.instagram.com"));
        items.add(new users(4, "twitter", getResources().getDrawable(R.drawable.twitter),"https://www.twitter.com"));
        items.add(new users(5, "Linkedin", getResources().getDrawable(R.drawable.linkedin),"https://linkedin.com"));
        items.add(new users(6, "Quora", getResources().getDrawable(R.drawable.quora),"https://www.quora.com"));
        items.add(new users(7, "YouTube", getResources().getDrawable(R.drawable.youtube),"https://www.youtube.com"));
        items.add(new users(8, "Amazon", getResources().getDrawable(R.drawable.amazon),"https://www.amazon.com"));



        linearLayoutManager  = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapterSetting  = new adapterSetting(this,items);
        recyclerView.setAdapter(adapterSetting);
        gridClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(statuc==false){
                    linearLayoutManager  = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL,false);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    statuc=true;
                }else{
                    statuc=false;
                    gridLayoutManager = new GridLayoutManager(MainActivity.this,GridLayoutManager.DEFAULT_SPAN_COUNT);
                    gridLayoutManager.setSpanCount(2);
                    recyclerView.setPadding(0,0,0,0);
                    recyclerView.setLayoutManager(gridLayoutManager);
                }
            }
        });

    }
}
