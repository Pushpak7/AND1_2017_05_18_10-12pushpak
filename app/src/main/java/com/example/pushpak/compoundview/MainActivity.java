package com.example.pushpak.compoundview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LayoutInflater inflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layoutRoot = (LinearLayout) findViewById(R.id.layoutRoot);
        inflater = LayoutInflater.from(this);
        View view = inflater.inflate(R.layout.compoundview, layoutRoot, true);


        view.findViewById(R.id.imgfinger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView) findViewById(R.id.textData)).setText("Secured");

            }
        });
    }
}
