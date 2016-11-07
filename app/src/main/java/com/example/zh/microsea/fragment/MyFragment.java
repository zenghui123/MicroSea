package com.example.zh.microsea.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zh.microsea.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.imageView_camera)
    ImageView imageViewCamera;
    @BindView(R.id.button_user)
    Button buttonUser;
    @BindView(R.id.button_money)
    Button buttonMoney;
    @BindView(R.id.button_order)
    Button buttonOrder;
    @BindView(R.id.button_unpay)
    Button buttonUnpay;
    @BindView(R.id.button_unsend)
    Button buttonUnsend;
    @BindView(R.id.button_unget)
    Button buttonUnget;
    @BindView(R.id.button_server)
    Button buttonServer;
    @BindView(R.id.button_shop)
    Button buttonShop;
    @BindView(R.id.button_promo)
    Button buttonPromo;
    @BindView(R.id.button_address)
    Button buttonAddress;
    @BindView(R.id.button_setting)
    Button buttonSetting;

    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my, container, false);


        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.imageView_camera, R.id.button_user, R.id.button_money, R.id.button_order, R.id.button_unpay, R.id.button_unsend, R.id.button_unget, R.id.button_server, R.id.button_shop, R.id.button_promo, R.id.button_address, R.id.button_setting})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView_camera:

                break;
            case R.id.button_user:
                break;
            case R.id.button_money:
                break;
            case R.id.button_order:
                break;
            case R.id.button_unpay:
                break;
            case R.id.button_unsend:
                break;
            case R.id.button_unget:
                break;
            case R.id.button_server:
                break;
            case R.id.button_shop:
                break;
            case R.id.button_promo:
                break;
            case R.id.button_address:
                break;
            case R.id.button_setting:
                break;
        }
    }
}
