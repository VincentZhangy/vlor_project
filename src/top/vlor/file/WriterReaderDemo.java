package top.vlor.file;

import java.io.*;

/**
 * 使用BufferedWriter及FileWriter对象向文本文件中写数据，并用BufferedReader 及FileReader对象读取出来显示
 */
public class WriterReaderDemo {
    public static void main(String[] args) {
        String filename = "d:\\mydoc\\hello.txt";
        try {
            //创建一个FileWriter对象
            FileWriter fw = new FileWriter(filename);
            //创建一个BufferedWriter对象
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("大家好！");
            bw.write("我正在学习BufferedWriter.");
            bw.newLine();
            bw.write("请多多指教！");
            bw.newLine();
            bw.flush();
            fw.close();
            bw.close();
        }catch (Exception e){
            System.out.println("写入数据失败！");
        }
        try {
            //创建一个FileReader对象
            FileReader fr = new FileReader(filename);
            //创建一个BufferedReader对象
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine())!=null){
                System.out.println(data);
            }
            fr.close();
            br.close();
        }catch (IOException e){
            System.out.println("读取文件失败！");
        }
    }
}
