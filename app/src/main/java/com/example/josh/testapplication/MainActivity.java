package com.example.josh.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void poopNow(View view) {
//        Toast.makeText(this, "I pooped!!", Toast.LENGTH_SHORT).show();
        Button button = (Button) findViewById(R.id.button);
        EditText et = (EditText) findViewById(R.id.input_number1);
        EditText et2 = (EditText) findViewById(R.id.input_number2);
        String stret = et.getText().toString();
        String stret2 = et2.getText().toString();
        int new_et, new_et2;
        int return_val;
        try {
            new_et = Integer.parseInt(stret);
            new_et2 = Integer.parseInt(stret2);
            return_val = new_et * new_et2;
        }
        catch (NumberFormatException e)
        {
            return_val = 999;
        }

        String return_string = Integer.toString(return_val);

        //int return_val = new_et * new_et2;
        //CharSequence text = et.getText().toString();
        Toast.makeText(this, return_string, Toast.LENGTH_SHORT).show();
    }
}
