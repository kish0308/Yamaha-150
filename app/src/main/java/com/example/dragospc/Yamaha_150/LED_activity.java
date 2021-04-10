package com.example.dragospc.Yamaha_150;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LED_activity extends AppCompatActivity {
    private static Button on1,on2,off1,off2;
    SwitchCompat switchCompat;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_led_activity);

        switchCompat = findViewById(R.id.switchButton);
        imageView = findViewById(R.id.imageView);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));


        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchCompat.isChecked()) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                } else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                }
            }
        });


        on1=(Button) findViewById(R.id.but1on);
        off1=(Button) findViewById(R.id.but1off);
        on2=(Button) findViewById(R.id.but2on);
        off2=(Button) findViewById(R.id.but2off);

        on1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on1 process1 = new on1();
                process1.execute();

            }
        });

        on2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                on2 process1 = new on2();
                process1.execute();

            }
        });

        off1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off1 process1 = new off1();
                process1.execute();

            }
        });

        off2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                off2 process1 = new off2();
                process1.execute();

            }
        });
    }
}
