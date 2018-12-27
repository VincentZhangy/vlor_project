package top.vlor.demo;

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("This is targetable method!");
    }
}
