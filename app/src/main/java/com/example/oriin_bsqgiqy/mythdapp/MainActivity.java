package com.example.oriin_bsqgiqy.mythdapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int x = 0;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
    }

    public void go(View view)
    {
        button1.setText("This is a click number:"+x );
        x++ ;
        if(x == 6)
        {
            x = 0;
            button1.setText("Enough to click. Go to new start!");
        }
    }
}

