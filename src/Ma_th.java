import java.util.Scanner;

public class Ma_th {
    public static void main(String[] args) {

//    double result1;
//    double result2;
//    double result3;
//    double result4;
//    double result5;
//    double result6;
//    double result7;
//
//
//    result1=Math.pow(2,3);
//        result2=Math.abs(-3);
//        result3=Math.sqrt(3);
//        result4=Math.round(2.3);
//        result5=Math.ceil(2.3);
//        result5=Math.floor(2.3);
//        result6=Math.max(2,3);
//        result7=Math.min(2,3);
//
//        System.out.println(result1 + "\n" + result2 + "\n" + result3);
////        System.out.println(result2);
////        System.out.println(result3);
//        System.out.println(result4);
//        System.out.println(result5);
//        System.out.println(result6);
//        System.out.println(result7);

Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A:");
        a=scanner.nextDouble();
        System.out.print("Enter the lenght of side B:");
        b=scanner.nextDouble();
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.print("The hypotenuse (side of c ) is:"+c);



    }
}
