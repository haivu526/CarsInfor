package com.cars.haivu.carsinfor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity implements OnClickListener{

    public Button buttonmerceId;
    public Button buttonbmwId;
    public Button buttonfordId;
    public Button buttongmcId;
    public Button buttonchevyId;
    public Button buttonlincolnId;
    public Button buttoncadillacId;
    public Button buttonhondaId;
    public Button buttontoyotaId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        buttonmerceId = (Button)findViewById(R.id.buttonmerceId);
        buttonmerceId.setOnClickListener(this);

    }

    public void onClick(View view){
        if(view.getId() == R.id.buttonmerceId){
            Intent intent = new Intent(this,Activity_merc.class);
            startActivity(intent);}



    }
}



