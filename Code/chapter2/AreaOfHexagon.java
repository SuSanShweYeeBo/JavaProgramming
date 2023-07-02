import java.util.Scanner;
public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side:");
        double length = input.nextDouble();
        double area = 3 * Math.sqrt(3) /2 * length *length;
        System.out.println("The area of the hexagon is " + area);
    }
    
    
    
}
