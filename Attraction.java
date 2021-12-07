//@author: Alex Zhao, Eric Morgan, Matthew Jimenez
public class Attraction {
	
	//constructor

	public Attraction(int a, int b, double c, double d, double e, double f, int g, double h) {

    		maxRiders = a;
    		hoursPerDay = b;
    		ticketCost = c;
    		height = d;
    		speed = e;
    		rideLength = f;
    		riderAmount = g;
    		rideCare = h;
    }
    //method to calculate daily cost
    public double dailyCost(int k, double l) { //k is hoursPerDay, l is rideCare
    		return (double)(k*l);
    }
  
    
    //method to calculate profit
    public double profit(int k, double l, double i, int j) {  //i is ticketCost, j is riderAmount
		
    	double cost2 = (double)dailyCost(k, l);
		return (double)((i*j) - cost2);
    		
    }
    //instance variables
    private int maxRiders; //the maximum number of riders a ride can have
    private int hoursPerDay; //how many hours per day the ride operates
    private double ticketCost; //the tickets a ride costs
    private double height; //the height to get into a ride
    private double rideLength; //the length of a ride
    private double speed; //the speed of a ride
    private int riderAmount;
    private double rideCare;
}