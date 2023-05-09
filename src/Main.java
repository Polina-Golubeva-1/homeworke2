import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//управ. констр.
        // 1
        /*  Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {

            case 12:
            case 1:
            case 2:
                System.out.println(number + "Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(number + "Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(number + "Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(number + "Осень");
                break;

            default:
                System.out.println("The end");
        }
//2
       System.out.println("Enter number of month: ");
       number = scanner.nextInt();

        if ((number == 12) || (number == 1) || (number == 2))  {
            System.out.println("Зима");
        } else if ((number == 3) || (number == 4) || (number == 5)) {
            System.out.println("Весна");
        } else if ((number == 6) || (number == 7) || (number == 8)) {
            System.out.println("Лето");
        } else if ((number == 9) || (number == 10) || (number == 11)) {
            System.out.println("Осень");
               } else {
                System.out.println("The end");
            }
      //3
        int x = 4;
         if (x % 2 == 0) {
        System.out.println("Четное");
        } else {
           System.out.println("Не четное");
       }
    //4
        int t = -22;
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 & t > -20 ) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        } else {
            System.out.println("The end");
        }
        //Цыклы
        //1.При помощи цикла for вывести на экран нечетные числа от 1 до 99.

        for (int i = 1; i <= 99; i++) {
            if (i%2 != 0) {
                System.out.println(i +" ");
            }
        }
        //2. Необходимо вывести на экран числа от 5 до 1.

        for (int i = 5; i >= 0; i--) {
                    System.out.println(i + " ");
                }
        //3. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа. Для ввода числа воспользуйтесь классом Scanner.
        Scanner scanner = new Scanner(System.in);
        int secondResult = scanner.nextInt();
        int g = 0;
        for (int i = 1; i <= secondResult ; i++) {
            g = g + i;
        }
        System.out.println(g);*/


/*//4.Необходимо, чтоб программа выводила на экран вот такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//В решении используйте цикл while.

        int x = 7;

        while (x<=98) {
            System.out.println(x);
            x = x + 7;
        }
        System.out.println("This is end!");


        //5.Вывести 10 первых чисел последовательности 0, -5,-10,-15.
           num = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
            num = num - 5;
        }
        System.out.println("This is end!");*/
        //6.Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
        for (int x = 10; x <= 20 ; x++) {
            System.out.println(Math.pow(x, 2));
            }
     }
}
