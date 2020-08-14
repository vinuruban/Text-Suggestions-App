package com.example.autofiilandautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        String[] friends = {"Vashi", "Sinnu", "Mathu", "Tan", "Navia", "Navi"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, friends);

        autoCompleteTextView.setAdapter(arrayAdapter);

        autoCompleteTextView.setThreshold(1); //By default, 2 characters were needed. i.e. "na", not "n". After setting the threshold, we now only need 1 character for suggestions to pop-up.

    }
}