package ru.geekbrains.Lesson_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int tryCount = 0;
        int userAnswer;
        int answer = random.nextInt(10);


while (tryCount < 3 && userAnswer != answer) {
            System.out.print("Сейчас я загадаю число от 0 до 9. Попробуйте угадать какое! У Вас есть только 3 попытки.");
            userAnswer = scanner.nextInt();
            if (answer != userAnswer) {
                System.out.println("Вы ввели " + ((userAnswer > answer) ? "слишком большое число " : "слишком маленькое число"));
                tryCount++;
            }
        }
        if (userAnswer == answer)
            System.out.println("Вы выиграли! Правильный ответ " + answer);
        else
            System.out.println("Вы проиграли. Правильный ответ " + answer);
    }
}
