import java.util.Scanner;

public class Task1e_IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i, checkNum=0, flag=0;
        // int number2 = number % number;
        //System.out.println(number2);
        checkNum = number / 2;
        if (number == 0||number == 1) {
            System.out.println("false");
        } else {
            for (i =2 ; i <= checkNum; i++) {
                if (number % i == 0) {
                    System.out.println("false");
                    flag =1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("true");
            }
        }

        }
}

