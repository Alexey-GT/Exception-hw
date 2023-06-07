package Seminar_1;
//Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
// Метод должен пройтись по каждому элементу и проверить что он не равен null.
// А теперь реализуйте следующую логику:
//
//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
public class Task_2
{

    public static void main(String[] args) {
        checkArray(new Integer[]{1, 4, null, 7, 8, null, 2, 2, 4, null});
    }

    public static void checkArray(Integer[] arr) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.append(" ").append(i);
            }
        }
        System.out.println("result = " + result);
    }
}