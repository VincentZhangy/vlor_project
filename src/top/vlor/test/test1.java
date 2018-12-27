package top.vlor.test;

import top.vlor.file.FileDemo;

import java.io.*;
import java.lang.reflect.Method;

public class test1 {
    public static void main(String[] args) {
        try {
            //创建一个FileReader对象
            FileReader fr = new FileReader("d:\\mydoc\\file2.txt");
            //创建一个BufferedReader对象
            BufferedReader br = new BufferedReader(fr);

            //创建一个BufferedWriterd对象
            BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\mydoc\\file1.txt"));

            String line = br.readLine();
            while (line!=null){
                bw.write(line);
                bw.newLine();
                System.out.println(line);
                line = br.readLine();
            }
            bw.flush();
            fr.close();
            br.close();
            bw.close();
            Class cla = Class.forName("top.vlor.file.FileDemo");
            Method method = cla.getMethod("delete", File.class);
            FileDemo fileDemo = new FileDemo();
            File file = new File("d:\\mydoc\\file2.txt");
            Object o = method.invoke(fileDemo,file);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
