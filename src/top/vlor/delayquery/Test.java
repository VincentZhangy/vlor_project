package top.vlor.delayquery;

import java.util.concurrent.DelayQueue;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:19 2018/9/13
 * @Modified by：
 */
public class Test {

    public static void main(String[] args){
        DelayQueue<Message> queue = new DelayQueue<Message>();
        new Thread(new Consumer(queue)).start();
//        new Thread(new Producer(queue)).start();

        Message m3 = new Message("3","harry",10000);
        queue.offer(m3);
        Message m4 = new Message("2","harry",8000);
        queue.offer(m4);
    }
}
