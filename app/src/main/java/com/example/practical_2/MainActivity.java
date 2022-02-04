package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void countIncrement(View view)
    {
        TextView t=(TextView) findViewById(R.id.textView2);
        t.setText(count);
        count+=1;
    }

    public void resetButton(View view)
    {
        TextView t=(TextView) findViewById(R.id.textView2);
        t.setText("reset");
        count=0;
    }

}