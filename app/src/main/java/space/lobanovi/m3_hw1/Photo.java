package space.lobanovi.m3_hw1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Photo extends AppCompatActivity {
    TextView x;
    TextView x1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo);
        x = findViewById(R.id.x);
        x1 = findViewById(R.id.x1);
        String s = x1.getText().toString();
        Intent intent = getIntent();
        String dev = s + intent.getStringExtra("dev");
        x.setText(dev);

    }
}


