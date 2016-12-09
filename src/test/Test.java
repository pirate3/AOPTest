package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ningzhao6 on 2016/12/9 0009.
 */
public class Test {
    public static void main(String[] arge) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        TestBean bean = context.getBean("test", TestBean.class);
        bean.printTest();
    }
}
