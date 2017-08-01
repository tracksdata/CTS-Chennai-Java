import java.util.ArrayList;




public abstract class Car {
	protected long id;
	protected String name;
	
	public Car(){}
	
	
	public Car(long id, String name) {
		
		this.id=id;
		this.name=name;
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static Car findCar(Long carId, ArrayList<Car> carList) {
		for(Car car :carList){
			   if(car.id==carId){
				  return  car;
			   }
			    }
		return null;
	}

   
	public abstract float calculateDriveCost(Double dist);	
		
	}

