package com.uestc.annotation;

import java.util.Date;

@SuppressWarnings("all")
public class AnnoDemo02 {

    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //代替show1
    }

    public void demo(){
        show1();
    }
}
