public class FerrisWheel extends Attraction {
	
		Attraction connect = new Attraction(60, 8, 7.50, 36, 1.5, 900, 20, 50, 3);
			System.out.println(connect.profit());
		
		
}
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
	        int heightFright = (int)(Math.random() * 10 + 1);
	        System.out.println("This Month, while on the ride " + heightFright + " people puked because of their fears of height!");
	  }  
	  
	  public static void main(String args[]) 
	  {
		  Attraction BigO = new Attraction(60, 8, 7.50, 36.0, 1.5, 900, 20, 150.0, 20);
		
		  System.out.println ("Welcome to the BigO:");
		  FerrisWheel.gForce();
		  FerrisWheel.heightFright();
		  System.out.println("\nThe daily cost to operate the ride is: $" + BigO.dailyCost(8, 150.0));
		  System.out.println("\nThe profit of the ride is: $" + BigO.profit());
	  }		
}