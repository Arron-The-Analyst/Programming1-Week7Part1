package PracticalWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Exercise1_ArrayMethods {

	public static StringBuilder numbers = new StringBuilder();
	
	public static void main(String[] args) {
		System.out.println("Welcome to our Array Program");
		System.out.println("Please enter your array of numbers");
		Scanner input = new Scanner(System.in);
		String array = input.nextLine();
        numbers.append(array);
       System.out.println(" ");
       System.out.println("For your array:");
        sum();
        maximun();
        minumen();
        average();
        copy();
	}

	public static void sum(){
		
		int sum =0;
		String[] a = numbers.toString().split(" ");
		for(String i : a){
			int b =Integer.parseInt(i);
			sum += b;}
		
		System.out.println("The sum of all the elements in your array is: " + sum);
		return;
	}
	
	public static void maximun() {
		String[] a = numbers.toString().split(" ");
		ArrayList<Integer> max = new ArrayList<Integer>();
		int b = 0;
		for(String i : a){
		   int 	c = Integer.parseInt(i);
		   max.add(c);}
		 b = Collections.max(max);
		 System.out.println("The maximun value in your array is: " + b);
         return;
		}
	
	public static void minumen() {
		String[] a = numbers.toString().split(" ");
		ArrayList<Integer> min = new ArrayList<Integer>();
		int b =0;
		for(String i : a){
			int c =Integer.parseInt(i);
			min.add(c);}
		b = Collections.min(min);
		System.out.println("The minimun value in your array is: " + b);
	        return;
		}
	
	public static void average() {
		int sum =0;
		int d= 0;
		String[] a = numbers.toString().split(" ");
		for(String i : a){
			int b =Integer.parseInt(i);
			sum += b;}
		
		 int average = (sum / a.length);
	     System.out.println("The average value of your array is: " + average);
	     return;
		}
	
	public static void copy() {
		StringBuilder copy = new StringBuilder();
		copy.append(numbers);
		System.out.println("A copy of your array is: " + copy);
	}
	
	
	
	
	
}
