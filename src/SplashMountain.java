//@author alex zhao
//prints out certain information on the ride Splash Mountain
//Heiser 7 
//12-13-2021
public class SplashMountain extends Attraction {
	
	/**
	 * @param a- the maximum number of riders a ride can have
	 * @param b- how many hours per day the ride operates
	 * @param c- the tickets a ride costs
	 * @param d- the height to get into a ride in inches
	 * @param e- the speed of a ride
	 * @param f- the length of a ride in seconds
	 * @param g- number of riders on a ride
	 * @param h- cost for ride upkeep
	 * @param p- the number of times a ride is ridden
	 */
	 public SplashMountain(int a, int b, double c, double d, double e, double f, int g, double h, int p, int o) {
	        super(a, b, c, d, e, f, g, h, p);    //passes over to the constructor in superclass
	        time = 5; 							//ride time constant
	    }
		
	 public static void fallFinalVelo(int x) {           //passes over a random starting velo, prints out final velocity
	        double velocity = (2*-10*50) + 5*x;
	        System.out.println("The final velocity of Splash Mountain is: " + velocity + " m/s");
	    }
	 
	 public static void throwUpPercent() {             //calculates a random value for amount of people throwing up
	        int throwup = (int)(Math.random() * 5 + 1);
	        System.out.println(throwup + "% of people threw up");
	    }
	 
	 public static void deathToll() {						//calculates percent of people who died
		 double maxRiders = (Math.random() * 20 + 1);
		 int percent = (int)maxRiders/15;
		 System.out.println(percent + " percent of people died :(");
	 }
	 
	 private int time;    //time constant instance field
	
	 
	 
	   public static void main(String args[]) {             //test class
 
		   	int startingVelo = (int)(Math.random()) * 100 + 50;    //random starting velocity for splash mountain
		   
		   	Attraction connect = new Attraction(20, 8, 11.5, 40.0, 2.0, 1520, 11, 300.0, 15);     //passes over starting parameters for superclass
	        	
	        System.out.println("The daily cost to operate the ride is: $" + connect.dailyCost(7, 250.0));
	        System.out.println("The profit of the ride is: $" + connect.profit());      //prints from superclass
	        SplashMountain.throwUpPercent();
	        SplashMountain.fallFinalVelo(startingVelo);          //connects using class name because static
	        SplashMountain.deathToll();



	    }
}
