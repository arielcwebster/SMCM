/*
*Author: Ariel Webster
*Created: 10/18/19
*Updated: 10/5/20
*
*Class example for Exception Handling. 
*
*/
import java.util.ArrayList;
import java.util.Scanner;


public class Exceptions {
	public static void main(String args[]){
		
		/*Arithmetic Exception
		 * catches if you divide by 0 */
		try{
			//the code in here is what you are trying.
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number to divide by.");
			int x = 7/ s.nextInt();
		}catch(ArithmeticException e){ // this is what might go wrong, in this case the user may have entered a number that made the program try to divide by 0.
			System.out.println("No, you know we can't divide by 0. Shame on you for trying." +
					"\n Exception thrown  :" + e); // this is what you do or say if it does go wrong.
		}
		
		System.out.println("Yay Still Going");
		
		/*We use exceptions, instead of just letting the program crash so that the user can recover from their mistakes

		 *Part 1 - Rewrite the above code to allow the user to correct their mistake.*/
		
	







		
		/* Part 2 - There are other types of exceptions of course.
		 * The NegativeArraySizeException catches when the program is trying to create a new array with a negative number of places, which cannot exist. 
         Using the above example of a try catch block of code, and replacing the ArithmeticException with NegativeArraySizeException write a short example to show how the NegativeArraySizeException exception works.
		 */
		






		
		
		/* The NumberFormatException is an exception that catches when a String is being parsed to some sort of number but is formatted incorrectly. For Example: 
		 */
		try{
			System.out.println("Enter an integer.");
			Scanner s = new Scanner(System.in);
			int x = Integer.parseInt(s.nextLine());
		}catch(NumberFormatException e){
			System.out.println("Wrong. If it has a decimal point it is not considered an integer." +
					"\n Exception thrown  :" + e);
		}
		
		/* Part 3 - If there is code in your program that might throw more than one excpetion you can include more than one catch block for each try block that you have written. Using the NegativeArraySizeException and the NumberFormatException write an example when both exception types might need to be caught and in which both can be caught. 
		 */
		







		
		/* If you don't know what could go wrong but you just want to cover all your bases, you can catch a generic exception
		 * Instead of a specific exception to look for. 
		 */
		try{
			System.out.println("Enter an integer for the size of the array.");
			Scanner s = new Scanner(System.in);
			int x [] = new int[Integer.parseInt(s.nextLine())];
		}catch(Exception e){
			System.out.println("Yeah... no.  :" + e);
		}
		/*Part 4 - Describe evernthing that could go wrong in the above code depending on the user input. */
		
		






		/*Below you can see that an IndexOutOfBoundsException can be used to catch the same error in arrays, Strings, and ArrayLists.*/
		try{
			System.out.println("Trying to print place 3 in an array that only has three spaces. ");
			int a[] = new int[2];
	        System.out.println("Access element three :" + a[3]);
	        System.out.println("Trying to print character 10 in the word 'Exception'. ");
	        String word = "Exception";
	        System.out.println("Access element three :" + word.charAt(10));
	        System.out.println("Trying to print place 0 in an ArrayList that has nothing in it. ");
	        ArrayList al = new ArrayList();
	        System.out.print(al.get(0));
		}catch(IndexOutOfBoundsException e){
			System.out.println("Exception thrown  :" + e);
		}
		
		/* Part 5 - You can also catch String and Array exceptions separately. 
		 * Fill in the following code to show why you might want to do this when array, ArrayList, and String IndexOutOfBoundsException exceptions can all be caught by one exception?
		 */
		try{
			
            //Your code here


		}catch(StringIndexOutOfBoundsException e){
		    //Your code here
		}catch(ArrayIndexOutOfBoundsException e){
            //Your code here
		}
		
	}
}
