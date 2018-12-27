package top.vlor.composite;

import java.io.File;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:56 2018/5/7
 * @Modified by：
 */
public class Clienter {

    public static void main(String[] args) {
        Noder noder = new Noder("D://Mydoc");
        createTree(noder);  //创建目录树形结构
        noder.display();
    }

    private static void createTree(Noder node) {
        File file = new File(node.nodeName);
        File[] files = file.listFiles();
        for(File fie : files){
            if(fie.isFile()){
                Filer filer = new Filer(fie.getAbsolutePath());
                node.addFile(filer);
            }
            if(fie.isDirectory()){
                Noder noder = new Noder(fie.getAbsolutePath());
                node.addNoder(noder);
                createTree(noder);   //使用递归生成树结构
            }
        }
    }
}
