import java.util.Scanner;
public class Substring {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String email;
        System.out.println("Enter Your Email:");
       email = scanner.nextLine();
       // sonu@gmail.com;
//        int index=email.indexOf("@");
//        int length=email.length();
        String username=email.substring(0,email.indexOf("@"));

        System.out.println(username +" " + username.length());
    }
}
