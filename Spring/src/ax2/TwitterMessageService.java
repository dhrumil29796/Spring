package ax2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("tweet")
@Lazy
public class TwitterMessageService implements MessageService {
	public TwitterMessageService() {
		System.out.println("Twitter Service Constructor");
	}

	@Override
	public void send(String to, String msg) {
		System.out.println("Tweet sent to " + to + "with " + msg);
	}

}
