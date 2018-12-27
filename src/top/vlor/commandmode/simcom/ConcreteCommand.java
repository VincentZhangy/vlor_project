package top.vlor.commandmode.simcom;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:47 2018/6/21
 * @Modified by：
 */
public class ConcreteCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
