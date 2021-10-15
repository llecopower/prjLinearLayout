package com.example.prjlinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvName, tvSport;
    Button btnReturn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initialized();
    }

    private void initialized() {


        btnReturn= findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(this);
        tvSport = findViewById(R.id.tvSport);
        tvName = findViewById(R.id.tvName);
        String name = getIntent().getStringExtra("name");
        String label1 = tvName.getText().toString();
        tvName.setText(label1 + name);

        int idSport = getIntent().getIntExtra("sport", -100);
        String   sport = "No Sport";
        switch (idSport) {

            case R.id.rbSoccer:
                sport = " Soccer";
                break;
            case R.id.rbHandball:
                sport = " HandBall";
                break;
            case R.id.rbHockey:
                sport = " Hockey";
                break;
        }
        tvSport.append(sport);


    }

    @Override
    public void onClick(View view) {
        finish();
    }
}