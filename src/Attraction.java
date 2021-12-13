//@author: Alex Zhao, Eric Morgan, Matthew Jimenez
public class Attraction {
	
	//constructor

	public Attraction(int a, int b, double c, double d, double e, double f, int g, double h, int p) {

    		maxRiders = a;
    		hoursPerDay = b;
    		ticketCost = c;
    		height = d;
    		speed = e;
    		rideLength = f;
    		riderAmount = g;
    		rideCare = h;
    		timesRode = p;
    		
    }
    //method to calculate daily cost
    public double dailyCost(int k, double l) { //k is hoursPerDay, l is rideCare
    		return (double)(k*l);
    }
  
    
    //method to calculate profit
    public double profit() {  //i is ticketCost, j is riderAmount, they are all sent over from your own classes
    		double cost2 = (double)dailyCost(hoursPerDay, rideCare);
				return (double)((ticketCost*riderAmount*timesRode) - cost2);
    		
    }
    
    //instance variables
    private int maxRiders; //the maximum number of riders a ride can have
    private int hoursPerDay; //how many hours per day the ride operates
    private double ticketCost; //the tickets a ride costs
    private double height; //the height to get into a ride in inches
    private double rideLength; //the length of a ride in seconds
    private double speed; //the speed of a ride
    private int timesRode; //the number of times a ride is ridden
    private int riderAmount; //number of riders on a ride
    private double rideCare; //cost for ride upkeep
    private int rideTime;
}