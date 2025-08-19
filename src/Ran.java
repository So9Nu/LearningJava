import java.util.Random;
import java.util.Scanner;
public class Ran {
    public static void main(String[] args) {

        Random random=new Random();

//         int number1;
//        int number2;
//        int number3;
//        number1=random.nextInt(1,3);
//        number2=random.nextInt(3,6);
//        number3=random.nextInt(6,10);
//        System.out.println(number1);
//        System.out.println(number2 );
//        System.out.println(number3 +"\nrandom number");
//        number1=+number1+number2+number3;



//        double n;
//         n= random.nextDouble();
//        System.out.println(n);
//
//
        Scanner scanner=new Scanner(System.in);

        boolean isHeads;
        System.out.println("Enter a number:");
        String name =scanner.nextLine();
        isHeads=random.nextBoolean();
        if (isHeads){
            System.out.println("Heads,"+name);
        }else{
            System.out.println("Tails,"+name);
        }

    scanner.close();
    }
}
