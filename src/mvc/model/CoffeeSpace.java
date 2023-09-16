package mvc.model;

import java.util.ArrayList;

public class CoffeeSpace {

	// atributos do espaço de café
	private String name;
	private int capacity;

	// o espaço de café tem uma lista de pessoas
	ArrayList<Person> listPersonCoffee;

	// construtores
	public CoffeeSpace() {
		// instanciando o Arraylist
		listPersonCoffee = new ArrayList<>();
	}

	public CoffeeSpace(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		listPersonCoffee = new ArrayList<>();
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

	// método para manipular o arraylist
	// retorna a lista inteira de pessoas no espaco de café
	public ArrayList<Person> getListPersonCoffee() {
		return listPersonCoffee;
	}

	// atribui a lista de pessoas informada ao atributo
	public void setListPersonCoffee(ArrayList<Person> listPersonCoffee) {
		this.listPersonCoffee = listPersonCoffee;
	}

	// adiciona uma pessoa a lista
	public void addPersonCoffee(Person person) {
		// muda o atributo space da person para o espaco que ela está
		person.setSpace(this); // informa o espaço de café que a pessoa está
		listPersonCoffee.add(person);// adiciona uma pessoa a um espaco de café
	}

	public static ArrayList<CoffeeSpace> getSpaces() {
		CoffeeSpace space = new CoffeeSpace("apex java cafe", 10);
		ArrayList<CoffeeSpace> listSpace = new ArrayList<>();
		listSpace.add(space);
		return listSpace;
	}
}
