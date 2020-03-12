package demo.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.dao.TestDao;
public class Test {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestDao tt = (TestDao)appCon.getBean("test");
		tt.sayHello();
	}
}
