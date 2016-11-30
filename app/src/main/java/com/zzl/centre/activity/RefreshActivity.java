package com.zzl.centre.activity;

import android.os.Bundle;

import com.zzl.centre.R;
import com.zzl.centre.base.BaseActivity;
import com.zzl.centre.refresh.PtrClassicFrameLayout;
import com.zzl.centre.refresh.PtrDefaultHandler;
import com.zzl.centre.refresh.PtrFrameLayout;

public class RefreshActivity extends BaseActivity {

    PtrClassicFrameLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);
        refreshLayout = (PtrClassicFrameLayout) findViewById(R.id.refresh);
        refreshLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                refreshLayout.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refreshLayout.refreshComplete();
                    }
                }, 1000);
            }
        });
    }
}
