package mvc.controller;

import java.util.ArrayList;

import mvc.model.Person;

public class PersonController {

	public static ArrayList<String[]> getPersons() {
		ArrayList<String[]> persons = new ArrayList<>();
		ArrayList<Person> listPerson = Person.getPersons();
		// se a lista de pessoas for diferente de nulo, faz o tratamento
		if (listPerson != null) {
			for (int i = 0; i < listPerson.size(); i++) {
				String person[] = new String[2];
				person[0] = listPerson.get(i).getName();
				person[1] = listPerson.get(i).getLastName();
				persons.add(person);
			}
		}
		return persons;
	}
}
