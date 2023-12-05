// Императивный стиль, потому что в коде присутствуют наборы "команд" и последовательность выполнения.
// ООП-парадигма, потому что есть общий класс и есть "сущность", присвоенная классу 
// (в этом случае массив и элементы массива, им в свою очередь дана инструкция по их "поведению").

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        printArr(arr);
        System.out.println();
        System.out.println(newIndex(arr, 4));
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int newIndex(int[] arr, int number) {
        int result = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int average = low + (high - low) / 2;
            if (arr[average] < number) {
                low = average + 1;
            } else if (arr[average] > number) {
                high = average - 1;
            } else if (arr[average] == number) {
                result = average;
                break;
            }
        }
        return result;
    }
}