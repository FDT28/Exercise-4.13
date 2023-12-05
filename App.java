import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabetic letter: ");
        String letter = scanner.nextLine();
        while ((letter.length()!=1)||(!(Character.isLetter(letter.charAt(0))))) {
            if (letter.length()!=1) {
                System.out.println("You can only type one letter. Please enter a single letter: ");
                letter = scanner.nextLine();
            }
            else if (!(Character.isLetter(letter.charAt(0)))) {
                System.out.println("You can only type alphabets. Please enter a single alphabet letter: ");
                letter = scanner.nextLine();
            }

        }
        char lowercaseLetter = Character.toLowerCase(letter.charAt(0));
        if (lowercaseLetter == 'a'||lowercaseLetter == 'e'||lowercaseLetter == 'i'||lowercaseLetter == 'o'||lowercaseLetter == 'u'){
            System.out.println(lowercaseLetter + " is a vowel");
        }
        else {
            System.out.println(lowercaseLetter + " is a constant");
        }
        scanner.close();
    }
}
