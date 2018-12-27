package top.vlor.chainofresponsibility;

import java.util.List;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:42 2018/6/19
 * @Modified by：
 */
public class RealChain implements Ratify.Chain {
    public Request request;
    public List<Ratify> ratifyList;
    public int index;

    /**
     * 构造方法
     * @param request       具体的请求Request实例
     * @param ratifyList    Ratify接口的实例类集合
     * @param index         已经处理过该request的责任人数量
     */
    public RealChain(Request request, List<Ratify> ratifyList, int index) {
        this.request = request;
        this.ratifyList = ratifyList;
        this.index = index;
    }

    @Override
    public Request request() {
        return request;
    }

    @Override
    public Result proceed(Request request) {
        Result proceed = null;
        if(ratifyList.size()>index){
            RealChain realChain = new RealChain(request,ratifyList,index+1);
            Ratify ratify = ratifyList.get(index);
            proceed = ratify.deal(realChain);
        }
        return proceed;
    }
}
