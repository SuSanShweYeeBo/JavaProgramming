import java.util.Scanner;
public class ComputeCylinder {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter the radius and length of a cylinder:");
      double radius = input.nextDouble() ;
      double length = input.nextDouble();
      double area = radius * radius * 3.14;
      double volume = area * length ;
      System.out.println("The area of radius " + radius + " is " +area  );
      System.out.println("The volume of cylinder is " + volume);

    }

    
}
