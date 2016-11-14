package org.hrvd.util.date;


import org.hrvd.util.date.Flexidate;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

import java.io.*;


public class FlexidateDriver {

	static int testCaseNumber;
	static String result;
	public static void main(String[] args)
	{
		String method = args[0];
		String input = args[1];
		testCaseNumber = Integer.parseInt(args[2]);
		// parse the input argument
		String[] dateParameters = input.split(";");
	
		String[] firstDateParameters = dateParameters[0].split(",");
		String[] secondDateParameters = dateParameters[1].split(",");		
		
		int firstDateYear = Integer.parseInt(firstDateParameters[0]);
		int firstDateMonth = Integer.parseInt(firstDateParameters[1]);
		int firstDateDay = Integer.parseInt(firstDateParameters[2]);

		int secondDateYear = Integer.parseInt(secondDateParameters[0]);
		int secondDateMonth = Integer.parseInt(secondDateParameters[1]);
		int secondDateDay = Integer.parseInt(secondDateParameters[2]);

		// create two calendars that will be used as input for flexidate object
		Calendar date1 = new GregorianCalendar(firstDateYear, firstDateMonth, firstDateDay);
		Calendar date2 = new GregorianCalendar(secondDateYear, secondDateMonth, secondDateDay);

		switch(method)
		{
			case "getRange":
				 result = testGetRange(date1, date2);			
		} 

		
		writeResultToFile(result);
	}


	private static String testGetRange(Calendar date1, Calendar date2)
	{
		
		Flexidate flexidate = new Flexidate(date1, date2);
		String range = Integer.toString(flexidate.getRange());				
		return range;
	}	
		
	private static void writeResultToFile(String result)
	{
        
        String filename = "../../temp/testCase" + testCaseNumber + "Results.txt";
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream(filename), "utf-8"))) 
        {
        	//writer.write(Integer.toString(i + 1) + ": ");
  			writer.write(result);
  			writer.write("\n");
  		}
  				
  		catch ( Throwable t ) 
        {
            t.printStackTrace( System.err );
       	}
  	}
				

}
