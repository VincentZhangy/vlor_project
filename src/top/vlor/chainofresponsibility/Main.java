package top.vlor.chainofresponsibility;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 16:18 2018/6/19
 * @Modified by：
 */
public class Main {

    public static void main(String[] args) {
        Request request = new Request.Builder().setName("陈赛").setDays(5).setReason("事假").build();
        ChainOfResponsibilityClient chain = new ChainOfResponsibilityClient();
        Result result = chain.execute(request);
        System.out.println("结果："+result.toString());
    }
}
