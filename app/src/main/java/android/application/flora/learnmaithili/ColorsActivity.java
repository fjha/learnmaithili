package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Red" ,"Laal  ",R.drawable.color_red ));
        words.add(new Word("Yellow" ,"Peeyar ",R.drawable.color_mustard_yellow ));

        words.add(new Word("Green" ,"Hariyar  ",R.drawable.color_green));
        words.add(new Word("Brown" ,"Bhuul ",R.drawable.color_brown));

        words.add(new Word("Black" ,"Kaari ",R.drawable.color_black));
        words.add(new Word("White" ,"Safaid",R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
