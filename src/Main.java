import java.util.Scanner;

//codes for reversing an input string
public class Main {

    // Time complexity - O(n)
    // Space complexity - O(n)
    // simple solution, but not good
    public static String reverseStringCh(String message) {
        String reverseString = "";
        char currentChar;

        if (message.isEmpty()) {
            System.out.println("message is empty");
            return "";
        } else if (message.isBlank()) {
            System.out.println("message is blank");
            return "";
        } else if (message.length() == 1) {
            return message;
        } else {
            for (int i = message.length() - 1; i >= 0; i--) {
                currentChar = message.charAt(i);
                reverseString += currentChar;
            }
        }

        String result = "Reversing " + "\"" + message + "\"" + " using Character concatenation: " + reverseString;
        return result;
    }

    // Time complexity - O(n)
    // Space complexity - O(1) ???
    // better solution
    public static String reverseStringSB(String message) {
        if (message.isEmpty()) {
            System.out.println("message is empty");
            return "";
        } else if (message.isBlank()) {
            System.out.println("message is blank");
            return "";
        }

        StringBuilder sb = new StringBuilder(message);
        String result = "Reversing " + "\"" + message + "\"" + " using a StringBuilder: " + sb.reverse().toString();

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the String you want to reverse: ");
        String message = sc.nextLine();

        System.out.println(reverseStringCh(message));
        System.out.print(reverseStringSB(message));
    }
}