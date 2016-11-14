package org.hrvd.util.object;
import org.hrvd.util.object.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class TestDriver {

	private static ArrayList<String> results;
 
	public static void main(String[] args)
	{
		results = new ArrayList();
    	
    		testCase20();
    	
    		writeResultsToFile(results);    	
    	
	}
	
	/*private static void testCase1()
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
		
	*/
	
	private static void testCase9()
	{
		try
		{
			int x = 5;
			int y = 6;
			int compared = Comparison.compare(x,y);
			String result = Integer.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}
	private static void testCase10()
	{
		try
		{
			int x = 10;
			int y = 10;
			int compared = Comparison.compare(x,y);
			String result = Integer.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}
	private static void testCase11()
	{
		try
		{
			long x = 111222333;
			long y = 223334445;
			int compared = Comparison.compare(x,y);
			String result = Integer.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}
	
	private static void testCase12()
	{
		try
		{
			long x = 11122233;
			long y = 11122233;
			int compared = Comparison.compare(x,y);
			String result = Integer.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}

	private static void testCase13()
	{
		try
		{
			int low1 = 5;
			int low2 = 6;
			int high1 = 10;
			int high2 = 20;
			boolean compared = Comparison.rangeOverlap(low1,high1,low2,high2);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}
	
	private static void testCase14()
	{
		try
		{
			int low1 = 6;
			int low2 = 5;
			int high1 = 10;
			int high2 = 20;
			boolean compared = Comparison.rangeOverlap(low1,high1,low2,high2);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}

	private static void testCase15()
	{
		try
		{
			int[] x = {1,2,3};
			int[] y = {1,2,3};
			boolean compared = Comparison.deepEquals(x,y);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}

	private static void testCase16()
	{
		try
		{
			int[] x = {1,2,3};
			int[] y = {4,5,6};
			boolean compared = Comparison.deepEquals(x,y);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}

	private static void testCase17()
	{
		try
		{
			int[] x = {};
			int[] y = {};
			boolean compared = Comparison.deepEquals(x,y);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}

	private static void testCase18()
	{
		try
		{
			Comparison[] x = new Comparison[3];
			Comparison[] y = new Comparison[3];
			boolean compared = Comparison.deepEquals(x,y);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}

	private static void testCase19()
	{
		try
		{
			Comparison[] x = new Comparison[3];
			Comparison[] y = new Comparison[1];
			boolean compared = Comparison.deepEquals(x,y);
			String result = Boolean.toString(compared);
			results.add(result);
		
		}
		catch ( Throwable t )
		{
			t.printStackTrace( System.err );
		}
	}
	private static void testCase20()
	{
		try
		{
			int x = -100;
			int y = -500;
			int compared = Comparison.compare(x,y);
			String result = Integer.toString(compared);
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
