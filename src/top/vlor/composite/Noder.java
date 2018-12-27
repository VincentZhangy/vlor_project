package top.vlor.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Descreption: 目录节点
 *                  1、目录名
 *                  2、下级文件列表
 *                  3、下级目录列表
 *                  4、新增文件方法
 *                  5、新增目录方法
 *                  6、显示下级内容方法
 * @Author: vlor
 * @Date: Created in 14:31 2018/5/7
 * @Modified by：
 */
public class Noder {
    String nodeName;

    public Noder(String nodeName) {
        this.nodeName = nodeName;
    }

    List<Noder> nodeList = new ArrayList(); //目录的下级目录列表
    List<Filer> fileList = new ArrayList(); //目录的下级文件列表

    //新增目录
    public void addNoder(Noder noder){
        nodeList.add(noder);
    }

    //新增文件
    public void addFile(Filer filer){
        fileList.add(filer);
    }

    //显示下级目录和文件
    public void display(){
        for(Noder noder:nodeList){
            System.out.println(noder.nodeName);
            noder.display();
        }

        for(Filer filer:fileList){
            filer.display();
        }
    }
}
