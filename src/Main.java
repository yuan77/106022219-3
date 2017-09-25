import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3, sum;
        System.out.print("please Input 1:");
        number1 = input.nextInt();
        System.out.print("please Input 2:");
        number2 = input.nextInt();
        System.out.print("please Input 3:");
        number3 = input.nextInt();
        sum = number1 + number2 - number3;
        System.out.printf("%d+%d-%d=%d", number1, number2, number3, sum);
        input.close();
    }
}
