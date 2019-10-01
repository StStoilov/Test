import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = sc.nextInt();
        int sum = 0;
        while (digits > 0) {
            sum = sum + digits % 10;
            digits = digits / 10;
        }
        System.out.print(sum);
    }
}
