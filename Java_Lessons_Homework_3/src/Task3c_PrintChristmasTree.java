import java.util.Scanner;

public class Task3c_PrintChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() - 2;
        //int base = 2;
        for (int i = 1; i <= num; i ++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            } for(int r = 1; r <= (i * 2) - 1; r++) {
                System.out.print("*");
            }System.out.println();
        }
        for (int k = 1; k <= num; k++) {
            if (k==3) break;
            for (int m = num; m > k; m--) {
                System.out.print(" ");
            }for (int n = 1; n <= (k * 2) - 1; n++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
