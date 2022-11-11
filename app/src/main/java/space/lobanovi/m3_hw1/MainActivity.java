package space.lobanovi.m3_hw1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  private EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edit = findViewById(R.id.edi);

       Button btn = findViewById(R.id.bt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dev = edit.getText().toString();
                Intent intent = new Intent(MainActivity.this, GenerateCode.class);
                intent.putExtra("dev",dev);
                startActivity(intent);
            }
        });
    }
}
