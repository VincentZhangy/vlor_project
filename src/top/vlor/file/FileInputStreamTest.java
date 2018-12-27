package top.vlor.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("d:\\mydoc\\hello.txt");
        int data;
        System.out.println(fis.available());
        System.out.print("文件内容为：");
        while ((data=fis.read())!=-1){
            System.out.print(data+" ");
        }
        fis.close();
    }
}
