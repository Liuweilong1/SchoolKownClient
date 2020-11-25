package com.example.schoolkownclient.Activity.Mylikes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.schoolkownclient.R;

public class MylikesActivity extends AppCompatActivity {

    private ListView likes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylikes);

        likes = findViewById(R.id.mylikeslist);

    }
}
