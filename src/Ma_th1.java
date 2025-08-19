import java.util.Scanner;
public class Ma_th1 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        double circumference;
        double area;
        double volume;
        double radius;
        double a;

        a=Math.pow(2,3);
        System.out.print("Enter the radius:");
        radius=scanner.nextDouble();
        circumference=2*Math.PI*radius;
        System.out.println("The circumference:" + circumference);

        area=Math.PI*Math.pow(radius,2);
        System.out.println("The area is:"+area);

        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
        System.out.println("The volume is:"+volume);
//        System.out.print(a +  "\n"+ circumference + "\n" + area + "\n" + volume);
    scanner.close();
    }
}
