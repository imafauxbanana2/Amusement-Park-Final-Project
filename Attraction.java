public class Attraction {
    //@author: Alex Zhao, Eric Morgan, Matthew Jimenez
	
	
	//constructor
    
	public Attraction(int a, int b, double c, double d, double e, double f) {
    		maxRiders = a;
    		hoursPerDay = b;
    		ticketCost = c;
    		height = d;
    		speed = e;
    		rideLength = f;
    }
    //method to calculate daily cost
    public void dailyCost() {

    }
    //method to calculate profit
    public void profit() {

    }
    //instance variables
    private int maxRiders; //the maximum number of riders a ride can have
    private int hoursPerDay; //how many hours per day the ride operates
    private double ticketCost; //the tickets a ride costs
    private double height; //the height of a ride
    private double rideLength; //the length of a ride
    private double speed; //the speed of a ride

}