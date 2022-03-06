package project;
import java.text.SimpleDateFormat;
import java.util.*;
public class ProjectSchool {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome to abc School");
			System.out.println("Choose the option to proceed");
			System.out.println("1. Admission Form" + '\n' + "2. Students Portal" );
			String options = input.nextLine();
			switch(options) {
			
			case "1":
				
				System.out.println("Fill out the Application form:");
				admissionForm();
//				break;
				
			case "2":
				System.out.println("Select the options:\n1.Fees Structure\n2.Course Details\n3.Sports\n");
				Scanner input1 = new Scanner(System.in);
				String option1 = input1.nextLine();
				switch(option1) {
				
				case "1":
					System.out.println("Fees Structure");
					fees();
//					break;
					
				case "2":
					System.out.println("Course Details");
					courseDetail();
//					break;
					
				case "3":
					System.out.println("Sports ");
					sports();
//					break;
				}
				
//				break;
				
			}
							
	}

		private static  void admissionForm() 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your name");
			String name = in.nextLine();
			
			System.out.println("Enter your age");
			int age = in.nextInt();
			in.nextLine();
			System.out.println("Enter your Parents name");
			String PName = in.nextLine();
			System.out.println("Enter your Native Place");
			String nPlace = in.nextLine();
			System.out.println("Enter ur gender");
			String gender = in.nextLine();
			System.out.println("Contact Number");
			int cNumber = in.nextInt();
//			in.nextInt();
			System.out.println("Nationality");
			String Nation = in.nextLine();
			in.nextLine();
//			System.out.println("Date");
//			int Date = in.nextInt();
//			in.nextLine();
			Date n = new Date();
			SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/YYYY");
			System.out.println("");
			System.out.println("Date of Application is :"+d1.format(n));
			System.out.println("");
			System.out.println("   *------------------------------*   ");
			System.out.println("Application has been submitted\nThank you for the Responce... ");
			}
		private static void fees()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the class Studying: \t6\t7\t8\t9\t10\t11\t12 ");
			int section;
			section = in.nextInt();
						
			//Fees Structure for each class
			//Finding class room no
			
			System.out.println("High School Rooms");
			
			if(section == 6)
			{
				System.out.println("Fees : Rs.5000 per term ");
				System.out.println("Room number : 101");	
			}
			else if(section == 7)
			{
				System.out.println("Fees : Rs.5500 per term ");
				System.out.println("Room number : 102");
			}
			else if(section == 8)
			{
				System.out.println("Fees : Rs.6000 per term ");
				System.out.println("Room number : 103");
			}
			else if(section == 9)
			{
				System.out.println("Fees : Rs.6500 per term ");
				System.out.println("Room number : 104");
			}
			else if(section == 10)
			{
				System.out.println("Fees : Rs.7000 per term ");
				System.out.println("Room number : 105");
			}
			else if(section == 11)
			{
				System.out.println("Fees : Rs.7500 per term ");
				System.out.println("Room number : 106");
			}
			else if(section == 12)
			{
				System.out.println("Fees : Rs.8500 per term ");
				System.out.println("Room number : 107");
			}
			
			else
			{
				System.out.println("Fees : Rs.3500 peryear");
				System.out.println("Lower Class");
			}
				
		}
		
		private static void courseDetail() {
			Scanner obj = new Scanner(System.in);
			System.out.println("Select Course code :\t111\t112\t113\t114");
			int course ;
			course = obj.nextInt();
				
			//selecting course 
			//Course Details for 11 and 12 standard class
			
			if(course ==111) 
			{
				System.out.println("");
				System.out.println("Subjects for Higher Secondary Students:");
				System.out.println("Physics");
				System.out.println("Chemistry");
				System.out.println("Mathematics");
			}
			else if(course == 112)
			{
				
				System.out.println("");
				System.out.println("Subjects for Higher Secondary Students:");
				System.out.println("\tComputer Science");
				System.out.println("\tBiology");
				System.out.println("\tStatistics");
			}
			else if(course == 113) 
			{
				System.out.println("");
				System.out.println("Subjects for Higher Secondary Students:");
				System.out.println("Accountancy");
				System.out.println("Tourism");
				System.out.println("Mathematics");
			}
			else if(course == 114)
			{
				System.out.println("");
				System.out.println("Subjects for Higher Secondary Students:");
				System.out.println("Commerse");
				System.out.println("History");
				System.out.println("Economics");
			}
			else 
			{
				System.out.println("No other course");
			}
		}
		
		private static void sports()
		{
			Scanner obj5 = new Scanner(System.in);
			System.out.println("Enter your sports option:\n1.Kabadi\n2.Cricket\n3.Hockey\n4.Foot Ball\n5.Chess\n");
			
			int Sports = obj5.nextInt();
			
			//Checking available sports
			//Fees structure for sports
			
			if(Sports ==  1)
			{
				System.out.println("Fees for Kabadi : Rs.1000 \nPractice timing: 2 hrs per day\nMonday - Saturday");
								
			}
			else if(Sports == 2)
			{
				System.out.println("Fees for Cricket : Rs.2000 \nPractice timing: 3 hrs per day\nMonday - Saturday");	
			}
			else if(Sports == 3)
			{
				System.out.println("Fees for Hockey : Rs.2000 \nPractice timing: 3 hrs per day\nMonday - Saturday");
			}
			else if(Sports == 4)
			{
				System.out.println("Fees for Kabadi : Rs.2500 \nPractice timing: 3 hrs per day\nMonday - Saturday");
			}
			else if(Sports == 5)
			{
				System.out.println("Fees for Chess : Rs.1000 \nPractice timing: 2 hrs per day\nMonday - Saturday");	
			}
			
			else
			{
				System.out.println("Not Available");
			}
		}		
}

