package lectures.class7;

public class BinarySearch {
    public void Search1(){
        int arr[] = {3, 7, 11, 12, 17, 20, 23, 27, 29};
        int start =0; int end = arr.length-1; 
        int search = 7;

        while(start<=end){
            int avg = (start + end)/ 2;
            if(arr[avg] == search){
                System.out.println("It is in: " + avg);
                break;
            }else if(arr[avg]<search){
                start = avg + 1;
            }else{
                end = avg-1;
            }
        }

    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.Search1();
        
    }
    
}
