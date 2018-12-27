package top.vlor.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("d:\\mydoc\\hello.txt"));
            System.setOut(ps);
            System.out.print("我的测试，重定向到文件hello");
            ps.close();

            FileInputStream fis = new FileInputStream("d:\\mydoc\\hello.txt");
            System.setIn(fis);
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
