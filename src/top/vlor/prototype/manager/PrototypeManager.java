package top.vlor.prototype.manager;

import java.util.Hashtable;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:12 2018/4/3
 * @Modified by：
 */
public class PrototypeManager {
    //定义一个Hashtable,用户存储原型对象
    private Hashtable ht = new Hashtable();

    private PrototypeManager(){
        ht.put("srs",new SRS());
        ht.put("far",new FAR());
    }

    private static PrototypeManager pm = new PrototypeManager();

    public void addOfficialDocument(String key,OfficialDocument doc){
        ht.put(key,doc);
    }

    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument) ht.get(key)).clone();
    }


    public static PrototypeManager getPrototypeManger(){
        return pm;
    }
}
