package top.vlor.demo;

import java.util.LinkedList;
import java.util.List;

public class Builder {
    private List<Sender> list = new LinkedList<>();

    public void produceMailSender(int count){
        for(int i =0;i<count;i++){
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for(int i=0;i<count;i++){
            list.add(new SmsSender());
        }
    }
}
