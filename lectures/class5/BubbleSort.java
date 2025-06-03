package lectures.class5;

public class BubbleSort{
    public void sort1(){
        int arr[] = {1,4,8,5,3};
        int last = 4;
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