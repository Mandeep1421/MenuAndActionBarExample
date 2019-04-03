package com.mandy.menuandactionbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater  mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_main,menu);
        return true;//.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String msg = "";
        switch(item.getItemId())
        {
            case R.id.menuFav:
            msg = "Favorite";
            break;
            case R.id.menuFirst:
                msg = "First";
                break;
            case R.id.menuLoc:
                msg = "Location";
                break;
            case R.id.menuLogout:
                msg = "Logout";
                break;
        }

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

        return super.onOptionsItemSelected(item);
    }
}
