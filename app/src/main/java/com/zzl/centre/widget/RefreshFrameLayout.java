package com.zzl.centre.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * 项目名: Centre
 * 包名: com.zzl.centre.widget
 * 类名: RefreshFrameLayout
 * 创建者: zL
 * 创建时间: 2016/11/28 13:48
 * 描述:
 */
public class RefreshFrameLayout extends ViewGroup {

    private View ContentView;
    private View HeadView;

    public RefreshFrameLayout(Context context) {
        this(context, null);
    }

    public RefreshFrameLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RefreshFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {

        super.onFinishInflate();
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
