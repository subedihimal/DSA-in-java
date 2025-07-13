package lectures.c7_binarysearch;

public class BinarySearch {
    //Theory
    // array consists of 3,7,11,12,17,20,23,27,29
    //starting value starts with 0 in
    public void search1(){
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
    //Binary Search for decending order
    public void search2(){
        int arr[] = {38,28,20,16,4};
        int start = 0; int end = arr.length-1;
        int search = 21;

        while(start<=end){
            int midvalue = start + ((end-start)/2);

            if(arr[midvalue] == search){
                System.out.println(midvalue);
                break;
            }else if (arr[midvalue]<search){
                end = midvalue-1;
            }else if(arr[midvalue]>search){
                start = midvalue+1;
            }
        }
        if(start>end){
            System.out.println("Not in array");
        }
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.search2();
        
    }
    
}
