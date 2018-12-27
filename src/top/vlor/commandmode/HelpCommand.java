package top.vlor.commandmode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:31 2018/6/21
 * @Modified by：
 */
public class HelpCommand extends Command {
    private HelpHandler hhObj;

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    @Override
    public void execute() {
        hhObj.display();
    }
}

class HelpHandler{
    public void display(){
        System.out.println("显示帮助文档！");
    }
}
