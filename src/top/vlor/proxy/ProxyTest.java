package top.vlor.proxy;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 20:56 2018/4/24
 * @Modified by：
 */
public class ProxyTest {

    public static void main(String[] args) {
        IWork iWork = new TeacherWork();
        System.out.println(iWork.getClass());
        iWork.work();

        IWork proxy = (IWork) new ProxyFactory(iWork).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.work();
    }
}
