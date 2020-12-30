import java.util.ArrayList;
import java.util.Scanner;

/*Lab 0 Driver
 *Created 12/29/20
 *Created by: Ariel Webster
 *
 *This is the Driver class that will be used to run and test your Lab 0 submissions. 
 *Do not make any changes to this class when testing your code.
 * 
 * To make the code in this class run you will need to create two additional classes
 *  -- COVIDDataProcessing: - with the methods:
 *  		-- Read, which reads in a file and returns an arraylist of objects
 *  		-- Max, which takes in an arraylist and returns the county with the most cases per 100,000
 *  		-- Min, which takes in an arraylist and returns the county with the least cases per 100,000
 *  		-- StateCases, which takes in an arraylist and returns integer representing the cases per 100,000 of the state as a whole (considering all of the counties)
 *  -- Countries - the object class 
 *  		-- Attributes: Name, COVID Cases, Number of residence
 *  		-- Appropriate Constructor
 *  		-- Get and Set methods for each attribute
 *  		-- A toString method.
 */
public class Lab0Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(); // creating a scanner to take in the file name
		COVIDDataProcessing dp = new COVIDDataProcessing(); // creating an instance of the class where you will write the bulk of your code
		
		System.out.println("Please enter the name of your file (without the .csv or .txt extension)");// prompting the user to enter the file name
		
		// calls the Read method and saves the returned ArrayList in the ArrayList 'Counties'
		ArrayList Counties = dp.Read(scan.next()); 
		
		// Find the county with the most COVID cases PER 100,000 and print out the information about it
		County mostCasesPer100000 = dp.Max(Counties);
		System.out.println(mostCases.toString());
		
		// Find the county with the fewest COVID cases PER 100,000 and print out the information about it
		County leastCasesPer100000 = dp.Min(Counties);
		System.out.println(leastCases.toString());
		
		// Find what the PER 100,000 COVID case load for the state is and print the result
		int casesPer100000inState = dp.StateCases(Counties);
		System.out.println(casesPer100000inState);
		
	}

}
