package top.vlor.test;

public class AssertTest {
    public static void main(String[] args) {
        asserttest1(0);
        asserttest2(0);
    }

    private static void asserttest1(int a){
        assert a>1;
        //System.out.println(a);
    }

    private static void asserttest2(int b){
        assert b>1:"b小于1";
        //System.out.println(b);
    }
}
