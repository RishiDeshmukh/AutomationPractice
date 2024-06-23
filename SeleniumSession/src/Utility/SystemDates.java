package Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDates {

	public static void main(String[] args) {
		
		Date date= new Date();
		System.out.println("Date :"+date);
		
		//to get date on required format use SimpleFormat
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");//dd/MM/yyyy |yyyy-MM-dd
				
				String formatedDate=sdf.format(date);
				System.out.println("Date in required format: "+formatedDate);
				
				
				System.out.println("5 days back date: "+DateUtility.getRequiredDateBasedOnNumberOfDays("dd/MM/yyyy", -5));
				System.out.println("10 days fature date: "+DateUtility.getRequiredDateBasedOnNumberOfDays("dd/MM/yyyy", 10));
				
				System.out.println("5 months back date: "+DateUtility.getRequiredDateBasedOnNumberOfMonths("dd/MM/yyyy", -5));
				System.out.println("10 months fature date: "+DateUtility.getRequiredDateBasedOnNumberOfMonths("dd/MM/yyyy", 10));
				
				System.out.println("5 years back date: "+DateUtility.getRequiredDateBasedOnNumberOfYears("dd/MM/yyyy", -5));
				System.out.println("10 years fature date: "+DateUtility.getRequiredDateBasedOnNumberOfYears("dd/MM/yyyy", 10));

			
	}

}
