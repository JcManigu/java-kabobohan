import java.util.Scanner;
public class first
{
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		//Args
		String user;
		int id;
		String color;
 
		//user input
		System.out.println("Enter your user ");
		user = input.nextLine();
 
		System.out.println("Enter your userid  ");
		id = input.nextInt();
 
	    System.out.println("Enter your color  ");
 
	    color  = input.next();
 
	    //loop 
	    for (int i = 1; i < 4; i++){
	        System.out.println("Output  #" +i);
	        System.out.println("Username " +user);
	         System.out.println("Id  "+id);
	            System.out.println("Color "+color);
	    }
        
	}
}
