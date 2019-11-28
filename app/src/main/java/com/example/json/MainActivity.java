package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    String s1 = "{\"employee\":{\"name\":\"Abhishek Saini\",\"salary\":65000}}";
    String s2;
    String s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.t1);
        textView2 = findViewById(R.id.t2);
        try {
            JSONObject jsonObject = new JSONObject(s1);
            JSONObject employee = jsonObject.getJSONObject("employee");
            s2 = employee.getString("name");
            s3 = employee.getString("salary");
            textView1.setText("Name=" + s2);
            textView2.setText("Salary=" + s3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
