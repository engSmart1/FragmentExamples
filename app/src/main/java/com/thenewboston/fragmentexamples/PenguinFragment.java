package com.thenewboston.fragmentexamples;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hytham on 12/1/2016.
 */

public class PenguinFragment extends Fragment {
    public PenguinFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.multi_frag_penguin ,container ,false);


        return rootView;
    }
}

