import java.util.Scanner;

public class Task4b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int countWords = 0;
        for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ') {
                    countWords++;
                }
                }
        System.out.println("The total number of words in the string are: " + (countWords+1));
    }
}
