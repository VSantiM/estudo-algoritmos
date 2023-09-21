import algorithms.InsertionSort;
import utils.PrintArray;

public class Main {
    public static void main(String[] args) {
        int[] arrayTeste = new int[]{5, 2, 4, 6, 1, 3};
        int[] resultArray = InsertionSort.sort(arrayTeste);

        PrintArray.print(resultArray);
    }
}