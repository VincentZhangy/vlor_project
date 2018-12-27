package top.vlor.demo;

import java.util.Scanner;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 17:48 2018/3/23
 * @Modified by：
 */
public class Calculator {
    public static void main(String[] args) {
        forCalculator();
    }

    public static void forCalculator(){
        Scanner in = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        String aritSign = "";
        while (!"end".equals(aritSign)){
            System.out.print("--请输入第一个数字：");
            double numOne = in.nextInt();
            System.out.print("--请输入第二个数字：");
            double numTwo = in.nextInt();
            System.out.print("--请输入要进行的操作：（+    -   *   /）：");
            aritSign = str.nextLine();
            StartCalculator CalObj = new StartCalculator(numOne,numTwo,aritSign);
            System.out.println(CalObj.getSum());
        }
    }
}

class StartCalculator{
    private double numOne;
    private double numTwo;
    private String aritSign;
    private double numEnd;
    public StartCalculator(double numOne,double numTwo,String aritSign){
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.aritSign = aritSign;
        this.calculator();
    }

    private void calculator(){
        switch (this.aritSign){
            case "+":this.numEnd = numOne+numTwo;break;
            case "-":this.numEnd = numOne-numTwo;break;
            case "*":this.numEnd = numOne*numTwo;break;
            case "/":this.numEnd = numOne/numTwo;break;
            default:this.numEnd=0;
        }
    }

    public double getSum(){
        return this.numEnd;
    }
}
