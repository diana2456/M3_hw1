package space.lobanovi.m3_hw1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateCode extends AppCompatActivity {
    TextView text;
    TextView text1;
    EditText ed;
    private EditText edit;
    Button btn;
  private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generate_code);

        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);

        String tex = text1.getText().toString();

       Intent intent = getIntent();
       String dev = tex + intent.getStringExtra("dev");
       text.setText(dev);
        OnClickListener();


      textView = findViewById(R.id.r);

    }
    private void OnClickListener(){
         btn = findViewById(R.id.btn);
         ed = findViewById(R.id.ed);
        textView = findViewById(R.id.r);
        edit = findViewById(R.id.edi);

        Random random = new Random();
        int val = random.nextInt(1000001);
        textView.setText(Integer.toString(val));
        btn.setOnClickListener(View -> {
            if(ed.getText().toString().equals(textView.getText())){


                Intent intentFirst = new Intent(GenerateCode.this,Photo.class);
                Intent intent = getIntent();
                String dev = intent.getStringExtra("dev");
                intentFirst.putExtra("dev",dev);
                startActivity(intentFirst);
            }else{
                Toast.makeText(getApplicationContext(), "Неправильный код", Toast.LENGTH_LONG).show();
            }
    });
        }
}

