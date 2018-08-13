package PracticalWork;
import java.util.Scanner;

public class Exercise3_TrainTicketProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double discount =1;
        double costPerMile =0.5;
        int distance =0;
        int ticketmultiplier =1;
        double cost =0;
        double total=0;
		System.out.println("Weclome to our train ticket program.");
		System.out.println("Firstly please enter how many tickets you wish to purchase:");
		int number = input.nextInt();
		if(number > 10) {System.out.println("You cannot enter more than 10 tickets at once, please enter a number less than or equal to 10");}
		else{ 
			for(int j =0; j<number; j++){
			
		System.out.println(" ");
		System.out.println("For ticket number " + (j+1) + ", please enter the type of ticket you would like to purchase.");
		System.out.println("If you would like a one way ticket. Please enter 1.");
		System.out.println("If you would like a return ticket. Please enter 2.");
		int ticket = input.nextInt();
		
		switch (ticket){
		case 1: ticketmultiplier =1; 
		        break;
		case 2: ticketmultiplier =2;
		        break;
		}
	
		System.out.println(" ");
		System.out.println("Now please enter which type of passanger you are:");
		System.out.println("If you are an under 10, please enter 1");
		System.out.println("If you are an under 16, please enter 2");
		System.out.println("If you are a student, please enter 3");
		System.out.println("If you are an over 60, please enter 4");
		System.out.println("If you fall into non of the above categories, please enter 5");
        int type = input.nextInt();	    
	    
        
	    switch (type){
	    case 1:  System.out.println(" ");
	    	     System.out.println("Are you being accompied on your journey by an adult? Please enter Y for Yes or N for No");
	    	     String	choice = input.next();
	    	     
	    	     switch (choice) {
	    	     case "Y": discount =0;
	    	     break;
	    	     case "N" :discount = 0.25;
	             break;}
	    	   
	    	    break;
	    case 2: discount = 0.5;
	            break;
	    case 3: discount = 0.75;
	            break;
	    case 4: discount = 0.4;
	            break;
	    case 5: discount =1;
	    		break;
	    }
       
	    
        System.out.println(" ");
	    System.out.println("Next please select the route you wish to travel on:");
	    
        System.out.println("Enter 1 for the Northern Line: (London, Peterborough, Doncaster, York, Newcastle, Edinburgh)" );
        System.out.println("Enter 2 for the Western Line: (London, Reading, Swindon, Bristol, Exeter)");
        System.out.println("Enter 3 for the Southern Line: (London, Gatwick, Brighton, Pourtsmouth, Southampton)");
        System.out.println("Enter 4 for the North Of England Line: (Liverpool, Manchester, Leeds, York, Durham, Newcastle)");
        System.out.println("Enter 5 for The Scottish Line: (Edinburgh, Dundee, Aberdeen, Inverness, Stirling, Glasgow)");
        int route = input.nextInt();
        
        System.out.println(" ");
        System.out.println("Please enter your starting stop on your selected route:");
        int start = input.nextInt();
        
        System.out.println(" ");
        System.out.println("Please enter your fininshing stop on your selected route:");
        int finish = input.nextInt();
	
        
        switch (route){
        case 1: int[] route1 = {74, 76, 30, 74,91};
        		if(start<finish){
                for(int i=start-1; i<finish-1; i++){
	            distance += route1[i];}}
                
        		else{
        		for(int k = finish-1; k<start-1; k++){
        	    distance += route1[k];}}
        		
        		cost = Math.round(100.0 *discount*ticketmultiplier*(costPerMile * distance))/100.0;
        		break;
        		
        case 2: int[] route2 = {37, 35, 35, 65};
                if(start<finish){
                for(int i=start-1; i<finish-1; i++){
        			distance += route2[i];}}
                
                else{
            		for(int k = finish-1; k<start-1; k++){
            	    distance += route2[k];}}
                
        		cost = Math.round(100.0 *discount*ticketmultiplier*(costPerMile * distance))/100.0;
        		break;
        
        case 3: int[] route3 = {25, 23, 42, 15};
        		if(start<finish){
                for(int i=start-1; i<finish-1; i++){
        			distance += route3[i];}}
        		 
        		else{
             		for(int k = finish-1; k<start-1; k++){
             	    distance += route3[k];}}
                 
        		cost = Math.round(100.0 *discount*ticketmultiplier*(costPerMile * distance))/100.0;
        		break;
	    
        case 4: int[] route4 = {31, 36, 22, 60, 14};
        		if(start<finish){
                for(int i=start-1; i<finish-1; i++){
        			distance += route4[i];}}
        		
        		else{
             		for(int k = finish-1; k<start-1; k++){
             	    distance += route4[k];}}
        		
        		cost = Math.round(100.0 *discount* ticketmultiplier* (costPerMile * distance))/100.0;
        		break;
        
        case 5: int[] route5 = {36, 58, 83, 95, 21};
        		if(start<finish){
                for(int i=start-1; i<finish-1; i++){
        			distance += route5[i];}}
                
                else{
             		for(int k = finish-1; k<start-1; k++){
             	    distance += route5[k];}}
                
        		cost = Math.round(100.0 *discount*ticketmultiplier*(costPerMile * distance))/100.0;
        		break;
        	}
		  total += cost;}
		}
		System.out.println(" ");
		System.out.println("For your " + number + " ticket(/s):");
		System.out.println("The total cost for your journey is: £" + total);
			
	
	}}


