package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_main, btn_sub;
    MainFragment mainFragment;
    SubFragment subFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragment = new MainFragment();
        subFragment = new SubFragment();

        btn_main = findViewById(R.id.btn_main);
        btn_sub = findViewById(R.id.btn_sub);

        btn_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //frame을 mainFragment로 바꿈
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, mainFragment).commit();
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, subFragment).commit();
            }
        });
    }
}
