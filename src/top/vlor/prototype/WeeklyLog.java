package top.vlor.prototype;

/**
 * @Author: vlor
 * @Descreption:
 * @Date: Created in 09:38 2018/4/3
 * @Modified by：
 */
public class WeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected WeeklyLog clone() {
        Object obj = null;
        try{
            obj = super.clone();
            return (WeeklyLog) obj;
        }catch (CloneNotSupportedException e){
            System.out.println("不可复制");
            return null;
        }
    }
}
