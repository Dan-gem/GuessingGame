import static java.lang.System.out; // Объявляем import для того что бы каждый раз в System.out.println не писать System.
import java.util.Scanner; // Объявляем import класса Scanner для того что бы вводить данные.
import java.util.Random; // Объявляем import  Random для генерации случайных чисел.

public class GuessingGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in); /* Имя System.in обозначает ввод с клавиатуры,
          (для ввода с другого устройства(не с клавиатуры), нужно ввести между скобками другое имя,
          обозначающее это устройство.),
          new Scanner - создание объекта типа Scanner при помощи оператора new.
          */
          out.print ("Введите число от 1 до 10: ");

        int inputNumber = keyboard.nextInt(); // Метод nextInt() переменной keyboard принимает
        // с клавиатуры введенную пользователем строку и преобразует её в целое число.

        int randomNumber = new Random().nextInt(10) + 1; // Метод nextInt(10) возращает случайное
        // целое число с равномерным распределением в диапазоне от 0 до 9,
        // new Random - создание объекта типа Random при помощи оператора new.

        if (inputNumber == randomNumber) {
            out.println("*****************");
            out.println("*Вы выйграли.*");
            out.println("*****************");
        } else {
            out.println("Вы проиграли.");
            out.print("Случайное число равно ");
            out.println(randomNumber + ".");
        }
        out.println("Спасибо за игру.");
    }

}
