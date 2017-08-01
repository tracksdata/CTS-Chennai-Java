import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Member {

	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String licenseNumber;
	private Date licenseStartDate;
	private Date licenseExpiryDate;
	private Long id;
	

	public Member() {

	}

	public Member(Long id, String firstName, String lastName, String email,
			String contactNumber, String licenseNumber, Date licenseStartDate,
			Date licenseExpiryDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.licenseNumber = licenseNumber;
		this.licenseStartDate = licenseStartDate;
		this.licenseExpiryDate = licenseExpiryDate;

	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Date getLicenseStartDate() {
		return licenseStartDate;
	}

	public void setLicenseStartDate(Date licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((contactNumber == null) ? 0 : contactNumber.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (contactNumber == null) {
			if (other.contactNumber != null)
				return false;
		} else if (!contactNumber.equals(other.contactNumber))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	@Override
	public String toString() {

		return "Name: " + firstName + " , " + lastName + "\n"
				+ "Member contact details: " + contactNumber + " , " + email;

	}

	public static Member findMember(Long memberId, ArrayList<Member> memberList2) {

		for (Member member : memberList2) {

			if (memberId == member.getId()) {

				return member;

			}
		}

		return null;
	}

	public static Member findMember(Long memberId) {

		return null;
	}

	public static Member createInstance(String s) throws InvalidEmailException {
		Member member=new Member();
		String regex="^[\\w!#$%&'*+/=?'{|}~^-]+(?:\\.[\\w!#$%&'*+/=?'{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(s);
		System.out.println(s+" : "+matcher.matches());
		if(matcher.matches()==false){
			throw new InvalidEmailException("Invalid");
		}
		member.setEmail(s);
		member.setFirstName("Narayana");
		member.setLastName("Reddy");
		member.setId(1L);
		member.setContactNumber("9654127854");
		return member;
	}

}
