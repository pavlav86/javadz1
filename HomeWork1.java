package HomeWork1;

import java.util.Scanner;


public class HomeWork1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean f = true;
        
        while (f) {
        System.out.println("\n\nPlease choose the action:\n1 - Task 1\n2 - Task 2\n3 -  - Exit the program\n");
        int action = Integer.parseInt(scanner.nextLine());
        
        if (action == 1) {
            task1();
        }
        else if (action == 2) {
            task2();
        }
       
        else if (action == 9) {
            f = false;
        }

        }
        



        
        
    }

    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
    // чисел от 1 до n)

    public static void task1() {
        
        System.out.print("Input the number: ");
        int number = Integer.parseInt(scanner.nextLine());

        int triangle = number * (number + 1) / 2;
        System.out.println("\nThe " + number + "th triangular number: " + triangle);
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + ": " + factorial);
    }

    // Вывести все простые числа от 1 до 1000

    public static void task2() {

        int n = 1000;
        System.out.printf("'\nPrime numbers from 1 to %d:\n", n);
        for (int i = 2; i <= n; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                System.out.printf("%d ", i);
            }
        }
    }

   

}
        
    

    