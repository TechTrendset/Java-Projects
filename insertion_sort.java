import java.util.Scanner;

public class insertion_sort {
    public static void ascendArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // small to large --> ascending order
        // large to small --> descending order

        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter values in an array :");

        for (int i= 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i <array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;

            }

            // placement
            array[j + 1] = current;
        }
        ascendArray(array);
        sc.close();

        System.out.println(array.length);

    }

}
