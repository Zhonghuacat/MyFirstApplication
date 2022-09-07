package com.jnu.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = this.findViewById(R.id.text_view_hello_world);
        String strHello = this.getResources().getText(R.string.HelloAndroid).toString();
        textView.setText(strHello);
    }
}