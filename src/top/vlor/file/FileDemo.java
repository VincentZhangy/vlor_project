package top.vlor.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileDemo fileDemo = new FileDemo();
        File file = new File("D:\\mydoc\\hello.txt");
        fileDemo.create(file);
        fileDemo.delete(file);
    }

    public void delete(File file) {
        if(file.exists()){
            System.out.println(file.getAbsoluteFile());
            file.delete();
        }
    }

    public void create(File file) throws IOException {
        if(!file.exists())
            file.createNewFile();
    }
}
