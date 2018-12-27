package top.vlor.commandmode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:34 2018/6/21
 * @Modified by：
 */
public class MinimizeCommand extends Command {
    private WindowHandler whObj;

    public MinimizeCommand() {
        whObj = new WindowHandler();
    }

    @Override
    public void execute() {
        whObj.minimize();
    }
}

class WindowHandler{
    public void minimize(){
        System.out.println("将窗口最小化到托盘！");
    }
}
