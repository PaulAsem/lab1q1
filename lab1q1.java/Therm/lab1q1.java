package Therm;
// Student Name 	: Paul Asemota
// Student Id Number: C00263106
// Date 			: Sept-2021
// Purpose 			: My first class implementation
public class lab1q1
{ // begin class ThermTest
	
	public static void main(String args[]) 
	{ // being main method
		
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer();		// Create an instance of our Thermometer class
		//Variable for Temp B set t
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );  
		double tempB = 0;	
		thermB.setCelsius(10.0);
		tempB = thermB.getCelsius() + tempB;
		System.out.println("Temp. of Thermometer B is " + tempB);
				
	}
    
 // end main
} //