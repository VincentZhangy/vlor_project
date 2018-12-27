package top.vlor.commandmode;

import java.util.ArrayList;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 10:22 2018/6/21
 * @Modified by：
 */
public class FBSettingWindow {

    private String title;

    private ArrayList<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton functionButton){
        functionButtons.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton){
        functionButtons.remove(functionButton);
    }

    public void display(){
        System.out.println("显示窗口："+this.title);
        System.out.println("显示功能键：");
        for(FunctionButton functionButton:functionButtons){
            System.out.println(functionButton.getName());
        }
        System.out.println("-----------------------------------------");
    }
}
