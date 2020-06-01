package com.example.payment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;
    TextView t1,t2,t3,t4,t5;
    Animation an;
    ImageView img;
    Button button;
    RelativeLayout r,r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText) findViewById(R.id.etcode1);
        e2=(EditText) findViewById(R.id.etcode2);
        e3=(EditText) findViewById(R.id.etcode3);
        e4=(EditText) findViewById(R.id.etcode4);
        e5=(EditText) findViewById(R.id.etname);
        e6=(EditText) findViewById(R.id.etmonth);
        e7=(EditText) findViewById(R.id.etyear);
        e8=(EditText) findViewById(R.id.etcvv);

        t1=(TextView) findViewById(R.id.tvcode);
        t2=(TextView) findViewById(R.id.tvmonth);
        t3=(TextView) findViewById(R.id.tvyear);
        t4=(TextView) findViewById(R.id.tvname);
        t5=(TextView) findViewById(R.id.tvcvv);

        button=(Button) findViewById(R.id.btn);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                an=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.pushdown);
                r=(RelativeLayout) findViewById(R.id.rl1);
                r.setAnimation(an);

                String code1,code2,code3,code4;
                code1=e1.getText().toString();
                code2=e2.getText().toString();
                code3=e3.getText().toString();
                code4=e4.getText().toString();
                t1.setText(code1 + "\t" +code2 + "\t" + code3 + "\t" + code4);

                String name,month,year,cvv;

                name=e5.getText().toString();
                t4.setText(name);

                month=e6.getText().toString();
                t2.setText(month);

                year=e7.getText().toString();
                t3.setText(year);

                cvv=e8.getText().toString();
                t5.setText(cvv);

            }
        });





    }
}
