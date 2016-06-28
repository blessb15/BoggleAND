package com.epicodus.boggle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;


import java.util.ArrayList;
import java.util.Random;


import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    private ListView mGameList;
    private String[] dice = new String[]{"a", "a", "a", "e", "e", "e", "t", "r", "i", "i", "i", "n", "o", "o", "o", "s", "d", "c", "h", "l", "f", "m", "p", "u", "u", "u",
            "g", "y", "w", "b", "j", "k", "q", "v", "x", "z" };

    @Bind(R.id.refresh) Button refreshButton;


    @Bind(R.id.col11) TextView mcol11;
    @Bind(R.id.col12) TextView mcol12;
    @Bind(R.id.col13) TextView mcol13;
    @Bind(R.id.col14) TextView mcol14;
    @Bind(R.id.col21) TextView mcol21;
    @Bind(R.id.col22) TextView mcol22;
    @Bind(R.id.col23) TextView mcol23;
    @Bind(R.id.col24) TextView mcol24;
    @Bind(R.id.col31) TextView mcol31;
    @Bind(R.id.col32) TextView mcol32;
    @Bind(R.id.col33) TextView mcol33;
    @Bind(R.id.col34) TextView mcol34;
    @Bind(R.id.col41) TextView mcol41;
    @Bind(R.id.col42) TextView mcol42;
    @Bind(R.id.col43) TextView mcol43;
    @Bind(R.id.col44) TextView mcol44;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ArrayList<TextView>letterBoxes = new ArrayList<TextView>();

        letterBoxes.add(mcol11);
        letterBoxes.add(mcol12);
        letterBoxes.add(mcol13);
        letterBoxes.add(mcol14);
        letterBoxes.add(mcol21);
        letterBoxes.add(mcol22);
        letterBoxes.add(mcol23);
        letterBoxes.add(mcol24);
        letterBoxes.add(mcol31);
        letterBoxes.add(mcol32);
        letterBoxes.add(mcol33);
        letterBoxes.add(mcol34);
        letterBoxes.add(mcol41);
        letterBoxes.add(mcol42);
        letterBoxes.add(mcol43);
        letterBoxes.add(mcol44);

        for(int i = 0; i < letterBoxes.size(); i++){
            int randomNum = (int)(Math.random() * 35 + 1);
            letterBoxes.get(i).setText(dice[randomNum]);
            Log.d("array", letterBoxes.get(i).toString());
        }

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refresh = new Intent(MainActivity.this, MainActivity.class);
                startActivity(refresh);
            }
        });

    }
}
