package top.vlor.memento.many;

import java.util.ArrayList;
import java.util.List;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:17 2018/6/25
 * @Modified by：
 */
public class Caretaker {
    private Originator o;
    private List<Memento> mementos = new ArrayList<>();
    private int current;

    /**
     * 构造函数
     * @param o
     */
    public Caretaker(Originator o) {
        this.o = o;
        current = 0;
    }

    /**
     * 创建一个检查点
     * @return
     */
    public int createMemento(){
        Memento memento = o.createMemento();
        mementos.add(memento);
        return current++;
    }

    /**
     * 将发起人恢复到某个检查点
     */
    public void restoreMemento(int index){
        Memento memento = mementos.get(index);
        o.restoreMemento(memento);
    }

    /**
     * 将某个检查点删除
     * @param index
     */
    public void removeMemento(int index){
        mementos.remove(index);
    }
}
