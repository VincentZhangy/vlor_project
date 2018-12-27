package top.vlor.proxy;

import org.junit.jupiter.api.Test;

public class DynamicProxy {
    @Test
    public void testWorkProxy(){
        IWork teacherWork = new TeacherWork();
        WorkProxy workProxy = new WorkProxy(teacherWork);
        IWork work = workProxy.createProxy();
        work.work();
    }
}
