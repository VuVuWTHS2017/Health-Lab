import java.util.Scanner;

public class Health {
	public static void main (String args[]){
		Scanner scnr = new Scanner(System.in);
	      int userAgeYears = 0;
	      int userAgeDays  = 0;
	      int userAgeHours = 0;
	      int userAgeMinutes = 0;
	      int userAgeSeconds = 0;
	      int userSneezes = 0;
	      int userHeartBeats = 0;
	      int userCalories = 0;
	      int userHeight = 0;
	      int userWeight  = 0;
	      String Gender = " ";
	      
	      
	      
	      System.out.println("Enter your age in years: ");
	      userAgeYears = scnr.nextInt();
	      
	      userAgeDays = userAgeYears * 365;
	      userAgeHours = userAgeDays / 360;
	      userAgeMinutes = userAgeHours / 60;
	      userAgeSeconds = userAgeHours % 60;
	      userSneezes = userAgeDays; 
	      userHeartBeats = userAgeDays * 72;
	      
	      System.out.println("You're " + userAgeDays + " days, " + userAgeHours + " hours, ");
	      System.out.println(userAgeMinutes + " minutes, " + "and " + userAgeSeconds + " seconds old.");
	      System.out.println("You've sneezed " + userSneezes + " times in your lifetime thus far.");
	      System.out.println("You're heart has beated " + userHeartBeats + " times in your lifetime so far.");
	      
	      System.out.println("Enter your gender: ");
	      Gender = scnr.next();
	      
	      System.out.println("Enter your height: ");
	      userHeight = scnr.nextInt();
	      
	      System.out.println("Enter your weight: ");
	      userWeight = scnr.nextInt();
	      
	      return;
		
	}

}
