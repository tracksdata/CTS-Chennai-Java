public class MemberCar {

	private Long carId;
	private String regNum;
	private String color;
	private Car car;
	private Member member;

	public Long getCarId() {
		return carId;
	}

	public void setCarId(long carId) {
		this.carId = carId;
	}

	public String getRegNum() {
		return regNum;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public MemberCar(Long carId, Car car, Member member, String regNum,
			String color) {

		this.carId = carId;
		this.member = member;
		this.color = color;
		this.regNum = regNum;
		this.car = car;

	}

}
