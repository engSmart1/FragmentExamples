package com.thenewboston.fragmentexamples;

import android.app.Activity;
import android.os.Bundle;

import net.simonvt.menudrawer.MenuDrawer;

/**
 * Created by Hytham on 12/3/2016.
 */

public class ActivityMenuDrawer extends Activity {
    public ActivityMenuDrawer(MenuDrawer mDrawer) {
        this.mDrawer = mDrawer;
    }

    private MenuDrawer mDrawer;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        mDrawer = MenuDrawer.attach(this);
        mDrawer.setContentView(R.layout.activity_menu_drawer);
        mDrawer.setMenuView(R.layout.menu_drawer);

        if (state == null){

        }

    }



}
