package mvc.model;

import java.util.ArrayList;
import java.util.List;

public class EventRoom {
	// atributos da sala do evento
	private String name;
	private int capacity;

	// sala do evento tem uma lista de pessoas
	List<Person> ListPerson;

	// construtores
	public EventRoom() {
		this.ListPerson = new ArrayList<>();

	}

	public EventRoom(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		this.ListPerson = new ArrayList<>();
	}

	// Métodos de acesso
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	// método para manipular a lista de pessoas
	// retorna a lista inteira de pessoas
	public List<Person> getListPerson() {
		return ListPerson;
	}

	// adiciona uma lista de pessoas ao atributo
	public void setListPerson(List<Person> listPerson) {
		ListPerson = listPerson;
	}

	// adiciona uma pessoa a lista
	public void addPerson(Person person) {
		// muda o atributo sala da pessoa
		person.setRoom(this);// informa a sala que a pessoa está
		this.ListPerson.add(person);
	}

	public static ArrayList<EventRoom> getRooms() {
		EventRoom room = new EventRoom("Apex Java", 10);
		ArrayList<EventRoom> listRoom = new ArrayList<>();
		listRoom.add(room);
		return listRoom;
	}

}
