//@author alex zhao
//prints out certain information on the ride Splash Mountain
//Heiser 7 12-13-2021
public class SplashMountain extends Attraction {
	
	 public SplashMountain(int a, int b, double c, double d, double e, double f, int g, double h, int p, int o) {
	        super(a, b, c, d, e, f, g, h, p);    //passes over to the constructor in superclass
	        time = 5; 							//ride time constant
	    }
		
	 public static void fallFinalVelo(int x) {           //passes over a random starting velo, prints out velocity
	        double velocity = (2*-10*50) + 5*x;
	        System.out.println("The final velocity of Splash Mountain is: " + velocity + " m/s");
	    }
	 
	 public static void throwUpPercent() {             //calculates a random value for amount of people throwing up
	        int throwup = (int)(Math.random() * 5 + 1);
	        System.out.println(throwup + "% of people threw up");
	    }
	 
	 private int time;    //time constant instance field
	
	 
	 
	   public static void main(String args[]) {             //test class
 
		   	int startingVelo = (int)(Math.random()) * 100 + 50;
		   
		   	Attraction connect = new Attraction(15, 7, 10.0, 42.0, 1.0, 1200, 10, 250.0, 21);
	        	
	        System.out.println("The daily cost to operate the ride is: $" + connect.dailyCost(7, 250.0));
	        System.out.println("The profit of the ride is: $" + connect.profit());
	        SplashMountain.throwUpPercent();
	        SplashMountain.fallFinalVelo(startingVelo);          //connects using class name because static
	        



	    }
}
