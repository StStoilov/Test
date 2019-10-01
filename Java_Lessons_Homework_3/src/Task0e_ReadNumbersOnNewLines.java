import java.util.Scanner;

public class Task0e_ReadNumbersOnNewLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int number1 = 1; number1 <= number; number1++) {
            System.out.printf("%d ", number1);
        }
    }
}
