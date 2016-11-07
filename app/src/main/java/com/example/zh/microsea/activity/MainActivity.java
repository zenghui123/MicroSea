package com.example.zh.microsea.activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.RadioGroup;

import com.example.zh.microsea.R;
import com.example.zh.microsea.fragment.CarFragment;
import com.example.zh.microsea.fragment.HomeFragment;
import com.example.zh.microsea.fragment.MuseumFragment;
import com.example.zh.microsea.fragment.MyFragment;

public class MainActivity extends AppCompatActivity {

    View fragment_home;
    FragmentManager fragmentManager;
    RadioGroup radioGroup_home;
    HomeFragment homeFragment;
    MuseumFragment museumFragment;
    CarFragment carFragment;
    MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        radioGroup_home= (RadioGroup) this.findViewById(R.id.radioGroup_home);
        fragment_home=this.findViewById(R.id.fragment_home);
        fragmentManager=MainActivity.this.getFragmentManager();
        initFragment();
        radioGroup_home.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragment_home.setVisibility(View.GONE);
                switch (checkedId) {
                    case R.id.radioButton_home:
                        if (!homeFragment.isAdded()) {
                            fragmentTransaction.replace(R.id.relativeLayout_main, homeFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                        }
                        break;
                    case R.id.radioButton_car:
                        if (!carFragment.isAdded()) {
                            fragmentTransaction.replace(R.id.relativeLayout_main, carFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                        }
                        break;
                    case R.id.radioButton_my:
                        if (!myFragment.isAdded()) {
                            fragmentTransaction.replace(R.id.relativeLayout_main, myFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                        }
                        break;
                    case R.id.radioButton_museum:
                        if (!museumFragment.isAdded()) {
                            fragmentTransaction.replace(R.id.relativeLayout_main, museumFragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                        }
                        break;
                }
            }
        });
    }

    private void initFragment() {
        homeFragment = new HomeFragment();
        myFragment = new MyFragment();
        carFragment = new CarFragment();
        museumFragment = new MuseumFragment();

    }


}
