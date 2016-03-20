import io.docbot.MyBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16-3-19
 * Time: 下午10:52
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mySpring.xml");
        MyBean myBean = context.getBean(MyBean.class);
        System.out.println(myBean);
    }
}
