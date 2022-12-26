package com.example.pcapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Toast;

import com.example.pcapp.botnav_fragments.BagFragment;
import com.example.pcapp.botnav_fragments.BuildFragment;
import com.example.pcapp.drawer_fragments.ProfileFragment;
import com.example.pcapp.drawer_fragments.SettingFragment;
import com.example.pcapp.drawer_fragments.SignupFragment;
import com.example.pcapp.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AppBarConfiguration mAppBarConfiguration;

    private static final int FRAGMENT_HOME = 1;
    private static final int FRAGMENT_SETTING = 2;
    private static final int FRAGMENT_SIGNUP = 3;
    private static final int FRAGMENT_PROFILE = 4;
    private static final int FRAGMENT_BAG = 5;
    private static final int FRAGMENT_NEWS = 6;

    private int currentfragment = FRAGMENT_HOME;
    private NavigationView mNavigationView;
    private BottomNavigationView mBottomNavigationView;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Login first
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab = findViewById(R.id.fab);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        mNavigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        mNavigationView.setNavigationItemSelectedListener(this);

        mBottomNavigationView = findViewById(R.id.bot_nav);
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.bot_home:
                        openHomeFragment();
                        break;
                    case R.id.bot_bag:
                        openBagFragment();
                        break;
                    case R.id.bot_news:
                        openNewsFragment();
                        break;
                    case R.id.bot_profile:
                        openProfileFragment();
                        break;
                }
                return true;
            }
        });

        replaceFragment(new HomeFragment());
        mNavigationView.setCheckedItem(R.id.nav_home);
        //setTitleToolbar();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
        super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search){
            Toast.makeText(this,"Search Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.nav_home:
                openHomeFragment();
                //setTitleToolbar();
                break;
            case R.id.nav_gallery:
                openSettingFragment();
                //setTitleToolbar();
                break;
            case R.id.nav_slideshow:
                openSignupFragment();
                //setTitleToolbar();
                break;
            case R.id.nav_profile:
                openProfileFragment();
                //setTitleToolbar();
                break;
            case R.id.nav_contact:
                Toast.makeText(this,"Gọi ngay 19001508!", Toast.LENGTH_LONG).show();
                break;
            case R.id.nav_about:
                Toast.makeText(this,"App Build PC đi hơi xa!!!", Toast.LENGTH_LONG).show();
                break;
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void openHomeFragment() {
        if (currentfragment != FRAGMENT_HOME){
            replaceFragment(new HomeFragment());
            fab.setImageResource(R.drawable.home);
            currentfragment = FRAGMENT_HOME;
        }
    }
    private void openSettingFragment() {
        if (currentfragment != FRAGMENT_SETTING){
            replaceFragment(new SettingFragment());
            currentfragment = FRAGMENT_SETTING;
        }
    }
    private void openSignupFragment() {
        if (currentfragment != FRAGMENT_SIGNUP){
            replaceFragment(new SignupFragment());
            currentfragment = FRAGMENT_SIGNUP;
        }
    }

    private void openProfileFragment() {
        if (currentfragment != FRAGMENT_PROFILE){
            replaceFragment(new ProfileFragment());
            fab.setImageResource(R.drawable.user);
            currentfragment = FRAGMENT_PROFILE;
        }
    }

    private void openBagFragment() {
        if (currentfragment != FRAGMENT_BAG){
            replaceFragment(new BagFragment());
            fab.setImageResource(R.drawable.bag);
            currentfragment = FRAGMENT_BAG;
        }
    }

    private void openNewsFragment() {
        if (currentfragment != FRAGMENT_NEWS){
            replaceFragment(new BuildFragment());
            fab.setImageResource(R.drawable.newspaper);
            currentfragment = FRAGMENT_NEWS;
        }
    }

    private void replaceFragment (Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment);
        transaction.commit();
    }
//    private void setTitleToolbar(){
//            String title = "";
//            switch (currentfragment){
//                case FRAGMENT_HOME:
//                    title = getString(R.string.menu_home);
//                    break;
//                case FRAGMENT_SETTING:
//                    title = getString(R.string.menu_setting);
//                    break;
//                case FRAGMENT_SIGNUP:
//                    title = getString(R.string.menu_signup);
//                    break;
//                case FRAGMENT_PROFILE:
//                    title = getString(R.string.menu_profile);
//                    break;
//                case FRAGMENT_BAG:
//                    title = getString(R.string.bot_bag);
//                    break;
//                case FRAGMENT_NEWS:
//                    title = getString(R.string.bot_news);
//                    break;
//            }
//            if(getSupportActionBar() != null){
//                getSupportActionBar().setTitle(title);
//            }
//    }
}