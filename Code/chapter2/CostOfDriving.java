import java.util.Scanner;
public class CostOfDriving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance:");
        System.out.println("Enter miles per gallon:");
        System.out.println("Enter price per gallon:");
        double distance = input.nextDouble();
        double miles = input.nextDouble();
        double price = input.nextDouble();
        double DistanceInMiles = distance / miles ;
        double CostOfDriving =  DistanceInMiles * price;
        System.out.println("The cost of driving is $"+ CostOfDriving);
    }
    
}
