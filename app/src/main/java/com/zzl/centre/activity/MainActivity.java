package com.zzl.centre.activity;

import android.os.Bundle;
import android.view.View;

import com.zzl.centre.R;
import com.zzl.centre.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void refresh(View view) {
        startActivity(RefreshActivity.class);
    }
}
