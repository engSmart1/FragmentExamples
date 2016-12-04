package com.thenewboston.fragmentexamples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hytham on 12/1/2016.
 */

public class MenuFragment extends Fragment {
    Fragment frag;
    FragmentTransaction fragmentTransaction;

    public MenuFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.multi_menu ,container,false);

        frag = new KoalaFragment();
        fragmentTransaction = getFragmentManager().beginTransaction().add(R.id.container, frag);
        fragmentTransaction.commit();


        Button btnKoala = (Button)view.findViewById(R.id.buttonKoala);
        Button btnPenguin = (Button)view.findViewById(R.id.buttonPenguin);
        Button btnOther = (Button)view.findViewById(R.id.buttonOther);

        btnKoala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new KoalaFragment();
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container, frag);
                fragmentTransaction.commit();
            }
        });
        btnPenguin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new PenguinFragment();
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragmentTransaction.commit();

            }
        });
        btnOther.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frag = new OtherFragment();
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.container,frag);
                fragmentTransaction.commit();

            }
        });
        return view;
    }
}
