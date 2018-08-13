package PracticalWork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise2_EightIntegerProgram {

	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
       boolean error =false;
       boolean success = false;
       
       do{	System.out.println("(Take great care when entering your numbers to make sure you enter 8 unique numbers!!)");	   
       		System.out.println("Please enter the eight integers that you wish to print to the console:");
	        String array = input.nextLine();
	        StringBuilder modified = new StringBuilder();
	        modified.append(array);
	        String[] numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
	        ArrayList<Integer> integers = new ArrayList<Integer>();
	        String[] a = modified.toString().split(" ");
	        System.out.println(" ");
	        
	        if(a.length !=8){ 
	        	System.out.println("You have not entered eight elements into your array, Please try again!!");
	        	error =true;}
		
	        for(String i: a){
	        	int b = Integer.parseInt(i);
	        	if(integers.contains(b)){
	        		System.out.println("The number " +b + " has already been inputted into this list. Please try again!!");
	        		error= true;
	        		break;}
		
	        	else {integers.add(b);}
	        }
	       
	        for (int j=0; j<8; j++) {
	        	if(error){break;}
	        	System.out.println("Element " + numbers[j]  + ": "+ integers.get(j));	
	            success =true;
	        }
        
	        System.out.println(" ");
	        if(success){break;}
       }while(true);
	}
}
