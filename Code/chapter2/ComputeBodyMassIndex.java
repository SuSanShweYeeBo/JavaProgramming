import java.util.Scanner;
public class ComputeBodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a weight in pounds:");
        System.out.println("Enter a height in inches:");
        double weight = input.nextDouble();
        double height = input.nextDouble();
        double weight_in_kilogram = weight * 0.45359237;
        double height_in_meter = height * 0.0254; 
        double BMI = (weight_in_kilogram) / (height_in_meter*height_in_meter) ;
        System.out.println("BMI is" + BMI);


    }
}
