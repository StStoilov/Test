import java.util.Scanner;

public class Task4c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text here:");
        String text = sc.nextLine();
        String [] array = text.split("\\?|\\.|\\!");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        }

    }


