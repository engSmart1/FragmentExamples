package com.thenewboston.fragmentexamples;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Hytham on 12/2/2016.
 */

public class MyViewPagerFragment extends Fragment {

    public static final String POSITION = "position";
    public static final String IMAGE_ID = "imageId";

    public MyViewPagerFragment() {
    }
    public static MyViewPagerFragment newInstance(int position ,int imageId){
        MyViewPagerFragment myFrag = new MyViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt( POSITION ,position);
        bundle.putInt(IMAGE_ID,imageId);
        myFrag.setArguments(bundle);

        return  myFrag;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment1_view_pager, container, false);
        int imageId = getArguments().getInt(IMAGE_ID);
        int position = getArguments().getInt(POSITION) ;


        ImageView iv = (ImageView)rootView.findViewById(R.id.ivViewPager);
        iv.setImageResource(imageId);

        TextView tvCard = (TextView)rootView.findViewById(R.id.tvCardNum);
        tvCard.setText("Number Card: " + position);

        Toast.makeText(getActivity() , "Page Number: " + position,Toast.LENGTH_LONG).show();

        return rootView;
    }
}