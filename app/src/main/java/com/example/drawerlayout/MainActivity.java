package com.example.drawerlayout;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ActionBarDrawerToggle mToggle;
    private DrawerLayout mDrawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);
        navigationView = (NavigationView) findViewById(R.id.navigationview);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);

            }
        };

        mToggle.syncState();
        mDrawerLayout.setDrawerListener(mToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.one:
                        Toast.makeText(getApplicationContext(),"one",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.two:
                        Toast.makeText(getApplicationContext(),"two",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.three:
                        Toast.makeText(getApplicationContext(),"three",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.four:
                        Toast.makeText(getApplicationContext(),"four",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.five:
                        Toast.makeText(getApplicationContext(),"five",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.six:
                        Toast.makeText(getApplicationContext(),"six",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
