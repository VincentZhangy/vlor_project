package top.vlor.memento;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:21 2018/6/25
 * @Modified by：
 */
public class CaretakerIf {
    private MementoIf memento;

    /**
     * 备忘录取值方法
     * @return
     */
    public MementoIf retrieveMemento() {
        return memento;
    }

    /**
     * 备忘录赋值方法
     * @param memento
     */
    public void saveMemento(MementoIf memento){
        this.memento = memento;
    }
}
