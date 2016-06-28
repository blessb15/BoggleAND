package com.epicodus.boggle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;


import java.util.Random;


import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private ListView mGameList;
    private String[] dice = new String[]{"a", "e", "t", "r", "i", "n", "o", "s", "d", "c", "h", "l", "f", "m", "p", "u",
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

        mGameList = (ListView) findViewById(R.id.listView);

        ButterKnife.bind(this);

        int randomNum1 = (int)(Math.random() * 26 + 1);
        int randomNum2 = (int)(Math.random() * 26 + 1);
        int randomNum3 = (int)(Math.random() * 26 + 1);
        int randomNum4 = (int)(Math.random() * 26 + 1);
        int randomNum5 = (int)(Math.random() * 26 + 1);
        int randomNum6 = (int)(Math.random() * 26 + 1);
        int randomNum7 = (int)(Math.random() * 26 + 1);
        int randomNum8 = (int)(Math.random() * 26 + 1);
        int randomNum9 = (int)(Math.random() * 26 + 1);
        int randomNum10 = (int)(Math.random() * 26 + 1);
        int randomNum11 = (int)(Math.random() * 26 + 1);
        int randomNum12 = (int)(Math.random() * 26 + 1);
        int randomNum13 = (int)(Math.random() * 26 + 1);
        int randomNum14 = (int)(Math.random() * 26 + 1);
        int randomNum15 = (int)(Math.random() * 26 + 1);
        int randomNum16 = (int)(Math.random() * 26 + 1);

        mcol11.setText(dice[randomNum1]);
        mcol12.setText(dice[randomNum2]);
        mcol13.setText(dice[randomNum3]);
        mcol14.setText(dice[randomNum4]);
        mcol21.setText(dice[randomNum5]);
        mcol22.setText(dice[randomNum6]);
        mcol23.setText(dice[randomNum7]);
        mcol24.setText(dice[randomNum8]);
        mcol31.setText(dice[randomNum9]);
        mcol32.setText(dice[randomNum10]);
        mcol33.setText(dice[randomNum11]);
        mcol34.setText(dice[randomNum12]);
        mcol41.setText(dice[randomNum13]);
        mcol42.setText(dice[randomNum14]);
        mcol43.setText(dice[randomNum15]);
        mcol44.setText(dice[randomNum16]);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent refresh = new Intent(MainActivity.this, MainActivity.class);
                startActivity(refresh);
            }
        });

    }
}
