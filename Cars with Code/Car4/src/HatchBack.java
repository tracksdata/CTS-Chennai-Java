
public class HatchBack extends Car {
      private boolean powerWindowsEnabled;
      private boolean automaticGear;
      
      public HatchBack(){}
     
	public HatchBack(Long id, String name, Boolean pw, Boolean am) {
		super(id,name);
		this.powerWindowsEnabled=pw;
		this.automaticGear=am;
	}
	
	public boolean isPowerWindowsEnabled() {
		return powerWindowsEnabled;
	}
	public void setPowerWindowsEnabled(boolean powerWindowsEnabled) {
		this.powerWindowsEnabled = powerWindowsEnabled;
	}
	public boolean isAutomaticGear() {
		return automaticGear;
	}
	public void setAutomaticGear(boolean automaticGear) {
		this.automaticGear = automaticGear;
	}
		
   public float calculateDriveCost(Double dist) {
	   Float cost =0.00f;
		if(this.automaticGear){
			cost= (float) (dist*12);
		}
		else {
			cost= (float) (dist*10);
		}
		return cost;
	}
      
}
