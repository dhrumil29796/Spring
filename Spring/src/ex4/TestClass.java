package ex4;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	@Test
	public void lafda() {
		ConfigurableApplicationContext kuchbhi = new ClassPathXmlApplicationContext("ex4/appctx.xml");
		MyLife dukh = kuchbhi.getBean(MyLife.class);
		kuchbhi.close();
	}
}
