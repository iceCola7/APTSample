package com.cxz.butterknife;

import android.app.Activity;
import android.support.v4.app.Fragment;

import java.lang.reflect.Method;

/**
 * @author admin
 * @date 2019/1/21
 * @desc
 */
public class ButterKnife {

    public static void bind(Activity activity) {
        Class clazz = activity.getClass();
        try {
            Class bindViewClass = Class.forName(clazz.getName() + "ViewBinding");
            Method method = bindViewClass.getMethod("bind", activity.getClass());
            method.invoke(bindViewClass.newInstance(), activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void bind(Fragment fragment) {
        Class clazz = fragment.getClass();
        try {
            Class bindViewClass = Class.forName(clazz.getName() + "ViewBinding");
            Method method = bindViewClass.getMethod("bind", fragment.getClass());
            method.invoke(bindViewClass.newInstance(), fragment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
