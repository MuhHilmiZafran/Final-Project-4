package com.mbkm.project4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details_activity extends AppCompatActivity {

    ImageView image;
    TextView name, desk, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        image = findViewById(R.id.imageView3);
        name = findViewById(R.id.textView6);
        desk = findViewById(R.id.textView10);
        price = findViewById(R.id.textView11);

        getIncomingExtra();
    }

    private void getIncomingExtra() {

        if (getIntent().hasExtra("busName") && getIntent().hasExtra("desk")){


            String name  = getIntent().getStringExtra("busName");
            String desk = getIntent().getStringExtra("desk");
            String price  = getIntent().getStringExtra("price");
            //Integer image = Integer.valueOf(getIntent().getStringExtra("busImage"));

            setDataActivityBus(name, desk, price);
        }
        if (getIntent().hasExtra("placeName") && getIntent().hasExtra("countryName")){


            String name  = getIntent().getStringExtra("placeName");
            String desk = getIntent().getStringExtra("countryName");
            String price  = getIntent().getStringExtra("price");
            //Integer image = Integer.valueOf(getIntent().getStringExtra("busImage"));

            setDataActivityBus(name, desk, price);
        }

    }

    private void setDataActivityBus(String mName, String mDesk, String mPrice/*, Integer mImage*/) {
        name.setText(mName);
        desk.setText(mDesk);
        price.setText(mPrice);
        //busName.setText(mImage);
    }


}