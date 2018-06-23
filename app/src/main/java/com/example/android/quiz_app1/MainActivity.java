package com.example.android.quiz_app1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView userScore;
    RadioButton q1, q2, q3, q4, q5, q6, q7;
    int score = 0;
    CheckBox a1, b1, c1, d1, a2, b2, c2, d2;
    EditText answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Radiobuttons

        q1 = (RadioButton) findViewById(R.id.correct1);
        q2 = (RadioButton) findViewById(R.id.correct2);
        q3 = (RadioButton) findViewById(R.id.correct3);
        q4 = (RadioButton) findViewById(R.id.correct4);
        q5 = (RadioButton) findViewById(R.id.correct5);
        q6 = (RadioButton) findViewById(R.id.correct6);
        q7 = (RadioButton) findViewById(R.id.correct7);

        //  Check Box
        a1 = (CheckBox) findViewById(R.id.correct8_a1);
        b1 = (CheckBox) findViewById(R.id.correct8_b1);
        c1 = (CheckBox) findViewById(R.id.correct8_c1);
        d1 = (CheckBox) findViewById(R.id.correct8_d1);
        a2 = (CheckBox) findViewById(R.id.correct9_a2);
        b2 = (CheckBox) findViewById(R.id.correct9_b2);
        c2 = (CheckBox) findViewById(R.id.correct9_c2);
        d2 = (CheckBox) findViewById(R.id.correct9_d2);
        // EditText
        answer = (EditText) findViewById(R.id.correct10);
    }
    public void submit(View view) {

        if (q1.isChecked()) {
            score += 1;
        }

        if (q2.isChecked()) {
            score += 1;
        }

        if (q3.isChecked()) {
            score += 1;
        }

        if (q4.isChecked()) {
            score += 1;
        }

        if (q5.isChecked()) {
            score += 1;
        }

        if (q6.isChecked()) {
            score += 1;
        }

        if (q7.isChecked()) {
            score += 1;
        }

        if (a1.isChecked() && b1.isChecked() && !c1.isChecked() && !d1.isChecked()) {
            score += 1;
        } else {
            score += 0;
        }
        if (a2.isChecked() && b2.isChecked() && c2.isChecked() && !d2.isChecked()) {
            score += 1;
        } else {
            score += 0;
        }
        if (answer.getText().toString().equals("C.V.Vishveshwara") || answer.getText().toString().equals("C.V.Vishveshwara") || answer.getText().toString().equals("C.V.Vishveshwara")) {
            score += 1;
        } else {
            score += 0;
        }
        Toast.makeText(this, "You Scored: " + score, Toast.LENGTH_SHORT).show();
    }
}


