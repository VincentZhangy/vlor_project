package top.vlor.memento;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:03 2018/6/25
 * @Modified by：
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CaretakerIf c = new CaretakerIf();
        //设置状态为On
        originator.setState("On");
        //创建备忘录
        c.saveMemento(originator.createMemento());
        //设置状态为Off
        originator.setState("Off");
        //恢复备忘录状态
        originator.restoreMemento(c.retrieveMemento());

        System.out.println(originator.getState());
    }
}
