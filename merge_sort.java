public class merge_sort {

    // Time complexity = O(nlogn)

    public static void conquer(int arr[], int si, int mid, int ei) {

        // O(n)

        int merged[] = new int[ei - si + 1];
        int idX1 = si;
        int idX2 = mid + 1;
        int x = 0;

        while (idX1 <= mid && idX2 <= ei) {

            if (arr[idX1] <= arr[idX2]) {
                merged[x++] = arr[idX1++];
            } else {
                merged[x++] = arr[idX2++];
            }

        }

        while (idX1 <= mid) {
            merged[x++] = arr[idX1++];
        }

        while (idX2 <= ei) {
            merged[x++] = arr[idX2++];
        }

        // To copy elements of merged array into original array

        for (int i = 0, j = si; i < merged.length; j++, i++) {

            arr[j] = merged[i];

        }

    }

    public static void divide(int arr[], int si, int ei) {
        // O(logn)

        if (si >= ei) { // base condition
            return;
        }

        int mid = si + (ei - si) / 2; // --> mid --> same as (ei+si)/2 sometimes this method throws error
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

}
