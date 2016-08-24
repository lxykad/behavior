package com.lxy.behevior;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 2016/8/24.
 */
public class UpBehavior extends CoordinatorLayout.Behavior<View> {

    //此带参构造必须重载
    //因为在CoordinatorLayout里利用反射去获取这个Behavior的时候就是拿的这个构造
    public UpBehavior(Context context, AttributeSet set) {

    }

    //child 设置behavior的view
    // dependency 我们关心的view
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        //设置关联一个textview
        return dependency instanceof TextView;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        int offset = dependency.getTop() - child.getTop();
        ViewCompat.offsetTopAndBottom(child, offset);
        return true;
    }

}
