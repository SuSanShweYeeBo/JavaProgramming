import java.util.Scanner;

public class GivingTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double gratuityrate = (subtotal * gratuity / 100.0);
        double total = subtotal + gratuityrate;
        System.out.println(" The gratuity is $" + gratuityrate + " and total is $ " + total);

    }

}
