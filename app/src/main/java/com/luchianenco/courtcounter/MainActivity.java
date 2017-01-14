package com.luchianenco.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int TEAM_A_INDEX = 1;
    public static final int TEAM_B_INDEX = 2;

    int teamAPoints = 0;
    int teamBPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3Points(View view) {
        Button button = (Button) view;
        int tag = Integer.parseInt(button.getTag().toString());

        addPointsToTeam(3, tag);
    }

    public void add2Points(View view) {
        Button button = (Button) view;
        int tag = Integer.parseInt(button.getTag().toString());

        addPointsToTeam(2, tag);
    }

    public void add1Point(View view) {
        Button button = (Button) view;
        int tag = Integer.parseInt(button.getTag().toString());

        addPointsToTeam(1, tag);
    }

    public void resetScore(View view) {
        teamAPoints = 0;
        teamAPoints = 0;
        updateScoreView();
    }

    protected void addPointsToTeam(int points, int team) {
        if (team == TEAM_A_INDEX) {
            teamAPoints += points;
        } else {
            teamBPoints += points;
        }

        updateScoreView();
    }

    protected void updateScoreView() {
        TextView teamAPointsText = (TextView) findViewById(R.id.teamA_points);
        TextView teamBPointsText = (TextView) findViewById(R.id.teamB_points);
        teamAPointsText.setText("" + teamAPoints);
        teamBPointsText.setText("" + teamBPoints);
    }
}
