package top.vlor.prototype;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:42 2018/4/3
 * @Modified by：
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous = new WeeklyLog();
        log_previous.setName("张无忌");
        log_previous.setDate("第十二周");
        log_previous.setContent("这周工作蛮忙的");

        System.out.println("****周报****");
        System.out.println("周次："+log_previous.getDate());
        System.out.println("姓名："+log_previous.getName());
        System.out.println("内容："+log_previous.getContent());
        System.out.println("----------------------------");

        WeeklyLog log_New;
        log_New = log_previous.clone();
        log_New.setDate("第十三周");
        System.out.println("****周报****");
        System.out.println("周次："+log_New.getDate());
        System.out.println("姓名："+log_New.getName());
        System.out.println("内容："+log_New.getContent());
    }
}
