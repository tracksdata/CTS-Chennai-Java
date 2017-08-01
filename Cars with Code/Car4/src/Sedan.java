
public class Sedan extends Car {

	private boolean absEnabled;
	private int bootSpace;
	public Sedan(){}
	public Sedan(Long id, String name, Boolean pw, Integer am) {
		super(id,name);
		this.absEnabled=pw;
		this.bootSpace=am;
		
	}
	public boolean isAbsEnabled() {
		return absEnabled;
	}
	public void setAbsEnabled(boolean absEnabled) {
		this.absEnabled = absEnabled;
	}
	public int getBootSpace() {
		return bootSpace;
	}
	public void setBootSpace(int bootSpace) {
		this.bootSpace = bootSpace;
	}
	
	public float calculateDriveCost(Double dist) {
		Float cost = 0.00f;
		if(this.bootSpace>600){
			cost= (float) ((dist*15)*1.2);
		}
		else {
			cost= (float) (dist*15);
		}
		return cost;
	}
	
}
