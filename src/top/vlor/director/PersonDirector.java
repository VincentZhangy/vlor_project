package top.vlor.director;

import top.vlor.director.build.PersonBuild;
import top.vlor.director.pojo.Person;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:23 2018/4/2
 * @Modified by：
 */
public class PersonDirector {
    public Person constructPerson(PersonBuild pb){
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
