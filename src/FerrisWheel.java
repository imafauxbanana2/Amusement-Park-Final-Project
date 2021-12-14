//@author Matthew Jimenez
//prints out certain information on the ride Ferris Wheel
//Heiser 7 12-12-2021
public class FerrisWheel extends Attraction {
	
	  public FerrisWheel(int a, int b, double c, double d, double e, double f, int g, double h, int p) 
	  {
	        super(a, b, c, d, e, f, g, h, p);
	  }
	
	  public static void gForce()
	  {		  
		//Calculate gForce by dividing its average acceleration by the acceleration due to gravity which is 32 ft/s^2
	        double gForce= (1.5/32);
	        System.out.println("The g-force of the ride is: " + String.format("%1.2f", gForce) + " G's! \n");
	  }
	  
	  public static void heightFright() 
	  {
		//Calculate the number of people who will puke on the ride
	        int heightFright = (int)(Math.random() * 10 + 1);
	        System.out.println("While on the ride " + heightFright + " people puked because of their fears of height!");
	  }  
	  
	  public static void main(String args[]) 
	  {
		//Intialize the variables inherited variables from the Attraction class
		Attraction BigO = new Attraction(60, 8, 7.50, 36.0, 1.5, 900, 20, 150.0, 20);
		
		System.out.println ("Welcome to the BigO:");	//Introduce the Attraction
		FerrisWheel.gForce();	//Call the gForce method
		FerrisWheel.heightFright();	//Call the heightFreight method
		System.out.println("\nThe daily cost to operate the ride is: $" + BigO.dailyCost(8, 150.0));	//print the cost of maintenance for this ride
		System.out.println("\nThe profit of the ride is: $" + BigO.profit());	//print the profit that this ride generates
	  }		
}
