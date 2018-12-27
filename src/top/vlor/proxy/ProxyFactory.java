package top.vlor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 17:41 2018/4/23
 * @Modified by：
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
            target.getClass().getClassLoader(),
            target.getClass().getInterfaces(),
            new InvocationHandler(){
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    System.out.println("开启事务！");
                    Object returnValue = method.invoke(target,args);
                    System.out.println("提交事务！");
                    return returnValue;
                }
            }
        );
    }
}
