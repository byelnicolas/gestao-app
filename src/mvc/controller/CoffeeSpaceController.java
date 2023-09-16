package mvc.controller;

import java.util.ArrayList;

import mvc.model.CoffeeSpace;

public class CoffeeSpaceController {
	public static ArrayList<String[]> getSpaces() {
		ArrayList<String[]> spaces = new ArrayList<>();

		ArrayList<CoffeeSpace> listCoffee = CoffeeSpace.getSpaces();

		if (listCoffee != null) {
			for (int i = 0; i < listCoffee.size(); i++) {
				String coffee[] = new String[2];
				coffee[0] = listCoffee.get(i).getName();
				coffee[1] = Integer.toString(listCoffee.get(i).getCapacity());

				spaces.add(coffee);
			}
		}
		return spaces;
	}
}
