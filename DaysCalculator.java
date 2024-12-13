//Требуется написать программу, которая будет рассчитывать количество дней в году
import java.util.Scanner;


public class DaysCalculator {
    //Метод для действий в консоли
    public static void main(String[] args) {
        //Открытие скана консоли
        Scanner scanner = new Scanner(System.in);

        //Вывод информативного сообщения в консоль
        System.out.print("Введите год в формате 'yyyy': ");
        //Чтение года из консоли
        int year = scanner.nextInt();
        //Расчет количества дней в году
        int daysInYear = calculateDays(year);

        //Вывод результата
        System.out.println("Количество дней в " + year + " году: " + daysInYear);

        //Закрытие скана консоли
        scanner.close();
    }

    //Метод проверки на високосный год
    private static int calculateDays(int year) {
        //Проверка на високосный год
        if(isLeapYear(year)) {
            return 366; //Високосный год
        } else {
            return 365; //Обычный год
        }
    }

    //Логика проверки на високосный год
    private static boolean isLeapYear(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}