package top.vlor.flyweight;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 21:54 2018/5/10
 * @Modified by：
 */
public class ConcreteFylWeight implements FlyWeight{

    private Character intrinsicState = null;

    public ConcreteFylWeight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println("Intrinsic state = "+ intrinsicState );
        System.out.println("Extrinsic state = "+state);
    }
}
