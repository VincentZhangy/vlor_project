package top.vlor.commandmode;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:37 2018/6/21
 * @Modified by：
 */
public class XMLUtil {

    public static Object getBean(int i){
        //创建文档对象
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dbuilder = dbfactory.newDocumentBuilder();
            Document doc;
            doc = dbuilder.parse(new File("config.xml"));

            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = null;
            if(0==i){
                classNode = nl.item(0).getFirstChild();
            }else{
                classNode = nl.item(1).getFirstChild();
            }

            String cName = classNode.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
