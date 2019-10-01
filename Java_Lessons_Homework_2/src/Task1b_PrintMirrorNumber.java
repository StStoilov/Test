import java.util.Scanner;

public class Task1b_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), mirror;
        while (number > 0) {
            mirror = number % 10;
            number = number / 10;
            System.out.print(mirror);
        }
    }
}
