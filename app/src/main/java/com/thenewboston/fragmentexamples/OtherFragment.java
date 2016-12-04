package com.thenewboston.fragmentexamples;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Hytham on 12/1/2016.
 */

public class OtherFragment extends Fragment {
    public OtherFragment(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.multi_frag_other,container,false);

        Button btnMulti =(Button)rootView.findViewById(R.id.multiBtnOther);
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"YOU CLICK ME OTHER PENGUIN" ,Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
