package com.example.reaper.canteenmainpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView lunch;
    private CardView brkfst;
    private CardView beverage;
    private CardView fastfood;
    private CardView snacks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        lunch=findViewById( R.id.lunch );
        brkfst=findViewById( R.id.breakFast );
        beverage=findViewById( R.id.beverage );
        fastfood=findViewById( R.id.fastFood );
        snacks=findViewById( R.id.snacks );

        lunch.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent lun=new Intent( MainActivity.this,LunchVegNon.class );
            startActivity( lun );
            }
        } );
    }

}
