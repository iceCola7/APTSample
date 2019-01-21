package com.cxz.apt_processor.utils;

import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * @author admin
 * @date 2019/1/21
 * @desc
 */
public class ElementUtil {

    /**
     * 获取包名
     */
    public static String getPackageName(Elements elementUtils, TypeElement typeElement) {
        return elementUtils.getPackageOf(typeElement).getQualifiedName().toString();
    }

    /**
     * 获取顶层类类名
     */
    public static String getEnclosingClassName(TypeElement typeElement) {
        return typeElement.getSimpleName().toString();
    }

    /**
     * 获取静态内部类类名
     */
    public static String getStaticClassName(TypeElement typeElement) {
        return getEnclosingClassName(typeElement) + "Holder";
    }

}
