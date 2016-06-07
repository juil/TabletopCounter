package com.juilyoon.tabletopcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int player1Score1 = 0;
    int player2Score1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increment(View view) {
        switch (view.getId()) {
            case R.id.increment_player1:
                player1Score1++;
                updateScore(1);
                break;
            case R.id.increment_player2:
                player2Score1++;
                updateScore(2);
                break;
        }
    }

    public void decrement(View view) {
        switch (view.getId()) {
            case R.id.decrement_player1:
                player1Score1--;
                updateScore(1);
                break;
            case R.id.decrement_player2:
                player2Score1--;
                updateScore(2);
                break;
        }
    }

    private void updateScore(int player){
        TextView scoreView;
        switch (player) {
            case 1:
                scoreView = (TextView) findViewById(R.id.player1_score_view);
                scoreView.setText(player1Score1 + "");
                break;
            case 2:
                scoreView = (TextView) findViewById(R.id.player2_score_view);
                scoreView.setText(player2Score1 + "");
                break;
        }
    }

    public void reset(View view) {
        switch (view.getId()) {
            case R.id.reset_player1:
                player1Score1 = 0;
                updateScore(1);
                break;
            case R.id.reset_player2:
                player2Score1 = 0;
                updateScore(2);
                break;
            case R.id.resetAll:
                player1Score1 = 0;
                player2Score1 = 0;
                updateScore(1);
                updateScore(2);
                break;
        }

    }

}
