package top.vlor.reflect;

import top.vlor.serializable.Student;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //创建一个Student对象
        Student stu = new Student();
        //获取Student对应的Class对象
        Class cla = Student.class;

        //获取Student类的name属性，使用getDeclaredField()方法可获取各种访问级别的属性
        Field nameField = cla.getDeclaredField("name");
        //设置通过反射访问该Field时取消权限检查
        nameField.setAccessible(true);
        //调用set()方法为stu对象的指定Field设置值
        nameField.set(stu,"Jack");

        //获取Student类的age属性，使用getDeclaredField()方法可获取各种访问级别的属性
        Field ageField = cla.getDeclaredField("age");
        //设置通过反射访问该Field时取消权限检查
        ageField.setAccessible(true);
        //调用setInt()方法为stu对象的指定Field设置值
        ageField.setInt(stu,20);
        System.out.println(stu);
    }
}
