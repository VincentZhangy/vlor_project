package top.vlor.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 21:58 2018/5/10
 * @Modified by：
 */
public class FlyWeightFactory {

    private Map<Character,FlyWeight> files = new HashMap<>();

    public FlyWeight factory(Character state){
        FlyWeight fly = files.get(state);
        if(fly==null){
            fly = new ConcreteFylWeight(state);
            files.put(state,fly);
        }
        return fly;
    }
}
