package com.example.zh.microsea.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

import com.example.zh.microsea.R;


public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * 按一次返回键时让当前Activity向右侧滑动消失
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //提示应用程序是否退出
        if(keyCode== KeyEvent.KEYCODE_BACK && event.getAction()==KeyEvent.ACTION_DOWN){
            this.finish();
            overridePendingTransition(R.anim.mainactivity_in,R.anim.loginactivity_out);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
