package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DaysActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // ArrayList<String> words = new ArrayList<String >();



        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Monday " ,"Soomwaar " ));
        words.add(new Word("Tuesday " ,"MagalWaar "));
        words.add(new Word("Wednesday " ,"Bhudhwaar "));
        words.add(new Word("Thursday " ,"Brahaspatwaar"));
        words.add(new Word("Friday  " ,"Sukrawaar "));
        words.add(new Word("Saturday " ,"Shaniwaar "));
        words.add(new Word("Sunday " ,"Raviwaar"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_days);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}


