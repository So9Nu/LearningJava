import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
    // compound interest calculator.
        Scanner scanner = new Scanner(System.in);

        double principle;
        double rate;
        int times;
        int years;
        double amount;
        System.out.print("Enter the Principle amount: ");
        principle=scanner.nextDouble();

        System.out.print("Enter the interest (in %) rate: ");
        rate=scanner.nextDouble() / 100;

        System.out.print("Enter the # times per year: ");
        times=scanner.nextInt();

        System.out.print("Enter the # of Years: ");
        years=scanner.nextInt();

        amount = principle * Math.pow(1 + rate / times, times * years);
        System.out.printf("The amount after %d years is %.2f ", years,amount);

        scanner.close();
    }
}
