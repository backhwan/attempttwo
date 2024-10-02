import java.util.*;
public class basiccalculator{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("give me a number");
        int first = input.nextInt();
        System.out.println("give me another number");
        int second = input.nextInt();
        System.out.println("give me operator");
        String operator = input.next();
        switch (operator) {
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                System.out.println(first / second);
                break;
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "%":
                System.out.println(first % second);
                break;
        }
    }
}