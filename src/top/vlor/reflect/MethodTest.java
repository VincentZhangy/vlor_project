package top.vlor.reflect;

import top.vlor.serializable.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取Student对应的Class对象
        Class cla = Student.class;
        //创建Student对象
        Student stu = new Student();
        //得到setName方法
        Method method1 = cla.getMethod("setName", String.class);
        //调用setName，为name赋值
        method1.invoke(stu,"Jack");

        //得到getName方法
        Method method = cla.getMethod("getName",null);
        //调用getName，得到name的值
        Object o = method.invoke(stu,null);
        System.out.println(stu);
    }
}
