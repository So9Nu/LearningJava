import java.util.Scanner;
public class Statement {
    public static void main(String[] args) {

        boolean isStudent=true;
        boolean isSenior;
         int age;
        double price = 9.99;
        String name="sonu";
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your age for discount:");
        age=scanner.nextInt();

        System.out.print("Are You Students(true/false):");
        isStudent=scanner.nextBoolean();

        System.out.print("Are You Senior Citizen(true/false):");
        isSenior=scanner.nextBoolean();

        if (isStudent){
            System.out.println("You get a student discount of 10% ");
            price*=0.9;
        }else if (isSenior){
            System.out.println("You get a Senior Discount on Movies Tickets of 20%.");
            price*=0.8;
        }else {
            price*=1;
        }
        System.out.println("The price of a ticket is: $" + price);
        scanner.close();
    }
}
