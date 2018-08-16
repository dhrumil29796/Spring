package ax1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hi")
public class HelloWorld {
	private String name;

	public HelloWorld() {
		System.out.println("Default Constructor"); //runs first(in setter method first instantiate then inject)
	}

	public HelloWorld(String name) {
		this.name = name;
		System.out.println("Param Constructor"); //needs to inject in appctx file
	}

	public String getName() {
		return name;
	}
	
	@Value("Annotated Viral")
	public void setName(String name) {
		this.name = name;
	}

}