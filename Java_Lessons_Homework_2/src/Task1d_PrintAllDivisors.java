import java.util.Scanner;

public class Task1d_PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), divisors;
        for (divisors = 1; divisors < number; divisors++) {
            int y = number % divisors;
            if (y!=0) continue;
            System.out.print(divisors+" ");
        }
        //System.out.println(number);

    }
}
