package top.vlor.demo;

public class WrapperTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method2();
        targetable.method1();
    }
}
