package android.application.flora.learnmaithili;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3459004490451586~4860162756s");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final TextView  numbers = (TextView )findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent numbersIntent = new Intent(MainActivity.this , NumbersActivity.class);
                // start new activity
                startActivity(numbersIntent);
            }
        });


        final TextView  colors = (TextView )findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent colorsIntent = new Intent(MainActivity.this , ColorsActivity.class);
                // start new activity
                startActivity(colorsIntent);
            }
        });


        final TextView  family = (TextView )findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent familyIntent = new Intent(MainActivity.this , FamilyActivity.class);
                // start new activity
                startActivity(familyIntent);
            }
        });


        final TextView  clothes = (TextView )findViewById(R.id.clothes);
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent phrasesIntent = new Intent(MainActivity.this , ClothesActivity.class);
                // start new activity
                startActivity(phrasesIntent);
            }
        });
        final TextView  phrases = (TextView )findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent phrasesIntent = new Intent(MainActivity.this , PhrasesActivity.class);
                // start new activity
                startActivity(phrasesIntent);
            }
        });
        final TextView  foods = (TextView )findViewById(R.id.foods);
        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent foodsIntent = new Intent(MainActivity.this , FoodsActivity.class);
                // start new activity
                startActivity(foodsIntent);
            }
        });
        final TextView  days = (TextView )findViewById(R.id.days);
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent daysIntent = new Intent(MainActivity.this , DaysActivity.class);
                // start new activity
                startActivity(daysIntent);
            }
        });
        final TextView  moods = (TextView )findViewById(R.id.moods);
        moods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create a new Intent to open  the @ linkNumbers
                Intent moodsIntent = new Intent(MainActivity.this , MoodsActivity.class);
                // start new activity
                startActivity(moodsIntent);
            }
        });
    }



}
