package top.vlor.memento.many;

import java.util.ArrayList;
import java.util.List;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:10 2018/6/25
 * @Modified by：
 */
public class Memento {

    private List<String> states;

    private int index;

    /**
     * 构造函数
     * @param states
     * @param index
     */
    public Memento(List<String> states, int index) {
        this.states = new ArrayList<>(states);
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public int getIndex() {
        return index;
    }
}
