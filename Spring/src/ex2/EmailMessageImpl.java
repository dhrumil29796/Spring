package ex2;

public class EmailMessageImpl implements MessageService {

	public EmailMessageImpl() {
		System.out.println("Email Service Constructor");
	}
	@Override
	public void send(String to, String msg) {
		System.out.println("Email sent to " + to + "with " + msg);
	}

}
