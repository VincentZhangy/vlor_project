package top.vlor.demo;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        Builder builder = new Builder();
//        builder.produceMailSender(2);

        int i = 0;
        for(printInt(i++),printInt(++i);i<6&&printInt(i++)<5;printInt(++i)){
            printInt(0);
        }

        Map map = new HashMap();
    }

    public static int printInt(int a){
        System.out.print(a);
        return a;
    }
}
