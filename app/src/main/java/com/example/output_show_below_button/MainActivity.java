package com.example.output_show_below_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText myEditText,  myEditText2;
    TextView outputTheResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = findViewById(R.id.anything);
        myEditText2 = findViewById(R.id.anything1);
        outputTheResult = findViewById(R.id.anything3);
    }

    public void toastFunction(View view) {
        String name= myEditText.getText().toString();
        String name2= myEditText2.getText().toString();
        outputTheResult.setText(name+" "+name2);
    }
}