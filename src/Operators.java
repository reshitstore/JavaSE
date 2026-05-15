import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1, num2, addition;

        System.out.println("enter first number");
        num1 = keyboard.nextDouble();
        System.out.println("enter second number");
        num2 = keyboard.nextDouble();

        addition = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));



    }
}
