//import java.util.Scanner;
import java.util.*;

public class Weight_Conversion {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
//
//        switch (number){
//            case value1:
//
//                break;
//        }
        System.out.println("Choose The Options.");
        System.out.println("1.Convert lbs to kgs.");
        System.out.println("2.Convert kgs to lbs.");
        int number;
        number=scanner.nextInt();
        if (number==1){
            System.out.println("Enter the weight in lbs: ");
            double weight=scanner.nextDouble();
           double result = weight*0.45;

            System.out.printf("The weight in kgs is. %.0f",result);
        } else if (number==2) {
            System.out.println("Enter the weight in kgs:");
            double weight=scanner.nextDouble();
            double result = weight/0.45;
            System.out.println("The weight in lbs is. "+result);
        }else{
            System.out.println("The Number your entered not in the opt.");
        }

        scanner.close();

    }
}
