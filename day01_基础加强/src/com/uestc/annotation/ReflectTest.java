package com.uestc.annotation;

import java.lang.reflect.Method;

/**
 * 框架类
 */

@Pro(className = "com.uestc.annotation.Demo1", methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1 获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;

        //2.获取上边的注解对象
        //在内存中生成了一个该注解接口的子类实现对象
/*
        public class ProImpl implements Pro{
            public String className(){
                return "com.uestc.annotation";
            }

            public String methodName(){
                return "show";
            }
        }
 */
        Pro an = reflectTestClass.getAnnotation(Pro.class);

        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();

        Class<?> cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }
}
