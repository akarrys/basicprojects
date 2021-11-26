package main;
import java.util.*;
import flower.Flower; //import package flower to use variables made private
/*
 * Program that is based off a flower shop scenario. Program asks customer for name of flower,
 * and quantity. Cashier inputs price. The program then prints the results of whatever the customer and cashier inputs
 * Author: AK
 */


public class main {



	public static void main(String[] args) {
		System.out.println(Flower.getName()); //call to getName method
		System.out.println(Flower.getQuantity()); //call to getQuantity method
		System.out.println(Flower.updatePrice(Flower.getPrice())); //call to getPrice method
		
		
		
		
	 

	}

}
