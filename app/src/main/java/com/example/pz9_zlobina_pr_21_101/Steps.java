package com.example.pz9_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Steps extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        View vie = findViewById(R.id.view2);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.view2){
            Intent intent = new Intent(this, Map.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}