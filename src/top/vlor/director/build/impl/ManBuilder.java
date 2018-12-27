package top.vlor.director.build.impl;

import top.vlor.director.build.PersonBuild;
import top.vlor.director.pojo.Person;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:21 2018/4/2
 * @Modified by：
 */
public class ManBuilder implements PersonBuild {
    Person person;

    public ManBuilder() {
        System.out.println("创建一个人对象");
        person = new Person();
    }

    @Override
    public void buildHead() {
        System.out.println("建造头部部分");
        person.setHead("头部部分");
    }

    @Override
    public void buildBody() {
        System.out.println("建造身体部分");
        person.setBody("身体部分");
    }

    @Override
    public void buildFoot() {
        System.out.println("建造腿部部分");
        person.setFoot("腿部部分");
    }

    @Override
    public Person buildPerson() {
        System.out.println("返回一个人对象");
        return person;
    }
}
