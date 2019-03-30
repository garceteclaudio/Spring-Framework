package ar.com.cgarcete.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
("Claudio")
public class EvolutionPerson {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Bean
	public EvolutionPerson helloWorld(){
		return new EvolutionPerson();
	}
	
	/** Equivalent to the following XML configuration.
	 * 
	 *  <beans>
   			<bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" />
		</beans>
	 * 
	 * */
}
