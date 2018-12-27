package top.vlor.delayquery;

import java.util.concurrent.DelayQueue;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:16 2018/9/13
 * @Modified by：
 */
public class Producer implements Runnable {
    private DelayQueue<Message> queue;

    public Producer(DelayQueue<Message> queue) {
        this.queue = queue;
    }

        @Override
    public void run() {
        //5秒后发送消息
        Message m2 = new Message("2","Tom",5000);
        queue.offer(m2);
        System.out.println("消息生产者往消息队列放置消息："+m2.getId()+":"+m2.getName());
        //3秒后发送消息
        Message m1 = new Message("1","Tom",3000);
        queue.offer(m1);
        System.out.println("消息生产者往消息队列放置消息："+m1.getId()+":"+m1.getName());
    }
}
