import java.util.Scanner;
public class ComputeAreaWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of radius:");
        double radius = input.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("The area of radius"+ radius + "is"+ area);

    }
    
}
