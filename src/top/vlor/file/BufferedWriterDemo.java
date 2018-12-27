package top.vlor.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\mydoc\\hello.txt"));
            bw.write("hello");
            bw.flush();
            bw.close();
        }catch (IOException e){
            System.out.println("文件写入失败！");
        }
    }
}
