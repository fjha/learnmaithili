package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;



import java.util.ArrayList;

public class ClothesActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // create  word array
        // ArrayList<String> words = new ArrayList<String >();
        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Shirt " ,"Kameez " ));
        words.add(new Word("Pant " ,"Patloon "));
        words.add(new Word("Skirt " ,"Ghaghra "));
        words.add(new Word("Socks " ,"Mooja "));
        words.add(new Word("scarf  " ,"chunni "));
        words.add(new Word("Dress " ,"Poshaak "));
        words.add(new Word("Frock " ,"Faraak "));

        WordAdapter adapter = new WordAdapter(this,words, R.color.category_clothes);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
