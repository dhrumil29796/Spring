package ax3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ax2.MessageService;

@Component
public class MyLife {
	@Autowired
	@Resource(name="sms") //By name
	private MessageService sms; // default BY type will run everything there in package

	public MyLife() {
		System.out.println("My LIFE COnstructor");
	}
	@PostConstruct
	public void janam() {
		System.out.println("MyLife After birth");
	}
	@PreDestroy
	public void maran() {
		System.out.println("MyLife before death");
	}
}
