package top.vlor.memento.many;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:22 2018/6/25
 * @Modified by：
 */
public class Client {

    public static void main(String[] args) {
        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        //改变状态
        o.setStates("state 0");
        //建立一个检查点
        c.createMemento();
        o.setStates("state 1");
        c.createMemento();
        o.setStates("state 2");
        c.createMemento();
        o.setStates("state 3");
        c.createMemento();
        o.setStates("state 4");
        c.createMemento();
        o.printStates();
        System.out.println("----------------恢复检查点------------------");
        c.restoreMemento(2);
        o.printStates();
    }
}
