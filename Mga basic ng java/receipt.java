    import java.util.Scanner;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    public class Main
    {
    	public static void main(String[] args) {
    	    //scanner api
    		Scanner input  = new Scanner(System.in);
    		try {
    		    //value and price 
    		    String shopname;
    		   String item1, item2 = "";
    		    int cash = 200;
    		  double price1, price2 = 0;
    		     String choice;
    		     //end 
    		     //date api
    		    LocalDateTime myDateObj = LocalDateTime.now();
    		     DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    		     //end of date api
    		     //input 
    		     System.out.println("RECEIPT GENERATOR  made by jcewan");
    		    System.out.println("Enter your shopname");
    		    shopname =  input.nextLine();
    		      System.out.println("Enter your item");
    		    item1 =  input.nextLine();
    		       System.out.println("Enter your price ");
    		    price1 =  input.nextDouble();
    		    input.nextLine();
    		    System.out.print("Would you like to add item 2? (yes/no): ");
    		          choice = input.nextLine().trim().toLowerCase();
    
                if (choice.equals("yes") || choice.equals("y")) {
                    System.out.print("Enter your item 2: ");
                    item2 = input.nextLine();
                    System.out.print("Enter your price 2: ");
                    price2 = input.nextDouble();
                    
                    
                }
                 
                //end of input value
                //output
                 for (int i = 1; i < 6; i++){
    		     String formattedDate = myDateObj.format(myFormatObj);
               System.out.println("CASH RECEIPT");
                System.out.println("Shopname:"+ shopname);
                System.out.println(" address 67 street");
                System.out.println("pisbik.com");
                System.out.println("0968");
                System.out.println(formattedDate);
               System.out.println("--------------------");
    		    System.out.println("Item : " + item1 + " - PHP" + price1);
    		    //total 
    		                double total = price1;
                         if (!item2.isEmpty()) {
                    System.out.println("Item 2: " + item2 + " - PHP" + price2);
                          total += price2;
                }
                System.out.println("--------------------");
                System.out.println("Total: PHP" + total);
                System.out.println("Cash "+cash);
                System.out.println("Change");
                System.out.println(cash - total);
                 }
            //end of output
    			//catch the error
    		} catch(Exception E) {
    			System.out.println("Invalid Price Try Again ");
    		}
    		
    	}
    }
