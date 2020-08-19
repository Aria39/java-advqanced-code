package com.uestc.annotation;

@MyAnno(value=18,per=Person.P1, anno2 = @MyAnno2, strs = {"miku","lin","rin"})
@MyAnno3
public class Worker {
    @MyAnno3
    public String name = "aaa";

    @MyAnno3
    public void show(){

    }
}
