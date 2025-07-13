package lectures.c4_selectionsort;

public class SelectionSort {

     // THEORY - SELECTION SORT
    // Step 1: Find the smallest element in the entire array, swap it with the first element.
    // Step 2: Find the smallest element (excluding the first position), swap it with the second element.
    // Step 3: Find the smallest element (excluding the first two position), swap it with the third element.
    // Continue this process until the array is fully sorted.


    //My Try
    public void sSort() {
        int arr[] = { 9, 7, 3, 1, 6 };
        int place = 0;

        for (int i = 0; i <= arr.length - 2; i++) {
            int smallest = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] < smallest) {
                    smallest = arr[j];
                    place = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[place];
            arr[place] = temp;
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }

    //Youtube try and my made more simple
    public void sSort2() {
        int arr[] = { 9, 7, 3, 1, 6 };
        for (int i = 0; i < arr.length-1; i++) {
            int smallestIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
        for (int n : arr) {
            System.out.println(n);
        }
    }

    //Using Greater rather than smallest
    public void sSort3(){
        int arr[] = {9,7,3,1,6};
        for(int i=arr.length-1; i>0; i--){
            int largest = i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[largest]){
                    largest = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[largest];
            arr[largest] = temp;
        }
        for(int n: arr){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        obj.sSort3();
    }
}
