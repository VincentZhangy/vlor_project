package top.vlor.commandmode;

import java.util.ArrayList;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:28 2018/6/21
 * @Modified by：
 */
public class CommandQuery {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(Command command){
        commands.remove(command);
    }

    public void execute(){
        for(Command command:commands){
            command.execute();
        }
    }
}
