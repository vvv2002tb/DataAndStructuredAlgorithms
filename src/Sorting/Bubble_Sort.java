package Sorting;

public class Bubble_Sort {
    // Sắp xếp nổi bọt
    public static void printArr(int no, int[] arr) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArr(i, arr);
            if (isSorted) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 7, 8, 1, 2 };
        int[] arr1 = { 1, 2, 3, 4, 5, 7, 6 };
        bubbleSort(arr);
        System.out.println();
        bubbleSort(arr1);
    }
}
