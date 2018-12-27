package top.vlor.commandmode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:31 2018/6/21
 * @Modified by：
 */
public class InvokerQuery {
    private CommandQuery commandQuery;

    public InvokerQuery(CommandQuery commandQuery) {
        this.commandQuery = commandQuery;
    }

    public void setCommandQuery(CommandQuery commandQuery) {
        this.commandQuery = commandQuery;
    }

    public void call(){
        commandQuery.execute();
    }
}
