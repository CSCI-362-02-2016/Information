package org.hrvd.util.object;
import org.hrvd.util.object.*;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class TestDriver {

	static String result;
	static int testCaseNumber;
 
	public static void main(String[] args)
	{
		String method = args[0];
		String input  = args[1];
		testCaseNumber = Integer.parseInt(args[2]);   
    		String[] testParameters = input.split(";");
		
		switch
		{
			case "compare":
				int firstInt = Integer.parseInt(testParameters[0]);
				int secondInt = Integer.parseInt(testParameters[1]);
				result = testCompare(firstInt, secondInt);
				break;
			case "deepEquals":
				result = deepEquals(int[] x, int[] y);
				break;
			case "rangeOverlap":
				int low1 = Integer.parseInt(testParameter[0]);
				int high1 = Integer.parseInt(testParameter[1]);
				int low2 = Integer.parseInt(testParameter[2]);
				int high2 = Integer.parseInt(testParameter[3]);
				result = rangeOverlap(int low1, int high1, int low2, int high2);
				break;
			default:
				result = "Method not valid!";
				break;
		}
		writeResultToFile(result);
	}

	private static String testCompare(int x, int y)
	{
		int compared = Comparison.compare(x,y);
		String results = Integer.toString(compared);
		return results;
	}
		
	private static String testrangeOverlap(int low1, int high1, int low2, int high2)
	{
		boolean compared = Comparison.rangeOverlap(low1,high1,low2,high2);
		String results = Boolean.toString(compared);
		return results;
		
	}
	
	private static String testDeepEquals(int[] x, int[] y)
	{
		boolean compared = Comparison.deepEquals(list1, list2);
		String results = Boolean.toString(compared);
		return results;
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
