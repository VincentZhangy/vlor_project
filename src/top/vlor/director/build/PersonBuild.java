package top.vlor.director.build;

import top.vlor.director.pojo.Person;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:18 2018/4/2
 * @Modified by：
 */
public interface PersonBuild {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();   //组装
}
