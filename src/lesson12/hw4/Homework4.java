package lesson12.hw4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Использовать Map для хранения.
    Меню:
        Добавить студента (ввод: имя, оценка)
        Вывести всех
        Вывести количество студентов
        Вывести самого худшего студента
 */
public class Homework4 {

    public static void main(String[] args) {

        Map<String, Float> map = new HashMap<>();

        System.out.println("1. Добавить студента (ввод: имя,оценка)");
        System.out.println("2. Вывести всех");
        System.out.println("3. Вывести количество студентов");
        System.out.println("4. Вывести самого худшего студента");
        System.out.println("5. Выход");

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        while (true) {
            System.out.print("Ввод: ");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            }

            switch (input) {
                case 1: {
                    System.out.print("Студент: ");
                    if (scanner.hasNext()) {
                        String str = scanner.next();
                        String[] studentInfo = str.split(",", 2);
                        map.put(studentInfo[0], Float.valueOf(studentInfo[1]));
                    }
                    break;
                }
                case 2: {
                    System.out.println(map);
                    break;
                }
                case 3: {
                    System.out.println(map.size());
                    break;
                }
                case 4: {
                    Map.Entry<String, Float> worstStudent = null;

                    for (Map.Entry<String, Float> entry : map.entrySet()) {
                        if (worstStudent == null || entry.getValue() < worstStudent.getValue()) {
                            worstStudent = entry;
                        }
                    }
                    System.out.println(worstStudent);
                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("Неправильный ввод");
                }
            }
        }
    }
}
