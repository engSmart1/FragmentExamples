package com.thenewboston.fragmentexamples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MultiFragActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_frag);
        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.menuContainer, new MenuFragment()).commit();
        }
    }
}
