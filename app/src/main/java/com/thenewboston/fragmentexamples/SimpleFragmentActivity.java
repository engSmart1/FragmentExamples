package com.thenewboston.fragmentexamples;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class SimpleFragmentActivity extends AppCompatActivity {
    Button btnPenguin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_simple);

        if (savedInstanceState ==null){
            getSupportFragmentManager().beginTransaction().add(R.id.activity_simple_fragment, new PlaceHolderFragment()).commit();

          /*  btnPenguin = (Button) findViewById(R.id.btnSimpleFragPenguin);
            btnPenguin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toast= makeText(getApplicationContext(), " YOU CLICK ME small " ,Toast.LENGTH_LONG);
                    toast.show();

                }
            });*/
        }

    }
    public static class PlaceHolderFragment extends Fragment {
        public PlaceHolderFragment(){

        }

        @Override
        public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_simple, container, false);

            ImageView iv = (ImageView) rootView.findViewById(R.id.imageView);
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toast= makeText(getActivity(), " My Drawn it's now" ,Toast.LENGTH_LONG);
                    toast.show();

                }
            });
            return rootView;
        }
    }
   public void clickMe(View view){
       Toast.makeText(getBaseContext(), " YOU CLICK ME small PENGUIN " ,Toast.LENGTH_LONG).show();


    }
}
