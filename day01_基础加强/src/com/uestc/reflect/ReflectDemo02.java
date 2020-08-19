package com.uestc.reflect;

import com.uestc.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo02 {
    public static void main(String[] args) throws Exception{
        //0.获取Person的Class对象
        Class<Person> personClass = Person.class;

        //1.获取成员变量
        Field[] fields = personClass.getFields(); //获取所有public修饰的变量
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("================");
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置成员变量a的值
        a.set(p,"miku");
        System.out.println(p);

        System.out.println("=======================");

        //获取所有的成员变量
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }

        Field d = personClass.getDeclaredField("d");
        //暴力反射,忽略权限修饰符
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);

    }
}
