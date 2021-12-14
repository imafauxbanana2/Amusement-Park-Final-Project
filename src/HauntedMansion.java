//@author Eric Morgan
public class HauntedMansion extends Attraction {

    public HauntedMansion(int a, int b, double c, double d, double e, double f, int g, double h, int p) {
        super(a, b, c, d, e, f, g, h, p);
    }
        //method to return the amount of riders who were scared
    public static void ridersScared() {
        int ridersScared = (int)(Math.random() * 10 + 1);
        System.out.println("The number of riders scared during the ride is: " + ridersScared + " people!");
    }

    public static void main(String args[]) {

        Attraction ClownMaze = new Attraction(15, 7, 10.0, 42.0, 1.0, 1200, 10, 250.0, 21);

        System.out.println("The daily cost to operate the ride is: $" + ClownMaze.dailyCost(7, 250.0));
        System.out.println("The profit of the ride is: $" + ClownMaze.profit());
        HauntedMansion.ridersScared();
        



    }
    
}
