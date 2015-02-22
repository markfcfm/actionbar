package com.example.dago.primeraparte11;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class action extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_action, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){

           case R.id.menu_new:
               Log.i("ActionBar", "Nuevo!");
               return true;
           case R.id.menu_save:
               Log.i("ActionBar", "Guardar!");
               return true;
           case R.id.menu_settings:
               Log.i("ActionBar", "Settings!");
               return true;
           default:
               return super.onOptionsItemSelected(item);
       }
    }

}
