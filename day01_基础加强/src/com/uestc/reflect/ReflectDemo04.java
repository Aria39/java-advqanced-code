package com.uestc.reflect;

import com.uestc.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception{
        //0.获取Person的Class对象
        Class<Person> personClass = Person.class;

        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat",String.class);
        eat_method2.invoke(p,"shit");

        System.out.println("============================");

        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            //System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        String className = personClass.getName();
        System.out.println(className);
    }
}
