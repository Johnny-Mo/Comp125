package firstJavaProgram;

import java.util.ArrayList;

public class ArrayListClient {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("this");
		list.add("is");
		list.add("your");
		list.add("captain");
		list.add("speaking!");
		
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.add(4, "brother");
		System.out.println(list);
		list.set(5, "talking");
		System.out.println(list);
		System.out.println("The size of the array is " + list.size());
		
//		ArrayList<Double> productData = new ArrayList<Double>();
		ArrayList<ArrayListExercises> pD = new ArrayList<ArrayListExercises>();
		ArrayList<Double> p = new ArrayList<Double>();
		p.add(1.0);

		
		
//		productData.add(1.0);
//		productData.add(5.5);
//		productData.add(10.0);
//		productData.add(32.1);
		
		System.out.println(pD);


	
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(list.get(i));
//		}
		/**
		 * Using a for each loop - I'm printing each word on a separate line
		 */
		for(String item: list){
//			System.out.println("This is the For Each loop ");
			System.out.println(item);
		}
		int loc = list.indexOf("brother");
		System.out.println("The index of brother is " + loc);
		
		
		/**
		 * Extracting the first letter of each word and concatenating them 	
		 */
		String result = "[";
		String concat;
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i).substring(0,1)); //Printing out the first letter of each word
			concat =  list.get(i).substring(0,1); //Adding the first letter of each word to a variable
			result = result + concat; //Joining the first letter of each word
		}
		result = result + "]"; // Making the string neat
		System.out.println(result);
		
		/**
		 * Counting the number of times a word starts with the letter t
		 * THIS COUNTS ALL OCCURANCES OF T = 2
		 */
		int counter = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).substring(0,1).contains("t") || list.get(i).substring(0,1).contains("T")){
				counter++;
			}
		}
		System.out.println("The number of occurances of the letter t and T is " + counter);
		
		/**
		 * Counting the number of times an elements string is more than 3
		 */
		counter = 0; // resetting counter variable to 0 from last use
		String temp = null;
		for(int i = 0; i < list.size(); i++){
			temp = list.get(i);
			if(temp.length() > 3){ //Is current elements length > than 3?
				counter++;
			}
		} // end loop
		System.out.println("The number of items over 3 characters long is " + counter);
		
		/**
		 * Extracting each element of array "list" that has more than 3 characters in it's string
		 * and putting it in a new array called "extract"
		 */
		counter = 0; // resetting counter variable to 0 from last use
		temp = null; // resetting the contents of temp to null
		ArrayList <String> extract = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++){
			temp = list.get(i);
			if(temp.length() > 3){ // Is current elements length > than 3?
				extract.add(list.get(i)); // Adding the element from ArrayList "list" to extract
			}
		} // end loop
		System.out.println("All the occurances of an element with 3 or more characters " + extract);
		
		/**
		 * Getting the last character of each String element and putting it into a char array
		 */
		char[] chr = new char[list.size()]; // Creating the char array (Primitive)
		
		temp = null; // resetting the temp variable
		char trim; // creating the variable to store the converted data (String to char)
		for(int i = 0; i < list.size(); i++){
			temp = list.get(i); // Giving temp the element data from "list"
			//trim = temp.substring(temp.length()-1, temp.length());
			trim = temp.charAt(temp.length()-1); // giving trim the last character of each "list" element
			System.out.println(trim);
			chr[i] = trim; // passing each char to the chr array
		}
		for(int i = 0; i < chr.length; i++){ //going through and checking the array chr has been populated
			System.out.print(chr[i]);
		}
		
		System.out.println(" "); // adding a gap between code blocks on console
		
		/**
		 * Converting all elements of ArrayList "list" to upper case
		 */
		
		ArrayList<String> toUpper = new ArrayList<String>(); // Creating temporary ArrayList
		
		for(String item: list){ // Traversing each element of list
			toUpper.add(item.toUpperCase()); // converting each element of list to upper case and passing it to temp array
		}
		list = toUpper; // Passing reference of toUpper to list
		System.out.println(list);
 	}
	

}
