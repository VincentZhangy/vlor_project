package top.vlor.test;

import top.vlor.serializable.Student;

import java.io.*;

public class test3 {
    public static void main(String[] args) {
        File file = new File("d:\\mydoc\\stu.txt");
        if(!file.exists()){
            ObjectOutputStream oos = null;
            try{
                oos=new ObjectOutputStream(new FileOutputStream("d:\\mydoc\\stu.txt"));
                Student stu = new Student("娜娜",20,"女");
                System.out.println("姓名为：" + stu.getName());
                System.out.println("年龄为：" + stu.getAge());
                System.out.println("性别为：" + stu.getSex());
                oos.writeObject(stu);
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }else {
            ObjectInputStream ois = null;
            try {
                FileInputStream fis = new FileInputStream("d:\\mydoc\\stu.txt");
                //创建ObjectInputStream对象
                ois = new ObjectInputStream(fis);
                Student stu = (Student) ois.readObject();
                System.out.println("姓名为：" + stu.getName());
                System.out.println("年龄为：" + stu.getAge());
                System.out.println("性别为：" + stu.getSex());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (ois != null) {
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    //删除file文件
    private void delete(File file){
        if(file.exists()){
            file.delete();
        }
    }

    //创建file文件
    private void create(File file) throws IOException {
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
