package top.vlor.file;

import java.io.*;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            //创建流对象
            FileInputStream fis = new FileInputStream("D:\\mydoc\\FileDemo.class");
            DataInputStream dis = new DataInputStream(fis);
            FileOutputStream fos = new FileOutputStream("D:\\mydoc\\temp.class");
            DataOutputStream dos = new DataOutputStream(fos);
            int temp;
            while ((temp=dis.read())!=-1){
                System.out.println(temp);
                dos.write(temp);
            }
            fis.close();
            dis.close();
            fos.close();
            dos.close();
        }catch (Exception e){
            System.out.println("文件读取失败！");
        }

        try{
            //创建流对象
            FileOutputStream out1 = new FileOutputStream("d:\\mydoc\\hello.txt");
            BufferedOutputStream out2 = new BufferedOutputStream(out1);
            DataOutputStream out = new DataOutputStream(out2);
            out.writeByte(1);
            out.writeLong(2);
            out.writeChar('c');
            out.writeUTF("hello你");
            out.flush();
            out1.close();
            out.close();
            out2.close();

            FileInputStream in1 = new FileInputStream("d:\\mydoc\\hello.txt");
            BufferedInputStream in2 = new BufferedInputStream(in1);
            DataInputStream in = new DataInputStream(in2);
            System.out.println(in.readByte());
            System.out.println(in.readLong());
            System.out.println(in.readChar());
            System.out.println(in.readUTF());
            in1.close();
            in2.close();
            in.close();
        }catch (Exception e){

        }
    }
}
