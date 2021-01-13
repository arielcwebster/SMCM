/* Ariel Webster
 * 3/27/19
 * 
 * InClass example File IO creating and writing to a file.
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args)  throws IOException{ //can replace the catch block if there is a finally
		
		FileWriter output = null; //create an instance of the file writer
		
		try{
			output = new FileWriter("Example.txt"); // creates a stream to an already existing file or creates a new file
			output.write("Hello World"); // writes the Hello World string in the file 
			output.write(5 + ""); // it is important to include the + "" here so that 5 can be read as a string
								  // the .write() method will only write strings to a file
		}finally{
			//it is important to close the stream we created above. This should be the last thing we do, since after
			// we close the stream nothing more can be written to the file, therefore we put it in the finally block.
			// We can't close the stream if nothing is there so we check to make sure the object is not null first.
			if(output != null){
				output.close();
			}
		}	
	}
	
}
	
	
	
	
	/* Write a recursive funciton that prints 0 to n in assending order in a file, count by 5s. 
	 * 
	FileWriter output = null;
	
	public static void main(String[] args)  throws IOException{ //can replace the catch block if there is a finall
	        
	       FileWrite fw = new FileWrite();
	       fw.start();
	}
	
	public void start() throws IOException{
		 try {
	           
	            output = new FileWriter("SecondFile.txt");
	            recursiveWrite(18);
	            
	        } catch (IOException error){ // this is the same as the throws IOException on the main method signature
	        	
	        }finally {
	            if (output != null) {
	                output.close();
	            }
	        }
	}
	
	//starting at 0
	//print every 3 below n
	public void recursiveWrite(int n){
        try {
        	if(n <= 0){
        		System.out.println(n);
        		output.write(n + "");
        		output.write("\n");
        	}else{
        		
        		recursiveWrite(n-1);
        		if(n%3 == 0){
        			System.out.println(n);
        			output.write(n + "");
            		output.write("\n");
        		}
        	}
            
        } catch (IOException error){ // this is the same as the throws IOException on the main method signature
        	
        }
	}
	
	*/
