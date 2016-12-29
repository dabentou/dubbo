package dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/29.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(new String[]{"/spring/applicationContext.xml"});
        context.start();
        System.in.read();//为保证服务一直开着，利用输入流的阻塞来模拟
    }
}
