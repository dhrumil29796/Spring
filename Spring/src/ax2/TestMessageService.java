package ax2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageService {
@Test
public void testcase() {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("annotated.xml");
	MessageRouter router = (MessageRouter) ctx.getBean("router");
	
	router.processMessage("sms", "7802viral", "Hello Viral");
	router.processMessage("email", "284Dhrumil", "Hello Dhrumil");
	router.processMessage("tweet", "284Dhrumil", "Hello Dhrumil");

	
} 
}
