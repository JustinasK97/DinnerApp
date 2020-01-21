package com.dinner.dinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Button newEntryButton = findViewById(R.id.new_entry_button);
        newEntryButton.setOnClickListener (new View.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent gotoNewEntryActivity = new Intent(SearchActivity.this, NewEntryActivity.class);
            startActivity(gotoNewEntryActivity);
        }
        });
    }
}
