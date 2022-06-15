package WildCards;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int id;

	public Vehicle(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + "]";
	}

}

class Car extends Vehicle {
	private String model;

	public Car(int id, String model) {
		super(id);
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

}

public class App {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(30));
		list.add(new Vehicle(20));
		list.add(new Vehicle(50));
		list.add(new Car(95, "BMW"));
		list.add(new String("A String OIbject"));
		display(list);

	}

	public static void display(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
