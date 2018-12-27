package top.vlor.chainofresponsibility;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:58 2018/6/19
 * @Modified by：
 */
public class Manager implements Ratify {
    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manege====>request:"+request.toString());
        if(request.getDays()>3){
            Request newRequest = new Request.Builder().newRequest(request).setManagerInfo(request.getName() + "每月的KPI考核还不错，可以批准").build();
            return chain.proceed(newRequest);
        }
        return new Result(true,"Manage:早点把事情办完，项目离不开你！");
    }
}
