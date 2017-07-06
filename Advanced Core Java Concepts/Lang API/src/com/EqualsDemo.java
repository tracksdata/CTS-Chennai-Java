package com;

class Car {
	

	String carModel;
	String carColor;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Car) {
			Car car =  (Car)obj; // Intanciation
			if (this.carModel.equals(car.carModel)
					&& this.carColor.equals(car.carColor)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}

public class EqualsDemo {

	public static void main(String[] args) {

		Car car1 = new Car(); // Object Creation
		car1.carModel = "2010";
		car1.carColor = "White";

		Car car2 = new Car();
		car2.carModel = "2010";
		car2.carColor = "White";

		//

		System.out.println("car1 hashcode: "+car1.hashCode());
		System.out.println("car2 hashcode: "+car2.hashCode());
		//System.out.println(car1 == car2);

		System.out.println(car1.equals(car2));

	}

}
