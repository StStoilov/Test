import java.util.Scanner;

public class Task0d_ReadNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        for (int number = 1; number <= number1; number++) {
            System.out.printf("%d \n", number);
        }

    }
}
