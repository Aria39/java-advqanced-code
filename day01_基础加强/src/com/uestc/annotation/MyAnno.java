package com.uestc.annotation;

//自定义注解
public @interface MyAnno {
    //属性列表
    int value();
//    String name() default "miku";
//
    Person per();
    MyAnno2 anno2();
//
    String[] strs();
}
