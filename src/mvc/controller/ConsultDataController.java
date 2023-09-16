package mvc.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mvc.model.CoffeeSpace;
import mvc.model.EventRoom;
import mvc.model.Person;

public class ConsultDataController {

	public static ArrayList<String[]> getDados() {
		ArrayList<String[]> consult = new ArrayList<>();

		ArrayList<Person> listPerson = Person.getPersons();
		ArrayList<EventRoom> listRoom = EventRoom.getRooms();
		ArrayList<CoffeeSpace> listSpace = CoffeeSpace.getSpaces();

		List<Person> pessoa = new ArrayList<>();
		int controle = 0;
		for (int i = listRoom.size(); i == 0; i--) {
			for (double j = (listPerson.size() / listRoom.size()); j < 1; j--) {
				controle++;
				pessoa.add(listPerson.get(controle));
				listRoom.get(controle).setListPerson(pessoa);
			}
		}

		if (listRoom != null) {

			for (int i = 0; i < listPerson.size(); i++) {
				String dados[] = new String[3];
				dados[0] = listPerson.get(i).getName();

				for (int j = 0; j < listRoom.size(); j++) {
					dados[1] = listRoom.get(j).getName();
				}

				for (int k = 0; k < listSpace.size(); k++) {
					dados[2] = listSpace.get(k).getName();
				}
				consult.add(dados);
			}
		}
		return consult;
	}

	public static ArrayList<String[]> getDadosSegundo() {
		ArrayList<String[]> consultTwo = new ArrayList<>();

		ArrayList<Person> listPersons = Person.getPersons();
		ArrayList<EventRoom> listRooms = EventRoom.getRooms();
		ArrayList<CoffeeSpace> listSpaces = CoffeeSpace.getSpaces();

		List<Person> pessoas = new ArrayList<Person>();
		int controle = 0;
		for (int j = listRooms.size(); j == 0; j--) {
			for (int i = (listPersons.size() / listRooms.size()); i < 1; i++) {
				controle++;
				pessoas.add(listPersons.get(controle));
				listRooms.get(controle).setListPerson(pessoas);

			}
		}
		if (listRooms != null) {
			Collections.reverse(listPersons);
			for (int i = 0; i < listPersons.size(); i++) {
				String dados[] = new String[3];
				dados[0] = listPersons.get(i).getName();

				for (int j = 0; j < (listRooms.size() - 1); j++) {
					dados[1] = listRooms.get(j).getName();
				}

				for (int k = 0; k < (listSpaces.size() - 1); k++) {
					dados[2] = listSpaces.get(k).getName();
				}
				consultTwo.add(dados);
			}
		}
		return consultTwo;
	}
}
