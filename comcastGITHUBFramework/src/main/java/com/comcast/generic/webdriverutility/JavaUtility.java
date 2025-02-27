package com.comcast.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	SimpleDateFormat sim;
	public int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(2000);//within this boundary(5000) it(nextInt) will pick one of the number and return
		return randomNumber;
	}
	

	//When we want date in this format
	public String getSystemDateYYYYDDMM() {//  to catch systemdate in this format we have to create object for date class
		
		Date dateobj = new Date();
		 sim = new SimpleDateFormat("yyyy-MM-dd");//pass the pattern here and MM should be in uppercase
		 String actdate=sim.format(dateobj);
		 return actdate;
	}
	
	//if we give negative number it will give previous data
	//if we give positive number it will give forward data
	public String getRequiredDateYYYYDDMM(int days) {
		 
	    
	      
	      //to capture current system date after 30 days
	      Calendar cal = sim.getCalendar();
	      cal.add(Calendar.DAY_OF_MONTH,30);
	    String endDate = sim.format(cal.getTime());
	    return endDate;
	   
	}
	
	
}
