package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GovtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govt);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Goner", "Govt Senior Secondary School ", R.drawable.govt));
        words.add(new Word("Jhotwara", "Govt Girls Sinior Sec School", R.drawable.govt));
        words.add(new Word("Murlipura", "Govt Senior Secondary School", R.drawable.govt));
        words.add(new Word("Tonk Road, Jaipur", "Rajsthan Jwayat Shashan Mahavidyalaya", R.drawable.govt));
        words.add(new Word("Sirsi", "Purohit Hari Narayan Govt School", R.drawable.govt));
        words.add(new Word("Bani Park", "Govt Maharani Girls Sec School", R.drawable.govt));




        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.colors);
        listView.setAdapter(adapter);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }
}
