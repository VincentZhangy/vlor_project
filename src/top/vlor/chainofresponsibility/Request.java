package top.vlor.chainofresponsibility;

/**
 * @Descreption:
 * @Author: vlor
 * @Date: Created in 15:08 2018/6/19
 * @Modified by：
 */
public class Request {
    //姓名
    private String name;
    //原因
    private String reason;
    //天数
    private int days;
    //组长信息
    private String groupLeaderInfo;
    //经理信息
    private String managerInfo;
    //部门领导信息
    private String departmentHeaderInfo;
    //客户信息
    private String customInfo;

    public Request(Builder builder) {
        super();
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
        this.customInfo = builder.customInfo;
    }

    public static class Builder{
        private String name;

        private String reason;

        private int days;

        private String groupLeaderInfo;

        private String managerInfo;

        private String departmentHeaderInfo;

        private String customInfo;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }

        public Builder newRequest(Request request){
            this.name = request.name;
            this.reason = request.reason;
            this.days = request.days;
            if(request.groupLeaderInfo!=null && !request.groupLeaderInfo.isEmpty()) {
                this.groupLeaderInfo = request.groupLeaderInfo;
            }
            if(request.managerInfo!=null && !request.managerInfo.isEmpty()) {
                this.managerInfo = request.managerInfo;
            }
            if(request.departmentHeaderInfo!=null && !request.departmentHeaderInfo.isEmpty()) {
                this.departmentHeaderInfo = request.departmentHeaderInfo;
            }
            if(request.customInfo!=null && !request.customInfo.isEmpty()) {
                this.customInfo = request.customInfo;
            }
            return this;
        }

        public Request build(){
            return new Request(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getReason() {
        return reason;
    }

    public int getDays() {
        return days;
    }

    public String getGroupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public String getDepartmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", reason='" + reason + '\'' +
                ", days=" + days +
                ", groupLeaderInfo='" + groupLeaderInfo + '\'' +
                ", managerInfo='" + managerInfo + '\'' +
                ", departmentHeaderInfo='" + departmentHeaderInfo + '\'' +
                ", customInfo='" + customInfo + '\'' +
                '}';
    }
}
