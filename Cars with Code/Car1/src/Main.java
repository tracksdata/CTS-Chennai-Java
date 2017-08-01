
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* Business Requirements as per the remembrance
 1.Create a member class
 2.Create getters and setters
 3.Create default constructor with the fields
 4.Display the member details
 5.If the member contact number and mail are equal print Member 1 is same as Member 2
   otherwise print Member 1 and Member 2 are different
 */
public class Main {

	public static void main(String[] args) throws IOException, ParseException {

		Long id;
		String firstName, lastName, email, contactNumber, licenseNumber;
		Date licenseStartDate, licenseExpiryDate;
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Member member[] = new Member[2];
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Member" + i + " :");
			System.out.println("id: ");
			id = Long.parseLong(br.readLine());
			System.out.println("first name: ");
			firstName = br.readLine();
			System.out.println("last name: ");
			lastName = br.readLine();
			System.out.println("email: ");
			email = br.readLine();
			System.out.println("contact number: ");
			contactNumber = br.readLine();
			System.out.println("license number: ");
			licenseNumber = br.readLine();
			System.out.println("license start date: ");
			licenseStartDate = dateFormat.parse(br.readLine());
			System.out.println("license expiry date: ");
			licenseExpiryDate = dateFormat.parse(br.readLine());
		//	member[i - 1] = new Member(); //Initialization is important
			member[i - 1].setContactNumber(contactNumber);
			member[i - 1].setEmail(email);
			member[i - 1].setFirstName(firstName);
			member[i - 1].setId(id);
			member[i - 1].setLastName(lastName);
			member[i - 1].setLicenseExpiryDate(licenseExpiryDate);
			member[i - 1].setLicenseNumber(licenseNumber);
			member[i - 1].setLicenseStartDate(licenseStartDate);
		}
		for (int i = 1; i <= 2; i++) {
			System.out.println("\nMember " + i);
			System.out.println(member[i - 1]);//to display the values we have to create toString method in Member Class
		}

		if (member[0].equals(member[1]))
			System.out.println("Member 1 is same as Member 2");
		else
			System.out.println("Member 1 and Member 2 are different");
	}
}
