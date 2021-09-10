package OpenCloseP;

class Application {

    // It returns the total volume of the geometric objects
    public double get_total_area(Rectangle[] geo_objects)
    {
        // Variable to store total volume
        double area_sum = 0;

        // Iteratively calculating the area of each object
        // and adding it to the total area
        for (Rectangle geo_obj : geo_objects) {

            // Iteratively calculating the area of each object
            // and adding it to the total area
            area_sum += geo_obj.length * geo_obj.breadth;

        }

        // returning the to total area
        return area_sum;
    }
}