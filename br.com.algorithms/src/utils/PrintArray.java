package utils;

public class PrintArray {
    public static void print(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println(array[array.length - 1]);
    }
}
