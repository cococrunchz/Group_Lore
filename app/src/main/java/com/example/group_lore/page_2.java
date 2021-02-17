package com.example.group_lore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class page_2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        Button back = findViewById(R.id.btnback);

        back.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        if (view.getId() == R.id.btnback) {
            //super.onBackPressed();
            Intent g = new Intent(page_2.this,MainActivity.class);
            startActivity(g);
        }
    }
}