import java.util.Scanner;

public class Task0c_ReadAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Пълнолетен си!");
        }
        else {
            System.out.println("Непълнолетен си!");
        }
    }
}
