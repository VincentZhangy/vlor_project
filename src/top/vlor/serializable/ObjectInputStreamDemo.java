package top.vlor.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamDemo {

    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            //创建ObjectInputStream输入流
            ois = new ObjectInputStream(new FileInputStream("D:\\mydoc\\stu.txt"));
            //反序列化，进行强制类型转换
            List<Student> stus = (List<Student>) ois.readObject();
            for(Student stu:stus) {
                System.out.println("姓名为：" + stu.getName());
                System.out.println("年龄为：" + stu.getAge());
                System.out.println("性别为：" + stu.getSex());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
