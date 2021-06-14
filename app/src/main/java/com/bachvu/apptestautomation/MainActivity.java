package com.bachvu.apptestautomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button   mButton;
    EditText userName;
    EditText passWord;
    TextView mystatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        userName = (EditText) findViewById(R.id.userName);
        passWord = (EditText) findViewById(R.id.passWord);
        mystatus = (TextView) findViewById(R.id.checkStatus);

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Log.d("hellomorning",userName.getText().toString());
                    if(userName.getText().toString().equals("bachvu")  && passWord.getText().toString().equals("bachvu"))
                    {
                        mystatus.setText("PRODUCTS");

                    }
                    else
                    {
                        mystatus.setText("Wrong username and password");
                    }
            }
        });
    }

}