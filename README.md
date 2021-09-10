# Design-Principle-assign1


Perfect Code- The solid principles of   
                                                Programming.









					  			

    

What is a perfect and clean code?

Well  a perfect code is code which implements all the solid Design principles of programming and makes the code presentable with least number of error. 

                  Programming is the art of telling another human what one wants the computer to do.
                    — Donald Knuth

                                                       





Reason for Solid principle

So, what is SOLID and how does it help us write better code? Simply put, Martin and Feathers' design principles encourage us to create more maintainable, understandable, and flexible software.
 Consequently, day by day our applications are growing in size , lowering  the complexity and save ourselves a lot of headaches further down the road!
The following five concepts make up our SOLID principles:

Single Responsibility
Open/Closed
Liskov Substitution
Interface Segregation
Dependency Inversion


Single Responsibility Principle

“There should  never be more than one reason to change a class.”

Now SRP holds true for the first above fact .This simply means that single class should hold only one job to do .
It does not mean that your classes should only contain one method or property.
Lets take an example :-  its same like a project is divided into different members performing different task as 
the frontend engineer , backend developer, Tester and many more.
So simply like them a program should be divided into different classes performing their own work .
It results in proper deployment of project and bug fixing .
Whenever there is any change, this principle helps to implement the change in one class without disturbing the others.
Benefits of this principle are:
For example:
Lets take this EmailContent class .This class will take in the type and content of the email sender.
This class implements the IEmailContent class
package SignlerResponsibilityP;
public class EmailContent implements IEmailContent
{
   private String type;
   private String content;
}

Second class is EmployeeStore

    package SignlerResponsibilityP; 
    public class EmployeeStore implements IEmployeeStore
{
//inject in runtime
private IEmailSender emailSender;
    @Override
public Employee getEmployeeById(Long id) {
return null;
}

@Override
public void addEmployee(Employee employee) {
}
}

This class is now helping to sending the mail by taking the argument from the Iemployeestore class.
Thus we can find that all classes are doing their own work by implementing their own functionality and implementing them without depending on any other class.


Open Close Principle:-

Robert C. Martin considered this principle as the “the most important principle of object-oriented design”. But he wasn’t the first one who defined it. He explained the Open/Closed Principle as:

“Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.”

This might sound quite abstract and academic. What it means though is that whenever there is any change in the requirement there should be no change in all the code.Thus we should strive to write such a code. How we do that can differ a bit depending on the context, such as our programming language. When using Java, C# or some other statically typed language the solution often involves inheritance and polymorphism, which is what this example will illustrate.

Example involves Calculating the area of rectangle
The below code involves calculating the area of rectangle.


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

Now the class OPenCloseP involves :-

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
   }}
Now above class shows the making of three rectangle instances and it shows if we want to change the behaviour of any method we can change it without disturbing the whole functionality of class.

The Liskov Substitution Principle:-

Subtypes must be substitutable for their base types.

The precept defines that gadgets of a superclass will be replaceable with gadgets of its subclasses with out breaking the application. That calls for the gadgets of your subclasses to act withinside the equal manner because the gadgets of your superclass.
“ If for every item o1 of kind S there may be an item o2 of kind T such that for all applications P described in phrases of T, the conduct of P is unchanged whilst o1 is substituted for o2 then S is a subtype of T. “

Lets take this example by the help of program: - 
This is a father class which is taking the relation between father and son and thus the other class object will act as base object for the other class.


public class Father {
             public void reduction(CharSequence seq){
                     System.out.println("father : " + seq);
                }
             public void enlarge(String str){
                     System.out.println("father : " + str);
                 }
}


Reference:-

1-https://www.baeldung.com/solid-principles
2- https://stackify.com/dependency-inversion-principle/







.
