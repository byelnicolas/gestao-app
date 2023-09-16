package mvc;

import java.util.ArrayList;

import mvc.controller.PersonController;

public class Main {

	public static void main(String[] args) {
		ArrayList<String[]> persons = PersonController.getPersons();
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i)[0]);
			System.out.println(persons.get(i)[1]);

		}
	}

}
