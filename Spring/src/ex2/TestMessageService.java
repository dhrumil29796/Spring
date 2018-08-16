package ex2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
@Test
public void testcase() {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("ex2/appctx.xml"); //testing only in methods
	MessageRouter router = (MessageRouter) ctx.getBean("router");
	
	router.processMessage("sms", "7802viral", "Hello Viral");
	router.processMessage("email", "284Dhrumil", "Hello Dhrumil");
	router.processMessage("tweet", "284Dhrumil", "Hello Dhrumil");

	
}
}
