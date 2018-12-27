package top.vlor.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializableObj {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try{
            //创建ObjectOutputStream输出流
            oos=new ObjectOutputStream(new FileOutputStream("d:\\mydoc\\stu.txt"));
            Student stu = new Student("安娜",18,"女");
            Student stu2 = new Student("李丁",17,"男");
            List<Student> list = new ArrayList<>();
            list.add(stu);
            list.add(stu2);
            oos.writeObject(list);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try{
                    oos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
