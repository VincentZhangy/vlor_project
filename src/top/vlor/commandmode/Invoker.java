package top.vlor.commandmode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:12 2018/6/21
 * @Modified by：
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
