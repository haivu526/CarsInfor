package com.cars.haivu.carsinfor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;


public class Activity_merc extends AppCompatActivity implements OnClickListener{

    public Button buttonmer2Id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merc);

        buttonmer2Id = (Button)findViewById(R.id.buttonmer2Id);
        buttonmer2Id.setOnClickListener(this);

    }

    public void onClick(View view){
        if(view.getId() == R.id.buttonmer2Id){
            Intent intent = new Intent(this,Activity_mer2.class);
            startActivity(intent);}

    }
}
