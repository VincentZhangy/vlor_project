package top.vlor.test;

public class Singleton {

    private static class SingletonFactory{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.instance;
    }

    private Object readResolve(){
        return getInstance();
    }
}
