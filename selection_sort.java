import java.util.Scanner;

public class selection_sort {

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

        System.out.println("Enter values in an array:");

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            int smallest =i;
            for (int j = i+1; j < array.length; j++) {

                if (array[smallest] > array[j]) {

                    smallest = j;
                }
            }
              // swap
              int temp = array[smallest];
              array[smallest] = array[i];
              array[i]=temp;
        }
        ascendArray(array);
        sc.close();

    }

}
