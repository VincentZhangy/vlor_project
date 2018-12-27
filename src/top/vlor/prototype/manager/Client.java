package top.vlor.prototype.manager;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 10:32 2018/4/3
 * @Modified by：
 */
public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPrototypeManger();
        OfficialDocument  doc1,doc2,doc3,doc4,doc11,doc12,doc13,doc14;

        doc1  = pm.getOfficialDocument("far");
        doc1.display();
        doc2  = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1  == doc2);

        doc3  = pm.getOfficialDocument("srs");
        doc3.display();
        doc4  = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3  == doc4);
    }
}
