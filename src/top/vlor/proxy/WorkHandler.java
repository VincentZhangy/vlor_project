package top.vlor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WorkHandler implements InvocationHandler {
    public IWork work;
    public WorkHandler(IWork work) {
        this.work = work;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preWork();

        Object ret = method.invoke(work,args);
        return ret;
    }

    private void preWork() {
        System.out.println("老师工作之前需要先准备课件，讲义等课件准备");
    }
}
