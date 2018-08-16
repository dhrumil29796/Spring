package ax1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	@Test
	public void testcase() {
		// using app context
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext("annotated.xml"); // so no need to go to hibernate
																						// config file
		HelloWorld hw = (HelloWorld) ctx.getBean("hi");
		System.out.println("Name: " + hw.getName());
	}
}
