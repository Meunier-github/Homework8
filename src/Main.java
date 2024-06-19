import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // Зачада 1
        /*Объявите три массива:
        Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        Произвольный массив. Тип и количество данных определите сами.
        Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.*/

        int [] arrayInt = new int[]{1,2,3};
        double [] arrayDouble = {1.57, 7.654, 9.986};
        char [] arrayChar = {'a','b','c'};

        // Зачада 2
        /*Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.*/

        System.out.println("Задача 2");

        for (int i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }

        for (int i = 0; i < arrayDouble.length; i++) {
            if (i == arrayDouble.length - 1) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }
        for (int i = 0; i < arrayChar.length; i++) {
            if (i == arrayChar.length - 1) {
                System.out.println(arrayChar[i]);
                break;
            }
            System.out.print(arrayChar[i] + ", ");
        }

        // Зачада 3
        /*Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
        Если в задаче 2 в консоль у вас вывелся результат:
        1, 2, 3
        1.57, 7.654, 9.986
        // Произвольные элементы третьего массива то в этой задаче результат должен быть таким:
        3, 2, 1
        9.986, 7.654, 1.57
        // Произвольные элементы третьего массива в обратном порядке*/
        System.out.println("Задача 3");

        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }

        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayDouble[i]);
                break;
            }
            System.out.print(arrayDouble[i] + ", ");
        }

        for (int i = arrayChar.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayChar[i]);
                break;
            }
            System.out.print(arrayChar[i] + ", ");
        }


        // Зачада 4
        /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.*/
        System.out.println("Задача 4");

        for (int i = 0;i<arrayInt.length;i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayInt));

    }
}


