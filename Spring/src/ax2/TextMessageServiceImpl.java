package ax2;

import org.springframework.stereotype.Component;

@Component("sms")
public class TextMessageServiceImpl implements MessageService {

	
	public TextMessageServiceImpl() {
		System.out.println("Text Service Constructor");
	}
	@Override
	public void send(String to, String msg) {
		System.out.println("SMS sent to "+ to + "with " + msg);
	}

}
