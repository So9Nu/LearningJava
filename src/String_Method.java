public class String_Method {
    public static void main(String[] args) {

        String name="One Two Three";

        int length=name.length();
        char letter=name.charAt(3);
        int index = name.indexOf("o");
        int lastIndedx=name.lastIndexOf("n");

        name=name.toUpperCase();
        name=name.toLowerCase();
//        System.out.println(name);
        System.out.println(index);

        name=name.trim();
//        System.out.println(name);
        name=name.replace("o","u");
        name=name.replace("n","r");
        System.out.println(name);

    }
}
