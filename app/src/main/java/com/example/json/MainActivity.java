package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    String s1 = "{\"employee\":{\"name\":\"Abhishek Saini\",\"salary\":65000}}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.t1);
        textView2 = findViewById(R.id.t2);
        try {
            JSONObject jsonObject = new JSONObject(s1);
            JSONObject emp = jsonObject.getJSONObject("employee");//using getJsonObject()
            String s2 = emp.getString("name");
            String s3 = emp.getString("salary");
            textView1.setText("Name is:=" + s2);
            textView2.setText("Salary is:=" + s3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
