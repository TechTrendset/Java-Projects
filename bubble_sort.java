import java.util.Scanner;

public class bubble_sort {
    public static void ascendArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // small to large --> ascending order
        // large to small --> descending order
        // in bubble sort loops run (n-1) times.

        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter values in an array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }

        }
        ascendArray(array);
        sc.close();

    }

}
