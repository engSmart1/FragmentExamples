package com.thenewboston.fragmentexamples;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import net.simonvt.menudrawer.MenuDrawer;

public class MenuDrawerActivity extends AppCompatActivity {
    MenuDrawer mDrawer;
    Fragment fragment;
    FragmentTransaction fragmentTransaction;
    Button btnFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.fragment_menu_drawer);
   /*       btnFirst = (Button) findViewById(R.id.btnSimpleFragPenguin);
      btnFirst.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"wiofrjgi" ,Toast.LENGTH_LONG).show();
              getSupportFragmentManager().beginTransaction().add(R.id.container_z,new KoalaFragment()).commit();
                mDrawer.closeMenu(true);

           }
      });*/


        mDrawer = MenuDrawer.attach(MenuDrawerActivity.this);
        mDrawer.setMenuView(R.layout.menu_drawer);
        mDrawer.setContentView(R.layout.fragment_menu_drawer);

       if (savedInstanceState == null){
           getSupportFragmentManager().beginTransaction().add(R.id.container_c, new PenguinFragment()).commit();
       }

    }

    public void first(View view){

        getSupportFragmentManager().beginTransaction().replace(R.id.container_c,new KoalaFragment()).commit();

        Toast.makeText(getApplicationContext(),"wiofrjgi" , Toast.LENGTH_LONG).show();
        mDrawer.closeMenu(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_menu_drawer , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
            return true;

        }
        return super.onOptionsItemSelected(item);
    }
    /*  public static class PlaceHolderFragment extends Fragment {
        public PlaceHolderFragment(){
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_menu_drawer,container ,false);
            return rootView;
        }
   }*/
}
