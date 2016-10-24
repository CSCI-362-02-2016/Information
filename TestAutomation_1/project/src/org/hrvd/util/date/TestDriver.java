package org.hrvd.util.date;


import org.hrvd.util.date.Flexidate;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;

import java.io.*;


public class TestDriver {

	private static ArrayList<String> results;
 
	public static void main(String[] args)
	{
		results = new ArrayList();
    	
    	testCase1();
    	testCase2();
    	testCase3();
    	testCase4();
    	testCase5();
    	
    	writeResultsToFile(results);    	
    	
	}
	
	private static void testCase1()
	{
		
		try 
    	{
         	Calendar date1 = new GregorianCalendar( 2001, 5, 5 );
            Calendar date2 = new GregorianCalendar( 2002, 5, 5 );
            
            Flexidate fdate = new Flexidate( date1, date2 );
            
            int range = fdate.getRange();
            
            String result = Integer.toString(range);
           	
          	results.add(result);
        
        }
        catch ( Throwable t ) 
        {
            t.printStackTrace( System.err );
        }
		
	}
	
	private static void testCase2()
	{
		try 
    	{
         	Calendar date1 = new GregorianCalendar( 1999, 5, 5 );
            Calendar date2 = new GregorianCalendar( 2000, 5, 5 );
            
            Flexidate fdate = new Flexidate( date1, date2 );
            
            int range = fdate.getRange();
            
            String result = Integer.toString(range);
           	
          	results.add(result);
        
        }
        catch ( Throwable t ) 
        {
            t.printStackTrace( System.err );
        }
	}
	
	private static void testCase3()
	{
	
		try
		{		
			Calendar date1 = new GregorianCalendar(2020, 4, 25);
			Calendar date2 = new GregorianCalendar(2020, 5, 25);
			
			Flexidate fdate = new Flexidate(date1, date2);
			
			int range = fdate.getRange();
			
			String result = Integer.toString(range);	
			
			results.add(result);
		}
		catch ( Throwable t ) 
        {
            t.printStackTrace( System.err );
        }
	}
	
	private static void testCase4()
	{
		try
		{		
			Calendar date1 = new GregorianCalendar(1999, 12, 31);
			Calendar date2 = new GregorianCalendar(2000, 1, 1);
			
			Flexidate fdate = new Flexidate(date1, date2);
			
			int range = fdate.getRange();
			
			String result = Integer.toString(range);	
			
			results.add(result);
		}
		catch ( Throwable t ) 
        {
            t.printStackTrace( System.err );
        }
	}
	
	private static void testCase5()
	{
		try
		{		
			Calendar date1 = new GregorianCalendar(1776, 6, 4);
			Calendar date2 = new GregorianCalendar(1776, 6, 4);
			
			Flexidate fdate = new Flexidate(date1, date2);
			
			int range = fdate.getRange();
			
			String result = Integer.toString(range);	
			
			results.add(result);
		}
		catch ( Throwable t ) 
        {
            t.printStackTrace( System.err );
        }
	}
	
	private static void writeResultsToFile(ArrayList<String> results)
	{
		
        	for(int i = 0; i < results.size(); i++)
        	{
        		String testNumber = Integer.toString(i + 1);
        		String filename = "../../temp/testCase" + testNumber + "Results.txt";
        		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
            		new FileOutputStream(filename), "utf-8"))) 
        		{
        			//writer.write(Integer.toString(i + 1) + ": ");
  					writer.write(results.get(i));
  					writer.write("\n");
  				}
  				
  				catch ( Throwable t ) 
        		{
            		t.printStackTrace( System.err );
       			}
  			}
				
		
	}




}