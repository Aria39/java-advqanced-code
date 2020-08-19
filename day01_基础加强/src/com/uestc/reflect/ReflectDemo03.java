package com.uestc.reflect;

import com.uestc.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception{
        //0.获取Person的Class对象
        Class<Person> personClass = Person.class;

        //获取构造方法
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        //创建对象
        Person person = constructor.newInstance("miku", 26);
        System.out.println(person);

        System.out.println("===========================");
        Constructor<Person> constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        //创建对象
        Person person1 = constructor1.newInstance();
        System.out.println(person1);

        Person person2 = personClass.newInstance();
        System.out.println(person2);
    }
}
