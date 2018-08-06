package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        android.app.ActionBar actionBar =getActionBar();

        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("One" ,"Eek " ,R.drawable.one));
        words.add(new Word("Two" ,"Doo",R.drawable.two));
        words.add(new Word("Three" ,"Teen ",R.drawable.three));
        words.add(new Word("Four" ,"Chaar ",R.drawable.four));
        words.add(new Word("Five" ,"Paanch ",R.drawable.five));
        words.add(new Word("Six" ,"Che ",R.drawable.six));
        words.add(new Word("Seven" ,"Saat  ",R.drawable.seven));
        words.add(new Word("Eight" ,"Aath ",R.drawable.eight));
        words.add(new Word("Nine" ,"Nav ",R.drawable.nine2));
        words.add(new Word("Ten" ,"Das ",R.drawable.ten));
        WordAdapter adapter = new WordAdapter(this,words  ,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
