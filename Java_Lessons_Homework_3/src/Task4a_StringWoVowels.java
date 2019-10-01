import java.util.Scanner;

public class Task4a_StringWoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String newString = text.replaceAll("[AaeEiIoOuU]", "");
        System.out.println(newString);
    }

}
