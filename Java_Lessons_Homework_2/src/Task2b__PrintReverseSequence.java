import java.util.Scanner;

public class Task2b__PrintReverseSequence {
    public static void main(String[] args) {
        Scanner scReader = new Scanner(System.in);
        System.out.println("Please enter the number of limitation digits:");
        String number = scReader.nextLine();
        // int  i;
        for (int i = 0; i <= Integer.parseInt(number); ++i) ;
        {
            System.out.println("Please enter your number with limitation of " + number + " digits");
            String number1 = scReader.nextLine();
            int number2 = Integer.parseInt(number1);
            int reversed = 0;
                int j = Integer.parseInt(number);
                while (j != 0) {
                    if (j == 0) break;
                    j--;
                    int digit = number2 % 10;
                    reversed = reversed * 10 + digit;
                    number2 /= 10;
                    }
                System.out.println(reversed + " ");
            }
        }
    }




