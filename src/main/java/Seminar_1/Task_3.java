package Seminar_1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
// и в каждой ячейке может лежать только значение 0 или 1.
// Если нарушается одно из условий, метод должен вернуть код ошибки.
// Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
public class Task_3 {
    public static void main(String[] args) {
        message(checkArray(new Integer[][]{{1, 0}, {1, 0}}));
    }

    public static Integer checkArray(Integer[][] arr) {
        Integer total = 0;
        if (arr.length != arr[0].length)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if ((arr[i][j] != 0) && (arr[i][j] != 1)) {
                    return -2;
                } else {
                    total += arr[i][j];
                }
            }
        }
        return total;
    }

    public static void message(Integer errorCode) {
        if (errorCode == -1) {
            System.out.println("Матрица не квадратная!");
        } else if (errorCode == -2) {
            System.out.println("Значение матрицы может быть только 1 или 0");
        } else
            System.out.printf("Сумма элементов = %d", errorCode);

    }
}