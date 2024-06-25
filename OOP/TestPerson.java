package OOP;

public class TestPerson {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.setName("Chris");
		person.setAge(22);
		
		System.out.println(person.getName());
		System.out.println(person.getAge());

	}

}
