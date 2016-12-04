package com.thenewboston.fragmentexamples;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simple(View view) {
        Intent intent = new Intent(getApplicationContext(), SimpleFragmentActivity.class);
        Toast.makeText(this, "you are going there !", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void multiple(View view) {
        Intent intent = new Intent(getApplicationContext(), MultiFragActivity.class);
        Toast.makeText(this, "you are going there 2 !", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }

    public void pager(View view) {
        Intent intent = new Intent(getApplicationContext(), ViewPagerActivity.class);
        Toast.makeText(this, "you are going there 3 !", Toast.LENGTH_LONG).show();
        startActivity(intent);

    }
     //
    public void menuDrawer(View view) {
        Intent intent = new Intent(getApplicationContext(), MenuDrawerActivity.class);
        Toast.makeText(this, "you are going there 4 !", Toast.LENGTH_LONG).show();
        startActivity(intent);
    }
}