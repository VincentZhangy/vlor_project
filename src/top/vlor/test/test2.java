package top.vlor.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class test2 {
    public static void main(String[] args) {
        try {
            //创建BufferedReader对象
            BufferedReader br = new BufferedReader(new FileReader("c:\\Windows\\win.ini"));

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
