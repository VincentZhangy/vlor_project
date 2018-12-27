package top.vlor.reflect;

import java.lang.reflect.Constructor;
import java.util.Date;

public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        //获取Date对应的Class对象
        Class cla = Date.class;
        //获取Date中带一个长整型参数的构造方法
        Constructor cu = cla.getConstructor(long.class);
        //调用Constructor的newInstance()方法创建对象
        Date d = (Date) cu.newInstance(1987);
        System.out.println(d.toString());
    }
}
