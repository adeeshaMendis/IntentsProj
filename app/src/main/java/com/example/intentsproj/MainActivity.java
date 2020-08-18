package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ObjectInputStream;

public class MainActivity extends AppCompatActivity {

    String userIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                CharSequence message = "Sending a message";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, message, duration);
                toast.show();

                int result = (String)findViewById(R.id.editTextNumber);;
                Intent i = new Intent(MainActivity.this, SecondaryActivity.class);
                i.putExtra("editTextNumber", result);
                startActivity(i);

            }


        });


        }
    }


