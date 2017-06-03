package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Varun Path Opp. Vishwakerma Mandir Mansarova", "Rudraksh Sports Academy"));
        words.add(new Word("Morda House, Tara Nagar-A, Khirni Phatak Road, Jhotwara", "Eklavya Sports Shooting Academy"));
        words.add(new Word("Sirsi Road, Hanuman Nagar Extension,, Sirsi Rd", "Sanskar's Vision Sports Academy"));
        words.add(new Word(" A-79, Lalarpura, Jaipur", "Sanctuary Cricket Academy"));
        words.add(new Word("Opp. Indian Marriage Garden, Shyam Nagar, Jaipur", "Ace Badminton Academy"));
        words.add(new Word("Surya Path, Tilaknagar, Behind Lbs College, Surya Path", "Ashita Sports Academy"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words , R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.phrases);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }
}
