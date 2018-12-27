package top.vlor.memento;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:01 2018/6/25
 * @Modified by：
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento(){
        return this.memento;
    }

    public void saveMemento(Memento memento){
        this.memento = memento;
    }
}
