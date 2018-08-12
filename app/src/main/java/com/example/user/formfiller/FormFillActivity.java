package com.example.user.formfiller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;


public class FormFillActivity extends AppCompatActivity {

    EditText fname,lname,address,phone,email;
    String emailstore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_fill);
        fname = (EditText) findViewById(R.id.editText1);
        lname = (EditText) findViewById(R.id.editText2);
        address = (EditText) findViewById(R.id.editText3);
        phone = (EditText) findViewById(R.id.editText4);
        email = (EditText) findViewById(R.id.editText5);

    }

    public void submit(View v)
        {
            String sfname=fname.getText().toString();
            String slname=lname.getText().toString();
            String saddress=address.getText().toString();
            String sphone=phone.getText().toString();
            String emailstore = email.getText().toString() + "@gmail.com";

           Intent in = new Intent(FormFillActivity.this, DisplayActivity.class);
           Bundle bundle= new Bundle();
           bundle.putString("tfname",sfname);
           bundle.putString("tlname",slname);
           bundle.putString("taddress",saddress);
           bundle.putString("tphone",sphone);
           bundle.putString("temailstore",emailstore);
           in.putExtras(bundle);

           startActivity(in);

        }





}
