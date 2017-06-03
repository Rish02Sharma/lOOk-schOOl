package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);




        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Bhagwan Das Road, C-Scheme", "St Xaviers School", R.drawable.religions));
        words.add(new Word("Jain Chatrawas, Jail Lacia Road, Sanghaner", "Digamber Jain Sanskrit Collage", R.drawable.religions));
        words.add(new Word("Kamala Nehru Nagar, Fateh Nagar, Hasanpura", "Madrasa Talimul Quran", R.drawable.religions));
        words.add(new Word("Sodala, Jaipur", "Bhragu Ashram", R.drawable.religions));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words , R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.family);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


    }
}
