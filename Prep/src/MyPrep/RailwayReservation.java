package MyPrep;
import java.util.Scanner;

public class RailwayReservation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Gender Inquiry.Only women are allowed.
        System.out.println("What is your gender? Male or Female? ");
        String gender = sc.nextLine();

        int seats = 72;					//Total seats available for reservation

        //Execute the result according to the gender
        switch (gender) {
            case "Male":
                System.out.println("You are not allowed in this boggy. This boggy is reserved for Females only.");
                break;
            case "Female":
                System.out.println("You are allowed in this boggy.");
                System.out.println("Enter your age: ");
                int age = sc.nextInt();

                sc.nextLine(); // Consume the newline character

                
                //If seats are available for reservation
                while (seats > 0) {
                	//Senior citizens above the age of 64 are given priority. Number of unreserved seats are also checked.
                    if (age >= 65 && seats > 0) {
                        System.out.println("Seats left unreserved: " + seats);
                        System.out.println("Select your seat:\n lower\n upper\n middle\n side lower\n side upper");
                        String seat1 = sc.nextLine();
                        seats--;
                        System.out.println("Your " + seat1 + " seat is confirmed.");
                        
                        //If passenger want to book more seat
                        System.out.println("Seats remaining: "+seats);
                        if(seats>0) {
                        	System.out.println("Do you want to book more seat?");
                        	String bookmore = sc.nextLine();
                        	
                        	switch(bookmore) {
                        		case "yes":
                        			System.out.println("Select your seat:\n lower\n upper\n middle\n side lower\n side upper");
                                    String seat3 = sc.nextLine();
                                    seats--;
                                    System.out.println("Your " + seat3 + " seat is also confirmed.");
                                    System.out.println();
                                    break;
                        		case "no":
                        			System.out.println("No problem.");
                        			System.out.println();
                        }
                       }
                    } 
                    
                    //Seats reservation for passenger with age <65
                    else if (age < 65 && seats > 0) {
                        System.out.println("Seats left unreserved: " + seats);
                        System.out.println("Select your seat:\n lower\n upper\n middle\n side lower\n side upper");
                        String seat2 = sc.nextLine();
                        seats--;
                        System.out.println("Your " + seat2 + " seat is confirmed.");
                        
                        
                        //If passenger wants to book more seats
                        System.out.println("Seats remaining: "+seats);
                        if(seats>0) {
                        	System.out.println("Do you want to book more seat?");
                        	String bookmore = sc.nextLine();
                        	
                       	switch(bookmore) {
                		case "yes":
                			System.out.println("Select your seat:\n lower\n upper\n middle\n side lower\n side upper");
                            String seat3 = sc.nextLine();
                            seats--;
                            System.out.println("Your " + seat3 + " seat is also confirmed.");
                            System.out.println();
                            break;
                		case "no":
                			System.out.println("No problem. You have succesfully reserved your 1 seat.");
                			System.out.println();
                }
              } 
                // If no seat is remaining for reservation
                else {
                        System.out.println("Sorry. Reservation is full.");
                    }
                }
        }
    }
    }
}
