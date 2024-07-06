package demo.one.ProOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Welcome obj = (Welcome) context.getBean("msg");
        System.out.println(obj.getMessage());
        
    }
}
