package ar.com.cgarcete;

import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.cgarcete.beans.EvolutionPerson;
import ar.com.cgarcete.beans.Person;


public class TestXMLBean {

	private static final Logger logger = Logger.getLogger (TestXMLBean.class);

	@Test
	@Ignore
	public void testeadorBeanPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext1.xml");

		Person person = context.getBean ("clau", Person.class);

		person.toString();
	}

	@Test
	public void testeadorEvolutionPerson() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(EvolutionPerson.class);

		EvolutionPerson helloWorld = ctx.getBean("Claudio" ,EvolutionPerson.class);
		helloWorld.setMessage("Claudio Rodolfo Garcete!");
		
		System.out.println(helloWorld.getMessage());
	}


}
