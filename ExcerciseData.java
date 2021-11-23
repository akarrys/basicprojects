package main;
import java.util.Scanner;

public class ExcerciseData {
	public static int a;  //variables are public and static making it usable for other classes 
	public static double b;
	public static boolean user;
	public static byte d;
	public static char e;
	public static short f;
	public static float g;
	public static long h;

	public static void inputAllBaseTypes(int a, double b, boolean user, byte d, char e, short f, float g, long h) {  //static method
		Scanner keyboard = new Scanner(System.in); //scanner object created and declared keyboard of scanner object
		System.out.println("Please enter an integer, integers are between -2,147,483,648 to 2,147,483, 647");
	    a = keyboard.nextInt(); //integer value from keyboard input
		System.out.println("Please enter a double value, double values are between ex = 2.00, 25.00 1.7e-308 to 1.7e+308");
		b = keyboard.nextDouble(); //double value from keyboard input
		System.out.println("Are you above 18? true or false?");
	    boolean u = keyboard.nextBoolean();
	
	    if (u == true) {
		  System.out.println("You are 18");
	    } else {
		  System.out.println("You are not 18");
	    }
	       user = u; //stores true or false for boolean value user
	   
	    System.out.println("Please enter a byte value, bytes are between, -128 to 127");
	    d = keyboard.nextByte(); // byte value from keyboard input
	    System.out.println("Please enter a char value, char values are single letters or ASC 2 values");
	    e = keyboard.findWithinHorizon(".",0).charAt(0); //gets char value at keyboard input from keyboard scanner index [0]
	    System.out.println("Please enter a short value, a short value is within -32,768 to 32,767");
	    f = keyboard.nextShort(); // short value from keyboard input
	    System.out.println("Please enter a float value, a float value is within 6 to 7 decimal digits...ex 4.676544");
	    g = keyboard.nextFloat(); // float value from keyboard input
	    System.out.println("Please enter a long value, a long value is within 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 ");
	    h = keyboard.nextLong(); // long value from keyboard input
	    
	    System.out.println("The values of all base types inputed are: " + (a)); //prints all values that were entered into keyboard scanner and returns the values
	    System.out.println(b);
	    System.out.println(u);
	    System.out.println(d);
	    System.out.println(e);
	    System.out.println(f);
	    System.out.println(g);
	    System.out.println(h);
	  keyboard.close();
	
		
		
	
	} 

}
