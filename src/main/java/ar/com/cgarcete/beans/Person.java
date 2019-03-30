package ar.com.cgarcete.beans;

public class Person {

	private int id;
	private String name;
	private String lastName;
	
	public Person() {
		
	}
	
	public Person(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	@Override
	public String toString() {
		System.out.println("Person [id=" + id + ", name=" + name + ", lastName=" + lastName + "]");
		return "Person [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
}
