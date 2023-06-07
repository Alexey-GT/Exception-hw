package Seminar_1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//
//1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//3. если вместо массива пришел null, метод вернет -3
//4. придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
public class Task_1 {
    public static void main(String[] args) {

//        System.out.println(arrayCheck(null, 5, 2));
        Integer[] array = new Integer[]{1,2,3,4};
        message(arrayCheck(null ,5, 2));
        message(arrayCheck(array ,5, 2));
        message(arrayCheck(array ,3, 6));
        message(arrayCheck(array ,3, 2));
    }
    public static int arrayCheck (Integer[] array, int variable, int element){
        if (array == null){
            return -3;
        }
        if (arrayLenthCheck(array, variable) == -1){
            return -1;
        }

        for (int i=0; i<array.length; i++){
            if (array[i]==element) {
                return i;
            }
        }
        return -2;

    }

    public static int arrayLenthCheck(Integer[] array, int variable){
        int currentLength = array.length;
        if (currentLength < variable){
            return -1;
        }
        return currentLength;
    }

    public static void message(int num){
        if (num==-1){
            System.out.println("массив меньше чем заданное число");
        }
        else if (num==-2){
            System.out.println("элемент  отсутствует");
        }

        else if (num==-3){
            System.out.println("массив = Null");
        }
        else{
            System.out.printf("индекс элемента :%d%n", num);
        }

    }

}