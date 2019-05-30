package com.example.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score_a = 0;
    int score_b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void three_point_b(View view) {
        score_b = score_b + 3;
        displayforteamb(score_b);


    }

    public void two_point_b(View view) {
        score_b = score_b + 2;
        displayforteamb(score_b);
    }

    public void one_point_b(View view) {
        score_b = score_b + 1;
        displayforteamb(score_b);
    }


    public void one_point_a(View view) {
        score_a = score_a + 1;
        displayforteama(score_a);
    }

    public void two_point_a(View view) {
        score_a = score_a + 2;
        displayforteama(score_a);
    }

    public void three_point_a(View view) {
        score_a = score_a + 3;
        displayforteama(score_a);
    }

    public void displayforteamb(int a){
        TextView score_b_textview = (TextView) findViewById(R.id.team_b_score);
        score_b_textview.setText(String.valueOf(a));

    }
    public void displayforteama(int a){
        TextView score_a_textview = (TextView) findViewById(R.id.team_a_score);
        score_a_textview.setText(String.valueOf(a));

    }


    public void reset(View view) {
        if(score_a > score_b){
            Toast.makeText(this,"Team A has Won", Toast.LENGTH_SHORT).show();
        }if(score_a < score_b){
            Toast.makeText(this,"Team B has Won", Toast.LENGTH_SHORT).show();
        }
        if(score_b == score_a){
            Toast.makeText(this,"Tie Between The Team", Toast.LENGTH_SHORT).show();
        }
        score_a = 0;
        score_b = 0;
        TextView score_b_textview = (TextView) findViewById(R.id.team_b_score);
        score_b_textview.setText(String.valueOf(score_b));
        TextView score_a_textview = (TextView) findViewById(R.id.team_a_score);
        score_a_textview.setText(String.valueOf(score_a));

    }

}
