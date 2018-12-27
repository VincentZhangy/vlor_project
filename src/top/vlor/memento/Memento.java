package top.vlor.memento;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:58 2018/6/25
 * @Modified by：
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
