package com.example.reaper.canteenmainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class LunchVegNon extends AppCompatActivity {

    private CardView veg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_lunch_veg_non );
        veg=findViewById( R.id.veg );

        veg.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent veg=new Intent( LunchVegNon.this,Dishes.class );
                startActivity( veg );
            }
        } );
    }
}
