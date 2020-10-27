package homeworks.homework_7.four_task_from_javaBasic;

//Напишите программу, вычисляющую
// сумму всех нечетных натуральных чисел,
// не превосходящих 1000.


public class Exersise_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 1000) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);
    }
}

