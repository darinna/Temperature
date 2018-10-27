package com.example.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CtoF = findViewById(R.id.cf);
        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.edit_text);
                int number = Integer.parseInt(input.getText().toString());
                double temp = (float) ((number*1.8)+32);

                final TextView output = findViewById(R.id.text_view);
                String show = Integer.toString((int) temp);
                output.setText(show);
            }
        });

        Button FtoC = findViewById(R.id.fc);
        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText input = findViewById(R.id.edit_text);
                int number = Integer.parseInt(input.getText().toString());
                double temp = (float) ((number-32)/1.8);

                final TextView output = findViewById(R.id.text_view);
                String show = null;
                switch (show = show.format("%.2f",temp)) {
                }
                output.setText(show);
            }
        });
    }
}
