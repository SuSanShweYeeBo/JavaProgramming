import java.util.Scanner;

public class SavingAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(("Enter the monthly saving value:"));

        double savings = input.nextDouble();
        double interest = 0.05 / 12;
        double totalSavings = 0;
        totalSavings += ((totalSavings + savings) * interest) + savings;
        totalSavings += ((totalSavings + savings) * interest) + savings;
        totalSavings += ((totalSavings + savings) * interest) + savings;
        totalSavings += ((totalSavings + savings)* interest )+ savings ;
        totalSavings += ((totalSavings + savings)* interest )+ savings ;
        totalSavings += ((totalSavings + savings)* interest )+ savings ;

        System.out.println("The account value is:" + totalSavings);

    }
}
