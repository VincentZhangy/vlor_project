package top.vlor.chainofresponsibility;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:28 2018/6/19
 * @Modified by：
 */
public interface Ratify {

    public Result deal(Chain chain);

    interface Chain{
        Request request();

        Result proceed(Request request);
    }
}
