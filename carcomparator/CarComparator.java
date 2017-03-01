package com.fdmgroup.carcomparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fdmgroup1.firstproject.Car;

public class CarComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {

		if (car1.getEngineSize() < car2.getEngineSize())
			return -1;
		else if (car1.getEngineSize() > car2.getEngineSize())
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
		CarComparator carComparator = new CarComparator();
		
		Car firstCar = new Car(999);
		Car secondCar = new Car(1000);

		System.out.println("firstly comparing the two cars");
		
		if (carComparator.compare(firstCar,secondCar) == -1) {
			System.out.println("first car less than second car");
		} else if (carComparator.compare(firstCar,secondCar) == 1) {
			System.out.println("first car greater than second car");
		} else {
			System.out.println("They are equal");
		}
		
		System.out.println("now compare the list of cars and sort them into order");
		
		List<Car> carsList = new ArrayList<Car>();
		carsList.add(new Car(1000));
		carsList.add(new Car(600));
		carsList.add(new Car(500));
		carsList.add(new Car(200));
		carsList.add(new Car(1100));
		
		Collections.sort(carsList, carComparator);

		for (Car eachOne : carsList) {
			System.out.println("This car has an engine size of: "+eachOne.getEngineSize());
		}
	}
}