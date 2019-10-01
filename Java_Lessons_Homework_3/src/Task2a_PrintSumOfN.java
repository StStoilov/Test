import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the limitation digits:");
        String number = sc.nextLine();
        System.out.println("Please enter your number with " + number + " limitation digits");
        String number1 = sc.nextLine();
        int num = Integer.parseInt(number);
        int num1 = Integer.parseInt(number1);
        int reversed = 0;
        int sum = 0;
        while (num1 != 0) {
            int digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 = num1 / 10;}
        while (num != 0) {
            if (num == 0) break;
            num--;
            sum = sum + reversed % 10;
            reversed = reversed / 10;
            }System.out.println(sum);
        }

    }




//while (j != 0) {
//        if (j == 0) break;
//        j--;
//        int digit = number2 % 10;
//        reversed = reversed * 10 + digit;
//        number2 /= 10;
//        }