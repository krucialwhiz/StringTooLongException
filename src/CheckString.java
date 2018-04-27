
import java.util.Scanner;

public class CheckString {

    public static void main(String[] args) throws StringTooLongException {
        
        Scanner input = new Scanner(System.in);
        
        String str1;
        final int MAX_STRING_LENGTH = 20;
        
        System.out.println("Enter strings, enter DONE when finished:\n");
        str1 = input.nextLine();
        if (str1.equalsIgnoreCase("done")) {
            System.exit(0); //exit on first prompt
        }
        do {
            try {
                if (str1.length() > MAX_STRING_LENGTH) {
                    throw new StringTooLongException();
                }
                System.out.println("\nEnter a string, enter DONE when finished:\n");
                str1 = input.nextLine();
            } catch (StringTooLongException e) {
                System.out.println(e.getMessage());
                str1 = input.nextLine();
            }
        } while (!str1.equalsIgnoreCase("done"));
        input.close();
    }
}
