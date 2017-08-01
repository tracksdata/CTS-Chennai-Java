
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

/* Business Requirements as per the remembrance

1.Create a member class

2.Create getters and setters

3.Create default constructor with the fields

4.Create a Car class

5.Create getters and setters

6.Create default constructor with the fields

7.Create a memberCar class

8.Create getters and setters

9.Create default constructor with the fields

10.Validate Registration number like TN-07-AS-1273
11.
input: TN@07#AS*1234 and output should be TN-07-AS-1273
12.
Validate the driving licence assume the current date is 15-06-2017
  
 If it is more than 10 years then print 2 years old license - expired
 
  less than 10 years then print 2 years old license - valid"
*/

public class Main
 {
    
 

   public static void main(String[] args) throws IOException
 {
       
 String menu = "Menu:\n 1) Valid Car registration Number\n 2) Convert Car registration Number\n "
 
               + "3) Valid Driving License";
  
      
        //TN-07-AS-1273
        
System.out.println(menu);
    
    System.out.println("Enter choice");
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
       int x = Integer.parseInt(br.readLine());
  
      String regnum = "",input="";
       
 switch(x) {
        
    case 1: {
    
            System.out.println("car registration number");
   
             regnum = br.readLine();

                validateRegNum(regnum);

                break;
    
        }
            case 2:
 {
               
 System.out.println("car registration number");
   
             regnum = br.readLine();
 
               convertRegNum(regnum);
 
               break;
          
  }
            case 3: 
{
                
System.out.println("driving license issue date");
 
               input = br.readLine();
     
           validateDrivingLicense(input);
   
             break;
     
       }
        
    
        }
     
   
    }
    
    
public static void validateRegNum(String reg)
 {
    	
    
	/*This can be done by using the following two methods*/
  
  	
    	/* 
if(Pattern.matches("[A-Z]{2}[-]{1}[0-9]{2}[-]{1}[A-Z]{2}[-]{1}[0-9]{4}", reg))
{;
    
	System.out.println(reg+" is Valid" );

    	 
}
    	
 else {
    	
	 System.out.println(reg+" is Invalid");
   
 	 }*/
    
	
if(reg.matches("[A-Z]{2}[-]{1}[0-9]{2}[-]{1}[A-Z]{2}[-]{1}[0-9]{4}"))
{
    		System.out.println(reg+" is Valid" );
   
 	}
    	else{
    		
System.out.println(reg+" is Invalid");
  
  	}
    }

  

  public static void convertRegNum(String reg) {
  
  	StringBuffer sb=new StringBuffer(reg);
  
  	sb.replace(2, 3, "-");
 
   	sb.replace(5, 6, "-");
 
   	sb.replace(8, 9, "-");
 
   	System.out.println(sb.toString());
 
   }
 
   
	
public static void validateDrivingLicense(String inp) 
{
		
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

		sdf.setLenient(false);
	
	Date d=null;
		
try {
			
d=sdf.parse("15-06-2017");

		} 
catch (ParseException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
	
	}
		
Calendar c1=Calendar.getInstance();

		c1.setTime(d);
	
	Date d2=null;
	
	try {
		
	d2=sdf.parse(inp);

		} 
catch (ParseException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
	
	}		
		
Calendar c2=Calendar.getInstance();

		c2.setTime(d2);
	
	
		
int years=c1.get(Calendar.YEAR)-c2.get(Calendar.YEAR);

	
	c2.add(Calendar.YEAR,years);
		
if(c2.after(c1)){
	
		years=years--;
	
	}
		
if(years<=10){
		
	System.out.println(years+" years old license - valid");

		}
		
else{
			
System.out.println(years+" years old license - expired");
	
		}
 
  
  }
    
}

