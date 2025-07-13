package lectures.c5_bubblesort;

public class BubbleSort{
        
    //THEORY
    // 1 4 8 5 3

    // Round 1:
    // Compare 1–4 → no swap
    // Compare 4–8 → no swap
    // Compare 8–5 → swap → 1 4 5 8 3
    // Compare 8–3 → swap → 1 4 5 3 8
    // Now, 8 is in its correct position (last)

    // Round 2:
    // Compare 1–4 → no swap
    // Compare 4–5 → no swap
    // Compare 5–3 → swap → 1 4 3 5 8
    // Now, 5 is in its correct position (second last)

    // Round 3:
    // Compare 1–4 → no swap
    // Compare 4–3 → swap → 1 3 4 5 8
    // Now, 4 is in its correct position (third last)

    // Round 4:
    // Compare 1–3 → no swap
    // Now, 3 is in its correct position (fourth last)

    // Final sorted array:
    // 1 3 4 5 8



    public void sort1(){
        int arr[] = {1,4,8,5,4};
        int last = arr.length-1;
        while(last >= 0){  
            for(int i = 0; i<last; i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }
            last--;
        }
        for(int n: arr){
            System.out.println(n);
        }
    }

    //Buble sort Backwards
    public void sort2(){
        int arr[] = {1,4,8,5,3};
        for(int i= 0 ; i < arr.length ; i++){
            boolean swap = false;
            for(int j = arr.length-1; j>i; j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }

        }
        for(int n: arr){
            System.out.println(n);
        }
    }

    //Decreasing Order
    public void sort3(){
        int arr[] = {1,4,8,5,3};

        for(int i= arr.length-2; i>=0; i--){
            for(int j=0; j<=i;j++){
                boolean swap = false;
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
                if(!swap){
                    break;
                }

            }

        }
        for(int n: arr){
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        obj.sort3();
        
    }

}