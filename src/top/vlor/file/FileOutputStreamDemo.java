package top.vlor.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\mydoc\\hello.txt");
        FileOutputStream fos = new FileOutputStream(file);
        String str = "abc";
        byte[] bytes = str.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
