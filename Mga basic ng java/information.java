//jdk
import java.util.Scanner;
//class

class Person {
 
    String name;
     char gender;
    int age;
    char btype;
   
    Person(String name ,char gender,int age,char btype){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.btype  = btype;
        System.out.println("--PERSON INFORMATION---");
        System.out.println("Name:"+name +'\n'  +"Gender: " + gender + '\n' + "Age "+ age + '\n' + "Bloodtype: "+  btype);
    }
    
}

public class information
{
	public static void main(String[] args) {
	    System.out.println("scanner w class (mad by jc6969) ")
	    Scanner s = new Scanner(System.in);
	      System.out.println("Enter your name");
	     String name = s.nextLine();
	      System.out.println("Gender (M OR F)");
         char gender = s.next().charAt(0);
          System.out.println("Age");
          int age = s.nextInt();
          System.out.println("Bloodtype");
          char btype = s.next().charAt(0);
        Person p = new Person(name,gender,age,btype);
        
	}
}
