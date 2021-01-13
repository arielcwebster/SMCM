/* Ariel Webster
 * 3/27/19
 * 
 * InClass example File IO reading and parsing a file.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class FileRead {
    
	public static void main(String[] args) throws IOException {
		Scanner scan = null; // to get information in
	    ArrayList al = new ArrayList(); // to store the information we get
       
       try{
    	   scan = new Scanner(new FileReader("Example.txt")); // this file needs to be in the same folder/project 
    	   													  // as this .java file.
    	   while(scan.hasNext()){ // while there is more in the file that you have not read into your program
    		   al.add(scan.next()); // read the next thing into your program and save it in the next place in your array list
    	   }
       }finally{
    	 //it is important to close the stream we created above. This should be the last thing we do, since after
			// we close the stream nothing more can be written to the file, therefore we put it in the finally block.
			// We can't close the stream if nothing is there so we check to make sure the object is not null first.
    	   if(scan != null){
    		   scan.close();
    	   }
       }
       //print out everything in our arraylist as a check. 
       for(int i = 0; i < al.size(); i++){
    	   System.out.println(al.get(i));
       }
		
	}
}


/* You try: Write a recursive function to scan in everything in the file.
 * 
 * You try: Read in the ENIACProgrammers.txt test file, found on Blackboard, and parse that input so that each 
 * element in the array list has the first and last name of a programmer.
 */