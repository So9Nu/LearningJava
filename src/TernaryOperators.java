import java.util.*;
public class TernaryOperators {
    public static void main(String[] args) {


        System.out.println("Enter Your Gpa:");
    Scanner scanner = new Scanner(System.in);
    double score=scanner.nextDouble();
//    String result=(score>=40)?"You Passed ":"You Failed";
        double result=score*25;
        System.out.println("You got the percentage. "+ result);
        if (result>=20&&result<30){
            System.out.println("The Grade is D");
        } else if (result>=30&&result<40) {
            System.out.println("The Grade is D+");
        }
        else if (result>=40&&result<50) {
            System.out.println("The Grade is C+");
        }
        else if (result>=50&&result<60) {
            System.out.println("The Grade is C+");
        }
        else if (result>=60&&result<70) {
            System.out.println("The Grade is B");
        }
        else if (result>=70&&result<80) {
            System.out.println("The Grade is B+");
        }
        else if (result>=80&&result<90) {
            System.out.println("The Grade is A");
        }
        else if (result>=90&&result<100) {
            System.out.println("The Grade is A+");
        } else if (result>=0&&result<20) {
            System.out.println("The Grade is E");
        } else {
            System.out.println("Error!");
        }


//        boolean isLoading=true;
//
//        String result=(isLoading)?"loading":"Data loaded";
//
//        System.out.println(result);
        scanner.close();
    }
}
