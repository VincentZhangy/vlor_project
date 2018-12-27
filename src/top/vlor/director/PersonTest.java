package top.vlor.director;

import top.vlor.director.build.impl.ManBuilder;
import top.vlor.director.pojo.Person;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:26 2018/4/2
 * @Modified by：
 */
public class PersonTest {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person man = pd.constructPerson(new ManBuilder());
        System.out.println(man.getHead());
        System.out.println(man.getBody());
        System.out.println(man.getFoot());
    }
}
