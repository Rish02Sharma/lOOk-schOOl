package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PrivateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private);




        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Opp. OTS, K.M. Munshi Marg, Jaipur", "Bharatiya Vidya Bhawan's ", R.drawable.prvt));
        words.add(new Word("Vaishali Nagar", "DAV",R.drawable.prvt));
        words.add(new Word("Ajmeri Gate", "Maharani Gayatri Devi Girls' ", R.drawable.prvt));
        words.add(new Word("mansarovar jaipur", "St. Anslems School", R.drawable.start));
        words.add(new Word("Sector 4, Jawahar Nagar", "Maheshwari Public School", R.drawable.start));
        words.add(new Word("Bajaj Nagar, Tonk Road Jaipur", "Kendriya Vidhyalaya", R.drawable.prvt));
        words.add(new Word("Mahaveer Marg, C - Scheme", "Mahaveer Public School",R.drawable.prvt));
        words.add(new Word("Triveni Nagar, Gopal Pura Bye Pass", "Ryan International School", R.drawable.prvt));
        words.add(new Word("Sawai Ramsingh Road Jaipur", "Sawai Man Singh Vidyalaya", R.drawable.start));
        words.add(new Word("Sector 4 Jawahar Nagar, Jaipu", "Seedling Public School", R.drawable.prvt));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        /**
         * Created by rishabh on 19/5/17.
         */

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);




    }

}