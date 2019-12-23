package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.WindowManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.a);
        final EditText y = findViewById(R.id.b);
        final TextView z = findViewById(R.id.c);
        Button add = findViewById(R.id.bt);
        add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(x.getText().toString());
                int b = Integer.parseInt(y.getText().toString());
                z.setText(String.valueOf(a + b));
            }
        });
        
    }
}
