package ar.com.cgarcete;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.com.cgarcete.beans.Person;


public class Testeador {

	private static final Logger logger = Logger.getLogger (Testeador.class);
	
	@Test
	public void testeadorBeanPerson() {
		ApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext1.xml");
		
		Person person = context.getBean ("clau", Person.class);
		
		person.toString();
	}
}
