public class quickSort {

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];

        int i = low - 1; // khali jagah ke liye

        for (int j = low; j<high; j++) {

            if (arr[j] < pivot) {

                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // pivot ki sahi jagah ke liye
        i++; // khali jagah ke liye
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    public static void QuickSort(int arr[], int low, int high) {

        if (low < high) {

            int piv_idx = partition(arr, low, high);

            QuickSort(arr, low, piv_idx - 1);
            QuickSort(arr, piv_idx + 1, high);
        }

    }

    public static void main(String[] args) {
        // contains pivot and partition
        // many ways to choose pivot
        // 1.random
        // 2.median
        // 3.first element
        // 4.last element

        // Time complexity of quick sort
        // worst case---> when pivot is always the smallest or the largest element.
        // Time complexity = O(n^2)
        // Average Time complexity = O(nlogn)
        // Quick Sort ---> used in less memoryojvpr

        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        QuickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");

        }

        System.out.println();

    }
}