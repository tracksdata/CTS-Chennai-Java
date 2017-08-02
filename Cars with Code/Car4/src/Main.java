
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Business Requirements as per the remembrance
1.Create a member class
2.Create getters and setters
3.Create default constructor with the fields
4.Create a Car class with id and name
5.Create getters and setters
6.Create default constructor with the fields
7.Create a memberCar class
8.Create getters and setters
9.Create default constructor with the fields
10.create HatchBack class with powerWindowsEnabled,automaticGear fields with getters, setters, constructor with super class
11.create Sedan class with absEnabled,bootSpace fields with getters, setters, constructor with super class
12.create UtilityCar class with rearCoolingVents field with getters, setters, constructor with super class

13. Use method Overloading concept to calculate the drive cost
*/
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("id");
        Long id = Long.parseLong(br.readLine());
        System.out.println("name");
        String name = br.readLine();
        System.out.println("type");
        String ct = br.readLine();
        System.out.println("distance");
        Double dist = Double.parseDouble(br.readLine());

        Car carObj = null;
        if(ct.equals("hatchback")) {
            System.out.println("power windows");
            Boolean pw = Boolean.parseBoolean(br.readLine());
            System.out.println("automatic");
            Boolean am = Boolean.parseBoolean(br.readLine());            
            carObj = new HatchBack(id,name,pw,am);
        }
        else if(ct.equals("sedan")) {
            System.out.println("abs enabled");
            Boolean pw = Boolean.parseBoolean(br.readLine());
            System.out.println("boot space");
            Integer am = Integer.parseInt(br.readLine());            
            carObj = new Sedan(id,name,pw,am);
        }
        else {
            System.out.println("rear cooling vents");
            Boolean pw = Boolean.parseBoolean(br.readLine());
            carObj = new UtilityCar(id,name,pw);
            
        }

        System.out.println("Cost is Rs "+Math.round(carObj.calculateDriveCost(dist)));
        
   
    }
    
}
