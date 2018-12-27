package top.vlor.composite;

/**
 * @Descreption: 文件节点
 *                  包含：
 *                      1、文件名
 *                      2、文件显示方法
 * @Author: vlor
 * @Date: Created in 14:50 2018/5/7
 * @Modified by：
 */
public class Filer {
    String fileName;

    public Filer(String fileName) {
        this.fileName = fileName;
    }

    //文件显示方法
    public void display(){
        System.out.println(fileName);
    }
}
