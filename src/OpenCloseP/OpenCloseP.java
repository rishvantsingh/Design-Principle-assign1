package OpenCloseP;

public class OpenCloseP {

    // Main driver method
    public static void main(String args[])
    {
        // Initializing a rectangle one & declaring dimensions by
        // creating an object of rectangle class in main() method
        Rectangle r = new Rectangle();

        // Custom entries
        r.length = 5;
        r.breadth = 10;


        // Similarly, initializing a rectangle2 and declaring dimensions
        // by creating object of rectangle class in the man() method
        Rectangle r2 = new Rectangle();

        // Custom entries
        r2.length = 2;
        r2.breadth = 4;


        // Initializing a rectangle3 and declaring dimensions by
        // creating object of rectangle class in the main() method
        Rectangle r3 = new Rectangle();

        // Custom entries
        r3.length = 3;
        r3.breadth = 12;

        // Now, declaring andinitializing Array of rectangle
        Rectangle[] r_arr = new Rectangle[2];
        r_arr[0] = r;
        r_arr[1] = r2;


        // Initializing the Application class
        Application app = new Application();

        // Getting the total area
        // using get_total_area
        double area = app.get_total_area(r_arr);

        // Print and Display the Total Volume
        System.out.println("The total area is " + area);
    }
}
