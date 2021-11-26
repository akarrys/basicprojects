package flower;
import java.util.*;

public class Flower {
	// instance variables
	
public static String name; //name of the flower
public static int quantity; //number of petals for flower
public static float price; //the price of the flower


//constructor
public Flower (String n, int q, float p) {
	n = name;
	q = quantity;
	p = price;
	
}
//accessor methods
public static String getName() { //static string method to get flower name
	Scanner namekeyboard = new Scanner(System.in); //scanner object declared
	System.out.println("What is the name of the flower? "); //Ask customer name of flower
	String name = namekeyboard.nextLine(); //Take whatever user inputs in keyboard 
	System.out.print("The name of the flower is: ");
	return name; //exit method
	
}
public static int getQuantity() {  //static method to get amount of petals
	Scanner quantitykeyboard = new Scanner(System.in);  //scanner object declared
	System.out.println("How many petals? "); //asks customer how many petals
	quantity = quantitykeyboard.nextInt(); //cashier enters in int value pedals
	System.out.print("petals purchased: ");
	return quantity; //exit method
	

}


public static float getPrice() {  //static method to get price of flower
	Scanner pricekeyboard = new Scanner(System.in); //scanner object declared
	System.out.println("The current price of that flower is ");//Tell customer price of flower
	price = pricekeyboard.nextFloat(); //takes only float values in what cashier inputs
	System.out.print("Your total is: ");
	return price; //exit method
}


public static float updatePrice(float Price) { //static method to update price based on previous methods inputs
	if(quantity> 0 && price > 0) { //make sure both can not be 0, not possible
		Price = Price * quantity; // total is based on quantity multiplied by price
		
	
	}
	 return Price; //exit method
	
 
}



}
