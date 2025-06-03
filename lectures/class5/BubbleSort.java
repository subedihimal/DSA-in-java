package lectures.class5;

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
        int arr[] = {1,4,8,5,3};
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



    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        obj.sort1();
        
    }

}