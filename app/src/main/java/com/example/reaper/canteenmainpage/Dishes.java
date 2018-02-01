package com.example.reaper.canteenmainpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Dishes extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{

    private CardView rice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dishes );
        rice=findViewById( R.id.rice );

    }
    public void showPopup(View v)
    {
        PopupMenu popup=new PopupMenu( this,v );
        popup.setOnMenuItemClickListener( this );
        popup.inflate( R.menu.pop_up );
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText( this,"Enter your Quantity",Toast.LENGTH_LONG ).show();
                return true;
            default:
                return false;
        }
    }
}
