import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabetic letter: ");
        String letter = scanner.nextLine();
        while (letter.length() != 1 || 
        !((letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z') || 
          (letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z'))) {
     
     if (letter.length() != 1) {
         System.out.println("You can only type one letter. Please enter a single letter: ");
     } else if (!(letter.charAt(0) >= 'A' && letter.charAt(0) <= 'Z') &&
                !(letter.charAt(0) >= 'a' && letter.charAt(0) <= 'z')) {
         System.out.println("You can only type alphabets. Please enter a single alphabet letter: ");
     }
     
     letter = scanner.nextLine();
    }
}
}