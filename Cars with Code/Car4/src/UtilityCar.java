
public class UtilityCar extends Car {
	
	private boolean rearCoolingVents;

	public UtilityCar(Long id, String name, Boolean pw) {
               
               super(id,name);
               this.rearCoolingVents=pw;
	}

	public boolean isRearCoolingVents() {
		return rearCoolingVents;
	}

	public void setRearCoolingVents(boolean rearCoolingVents) {
		this.rearCoolingVents = rearCoolingVents;
	}
	
	public float calculateDriveCost(Double dist) {
		return (float) (dist*18);
	}
	}
