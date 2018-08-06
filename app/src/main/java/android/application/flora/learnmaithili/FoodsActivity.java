package android.application.flora.learnmaithili;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // ArrayList<String> words = new ArrayList<String >();
        ArrayList<Word> words =new ArrayList<Word>();
        words.add(new Word("Fruits " ,"Faal " ));
        words.add(new Word("Sugar " ,"Cheeni "));
        words.add(new Word("Salt " ,"Noon "));
        words.add(new Word("Milk " ,"Doodh "));
        words.add(new Word("Vegetables  " ,"Sabzi "));
        words.add(new Word("Sweets " ,"Mithai "));
        words.add(new Word("Bread " ,"Roti "));
        words.add(new Word("Rice " ,"Chaour "));
        words.add(new Word("Daal " ,"Daale "));
        words.add(new Word("Flour " ,"Chikkas "));

        WordAdapter adapter = new WordAdapter(this,words ,R.color.category_foods);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
