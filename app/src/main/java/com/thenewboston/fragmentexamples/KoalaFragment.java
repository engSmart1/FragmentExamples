package com.thenewboston.fragmentexamples;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hytham on 12/1/2016.
 */

public class KoalaFragment extends Fragment {


    public KoalaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.multi_frag_koala , null);


        return rootView;
    }
}