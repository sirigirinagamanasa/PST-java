public class StringHandling {

    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("First character: " + s.charAt(0));
        System.out.println("Substring: " + s.substring(0, 5));
    }
}