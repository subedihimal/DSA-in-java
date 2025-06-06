package lectures.class6;

public class InsertionSort {
    // THEORY
    // Initial array: 7 4 2 3 5

    // Round 1 (i = 0):
    // j = 0, compare 7 and 4 → swap → 4 7 2 3 5
    // j = -1 → stop (j < 0)
    // Array after Round 1: 4 7 2 3 5

    // Round 2 (i = 1):
    // j = 1, compare 7 and 2 → swap → 4 2 7 3 5
    // j = 0, compare 4 and 2 → swap → 2 4 7 3 5
    // j = -1 → stop
    // Array after Round 2: 2 4 7 3 5

    // Round 3 (i = 2):
    // j = 2, compare 7 and 3 → swap → 2 4 3 7 5
    // j = 1, compare 4 and 3 → swap → 2 3 4 7 5
    // j = 0, compare 2 and 3 → no swap → stop
    // Array after Round 3: 2 3 4 7 5

    // Round 4 (i = 3):
    // j = 3, compare 7 and 5 → swap → 2 3 4 5 7
    // j = 2, compare 4 and 5 → no swap → stop
    // Array after Round 4: 2 3 4 5 7

    // Final sorted array:
    // 2 3 4 5 7

    // My Solution
    public void sort1() {
        int arr[] = { 7, 4, 2, 3, 5 };

        for (int i = 0; i < arr.length - 1; i++) {
            Boolean status = true;
            int j = i;
            while (status == true && j >= 0) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    status = true;
                    j--;

                } else {
                    status = false;
                }
            }
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }

    // The status FLAG CAN COMPLETELY BE REMOVED
    public void sort2() {
        int arr[] = { 7, 4, 2, 3, 5 };

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        obj.sort1();

    }

}
