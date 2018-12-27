package top.vlor.delayquery;

import java.util.concurrent.DelayQueue;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 14:12 2018/9/13
 * @Modified by：
 */
public class Consumer implements Runnable {

    private DelayQueue<Message> queue;

    public Consumer() {
    }

    public Consumer(DelayQueue<Message> queue) {
        this.queue = queue;
    }

        @Override
    public void run() {
        while(true){
            try {
                Message take = queue.take();
                System.out.println("消息需求者获取消息："+take.getId()+":"+take.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
