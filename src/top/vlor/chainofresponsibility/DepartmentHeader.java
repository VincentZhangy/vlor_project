package top.vlor.chainofresponsibility;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 16:04 2018/6/19
 * @Modified by：
 */
public class DepartmentHeader implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manage=====>request:"+request.toString());
        if(request.getDays()>7){
            return new Result(false,"请假时间过长");
        }
        return new Result(true,"DepartmentHeader:不要着急，把事情处理完再回来！");
    }
}
