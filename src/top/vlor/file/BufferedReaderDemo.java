package top.vlor.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("d:\\mydoc\\hello.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            fr.close();
            br.close();
        }catch (Exception e){
            System.out.println("文件不存在");
        }
    }
}
