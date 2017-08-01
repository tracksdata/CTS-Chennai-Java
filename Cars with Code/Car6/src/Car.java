import java.util.ArrayList;

public class Car {

	private Long id;
	private String name;
	private String model;
	private int makeYear;
	private String company;
	private int comfortLevel;

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getComfortLevel() {
		return comfortLevel;
	}

	public void setComfortLevel(int comfortLevel) {
		this.comfortLevel = comfortLevel;
	}

	public Car() {

	}

	public Car(Long id, String name, String model, int makeYear,
			String company, int comfortLevel) {

		this.id = id;
		this.comfortLevel = comfortLevel;
		this.company = company;
		this.makeYear = makeYear;
		this.model = model;
		this.name = name;
	}

	public static Car findCar(Long carId, ArrayList<Car> carList) {

		for (Car car : carList) {

			if (carId == car.getId()) {

				return car;

			}
		}

		return null;
	}

}
