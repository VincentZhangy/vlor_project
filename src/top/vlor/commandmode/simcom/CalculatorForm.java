package top.vlor.commandmode.simcom;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 11:49 2018/6/21
 * @Modified by：
 */
public class CalculatorForm {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command){
        this.command = command;
    }

    public void computer(int value){
        int i = command.execute(value);
        System.out.println("执行运算，执行结果为："+i);
    }

    public void undo(){
        int i = command.undo();
        System.out.println("执行撤销，执行结果为："+i);
    }

    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        form.setCommand(command);

        form.computer(10);
        form.computer(20);
        form.undo();
        form.computer(15);
        form.computer(6);
        form.undo();
    }
}
