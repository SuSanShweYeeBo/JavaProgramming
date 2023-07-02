import java.util.Scanner;

public class ComputeCylinderVolume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double length;
        System.out.println("Enter the radius and length of a cylinder:");
        radius = input.nextDouble();
        length = input.nextDouble();
        double area = radius * radius* 3.14;
        double volume = area * length;
        System.out.println("The area of radius " + radius + " is " + area ); 
        System.out.println("The volume of the cylinder is " + volume );

    }

}
