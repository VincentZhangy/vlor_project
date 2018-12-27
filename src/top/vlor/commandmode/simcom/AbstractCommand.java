package top.vlor.commandmode.simcom;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:46 2018/6/21
 * @Modified by：
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
