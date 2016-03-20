package io.docbot;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16-3-20
 * Time: 下午1:37
 * To change this template use File | Settings | File Templates.
 */
public class MyBean {
    private String name;

    private Integer timeOut;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyBean{");
        sb.append("name='").append(name).append('\'');
        sb.append(", timeOut=").append(timeOut);
        sb.append('}');
        return sb.toString();
    }
}
