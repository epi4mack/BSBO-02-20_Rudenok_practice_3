package ru.mirea.rudenok.favoritebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView2);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Моя любимая книга: %s", university));
        }
    }

    public void send_data(View view)
    {
        EditText text = (EditText) findViewById(R.id.editTextTextPersonName);

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}
