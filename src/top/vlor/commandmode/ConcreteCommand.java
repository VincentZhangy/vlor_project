package top.vlor.commandmode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:14 2018/6/21
 * @Modified by：
 */
public class ConcreteCommand extends Command {

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.action();
    }
}

class Receiver{
    public void action(){

    }
}
