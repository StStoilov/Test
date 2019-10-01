import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the limitation digits");
        String number = sc.nextLine();
        int num = Integer.parseInt(number);
        System.out.println("Please enter number with " + number + " limitation digits");
        String number1 = sc.nextLine();
        int num1 = Integer.parseInt(number1);
        for (int i = 1; i <= num; ++i) {
            int num2 = num1 % 10;
            //System.out.println(num2 + " n2");
            int even = num2 % 2;
            //System.out.println(even + "even");
            num1 /= 10;
            if (even == 0) {
                System.out.print(num2 + " ");
                }else System.out.println("Not an even number");
        }


                }
            }

