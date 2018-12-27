package top.vlor.commandmode;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:46 2018/6/21
 * @Modified by：
 */
public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");

        Command command1,command2;
        command1 = (Command) XMLUtil.getBean(0);
        command2 = (Command) XMLUtil.getBean(1);

        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);

        fbsw.display();

        fb1.onClick();
        fb2.onClick();
    }
}
