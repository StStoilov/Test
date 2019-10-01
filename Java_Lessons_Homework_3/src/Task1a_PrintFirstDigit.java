import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int firstDigit = Integer.parseInt(Integer.toString(digit).substring(0,1));
        System.out.println(firstDigit);
    }
}
