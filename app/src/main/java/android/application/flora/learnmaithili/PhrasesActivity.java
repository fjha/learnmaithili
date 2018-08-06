package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Where are you going " ,"ki karai chi "));
        words.add(new Word("What is your name" ,"Aha ke naam ki aeech "));
        words.add(new Word("My name is .." ,"Hamar Naam .."));
        words.add(new Word("How are you feeling " ,"Kena lagai ya?.."));
        words.add(new Word("I'm feeling good  " ,"Theek Chee "));
        words.add(new Word("Are  you coming ?" ,"Ahha aebai "));
        words.add(new Word("yes , I am  coming " ,"Ha ham aebai "));
        words.add(new Word("I'm coming " ,"Abai chi "));
        words.add(new Word("Let's go " ,"Jaie chie "));
        words.add(new Word("Come here " ,"Etta  aau "));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
