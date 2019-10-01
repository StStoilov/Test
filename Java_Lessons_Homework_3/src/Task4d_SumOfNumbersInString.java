import java.util.Scanner;

public class Task4d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int sum=0;
        String num = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                num = num + text.charAt(i);
            } else {
                if (!num.equals("")) {
                    sum=sum + Integer.parseInt(num);
                    num="";
                }
            }
        }
        System.out.println(sum);
    }
}
