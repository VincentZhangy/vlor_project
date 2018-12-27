package top.vlor.flyweight;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 22:01 2018/5/10
 * @Modified by：
 */
public class Client {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();
        FlyWeight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
