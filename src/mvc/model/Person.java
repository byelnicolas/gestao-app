package mvc.model;

import java.util.ArrayList;

/**
 * Class Person representa o modelo (models) trata-se da entidade Pessoa que o
 * sistema possui
 */
public class Person {

	// atributos
	private String name;
	private String lastName;
	private EventRoom room; // A pessoa esta dentro de uma sala
	private CoffeeSpace space; // a pessoa está dentro de um espaço de café

	// construtor

	public Person() {
	}

	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	// getters and setters
	// métodos de acesso

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

	public EventRoom getRoom() {
		return room;
	}

	public void setRoom(EventRoom room) {
		this.room = room;
	}

	public CoffeeSpace getSpace() {
		return space;
	}

	public void setSpace(CoffeeSpace space) {
		this.space = space;
	}

	public static ArrayList<Person> getPersons() {
		Person person = new Person("Thalys", "Rodrigues");
		ArrayList<Person> listPerson = new ArrayList<>();
		listPerson.add(person);
		return listPerson;
	}
}
