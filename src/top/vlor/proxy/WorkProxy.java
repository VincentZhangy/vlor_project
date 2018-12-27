package top.vlor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class WorkProxy {
    public IWork work;

    public WorkProxy(IWork work) {
        this.work = work;
    }

    public IWork createProxy(){
        InvocationHandler handler = new WorkHandler(work);
        Class<?>[] iterfaces = new Class[]{IWork.class};
        return (IWork) Proxy.newProxyInstance(IWork.class.getClassLoader(),iterfaces,handler);
    }
}
