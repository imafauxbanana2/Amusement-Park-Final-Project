public class SplashMountain extends Attraction {
	
	 public SplashMountain(int a, int b, double c, double d, double e, double f, int g, double h, int p, int o) {
	        super(a, b, c, d, e, f, g, h, p);
	        time = 5;
	    }
		
	 public static void fallFinalVelo() {
	        double velocity = (2*-10*50) + (50*5);
	        System.out.println("The final velocity of Splash Mountain is: " + velocity + " m/s");
	    }
	 public static void throwUpPercent() {
	        int throwup = (int)(Math.random() * 5 + 1);
	        System.out.println(throwup + "% of people threw up");
	    }
	 
	 private int time;
	
	   public static void main(String args[]) {

	        Attraction connect = new Attraction(15, 7, 10.0, 42.0, 1.0, 1200, 10, 250.0, 21);

	        System.out.println("The daily cost to operate the ride is: $" + connect.dailyCost(7, 250.0));
	        System.out.println("The profit of the ride is: $" + connect.profit());
	        SplashMountain.throwUpPercent();
	        SplashMountain.fallFinalVelo();
	        



	    }
}
