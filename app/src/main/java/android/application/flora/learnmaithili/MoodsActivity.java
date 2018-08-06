package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // ArrayList<String> words = new ArrayList<String >();
        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Happy " ,"Khush " ,R.drawable.happy));
        words.add(new Word("Angry " ,"Krodhit ",R.drawable.angry));
        words.add(new Word("Surprised " ,"Chakit ",R.drawable.surprised));
        words.add(new Word("Amazed " ,"Achambhit ",R.drawable.amazed));
        words.add(new Word("Sad  " ,"udaas ",R.drawable.sad));
        words.add(new Word("Fear " ,"Bhaibheet ",R.drawable.fear));
        words.add(new Word("Joy " ,"Anand ",R.drawable.happy));
        words.add(new Word("Anxious " ,"Aakul ",R.drawable.worried));
        WordAdapter adapter = new WordAdapter(this,words ,R.color.category_moods);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
