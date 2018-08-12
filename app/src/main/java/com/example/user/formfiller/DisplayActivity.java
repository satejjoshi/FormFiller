package com.example.user.formfiller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
TextView text1, text2, text3, text4, text5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        text1=(TextView) findViewById(R.id.text_View1);
        text2=(TextView) findViewById(R.id.text_View2);
        text3=(TextView) findViewById(R.id.text_View3);
        text4=(TextView) findViewById(R.id.text_View4);
        text5=(TextView) findViewById(R.id.text_View5);
        Bundle bundle= getIntent().getExtras();
        String data1="First Name: "+bundle.getString("tfname");
        String data2="Last Name: "+bundle.getString("tlname");
        String data3="Address: "+bundle.getString("taddress");
        String data4="Phone number: "+bundle.getString("tphone");
        String data5="Email ID: "+bundle.getString("temailstore");

        text1.setText(data1);
        text2.setText(data2);
        text3.setText(data3);
        text4.setText(data4);
        text5.setText(data5);
    }
}
