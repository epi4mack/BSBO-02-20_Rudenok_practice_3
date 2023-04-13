package ru.mirea.rudenok.Lesson3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String date = getIntent().getStringExtra("date");
        String text = "Квадрат значения моего номера по списку в группе составляет 324, а текущее время " + date;

        TextView view = (TextView) findViewById(R.id.textView);
        view.setText(text);
    }
}
