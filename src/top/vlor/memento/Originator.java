package top.vlor.memento;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 13:58 2018/6/25
 * @Modified by：
 */
public class Originator {

    private String state;

    public MementoIf createMemento(){
        return new Memento(state);
    }

    public void restoreMemento(MementoIf memento){
        this.setState(((Memento)memento).getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态："+this.state);
    }

    private class Memento implements MementoIf {
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
}
