package top.vlor.memento.many;

import java.util.ArrayList;
import java.util.List;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:07 2018/6/25
 * @Modified by：
 */
public class Originator {
    private List<String> states;
    //检查点指数
    private int index;

    /**
     * 构造函数
     */
    public Originator() {
        this.states = new ArrayList<>();
        this.index = 0;
    }

    /**
     * 创建一个新的备忘录对象
     * @return
     */
    public Memento createMemento(){
        return new Memento(states,index);
    }

    /**
     * 将发起人恢复到备忘录记录的状态上
     */
    public void restoreMemento(Memento memento){
        states = memento.getStates();
        index = memento.getIndex();
    }

    /**
     * 状态的赋值方法
     * @param state
     */
    public void setStates(String state) {
        states.add(state);
        index++;
    }

    /**
     * 打印所有状态
     */
    public void printStates(){
        System.out.println("检查点共有："+states.size()+"个");
        for(String state:states){
            System.out.println(state);
        }
    }
}
