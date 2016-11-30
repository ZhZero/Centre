package com.zzl.centre.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 项目名: Centre
 * 包名: com.zzl.centre.base
 * 类名: BaseActivity
 * 创建者: zL
 * 创建时间: 2016/11/28 11:05
 * 描述: Activity 基类
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void startActivity(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}
