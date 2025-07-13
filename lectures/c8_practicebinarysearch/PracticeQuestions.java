package lectures.c8_practicebinarysearch;

public class PracticeQuestions {
    //Find the start and end index of common element in a sorted array
    public void occur(){
        int arr[] = {5, 7, 7, 8, 8, 8 , 10};
        int search = 8;
        int firstOccur = -1; int lastOccur = -1; boolean trigger = false;

        for(int i = 0; i< arr.length;i++){
            if(arr[i]==search && !trigger ){
                firstOccur = i;
                trigger = true;
            }
             if(arr[i]==search && trigger){
                lastOccur = i;
            }
        }
        System.out.println(firstOccur + " " + lastOccur);
    }
    
    //Using binary Search
    public void occur2(){
        int arr[] = { 5, 7, 7, 8, 8, 8, 10 };
        int search = 8;
        int firstOccur = -1;
        int lastOccur = -1;
        int start =0; int end =arr.length-1;
        while (start <= end) {
            int midvalue = start+((end-start)/2);
            if(arr[midvalue] == search){
                firstOccur = midvalue;
                end = midvalue-1;

            }else if (arr[midvalue]<search){
                start = midvalue+1;
            }else if(arr[midvalue]>search){
                end = midvalue-1;
            }
        }
        start =0;
        end =arr.length-1;
        while (start <= end) {
            int midvalue = start+((end-start)/2);
            if(arr[midvalue] == search){
                lastOccur = midvalue;
                start = midvalue+1;

            }else if (arr[midvalue]<search){
                start = midvalue+1;
            }else if(arr[midvalue]>search){
                end = midvalue-1;
            }
        }
        System.out.println(firstOccur + " " + lastOccur);
    }

    //If value is not in the array then show the index 
    public void occur3(){
        int arr[] = {1,4,6,8,10,14,16,18};
        int start = 0; int end = arr.length-1;
        int search = 8;
        int index = -1;
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==search){
                index = mid;                
                break;
            }else if(arr[mid]<search){
                start = mid+1;           
            }else if(arr[mid]>search){
                end = mid-1;
            }
            index = start;
        }
        System.out.println(index);
    }

    //Code done in lecture same question occur3 different approach
    public void occur4(){
        int arr[] = {1,4,6,8,10,14,16,18};
        int start = 0; int end = arr.length-1;
        int search = 8;
        int index = arr.length;
        while(start<=end){
            int mid = start+((end-start)/2);
            if(arr[mid]==search){
                index = mid;                
                break;
            }else if(arr[mid]<search){
                start = mid+1;           
            }else if(arr[mid]>search){
                end = mid-1;
                index = mid;
            }
        }
        System.out.println(index);
    }
    //Finding  square root
    public void squareroot(){
        int n = 80;
        int result;
        for(int i = 1; i<n; i++){
            result = i*i;
            if(result == n){
                System.out.println(i);
                break;
            }
            if(result >= n){
                System.out.println(i-1);
                break;
            }

        }
    }
    //binary search tree practice again
    public void squareRootBinary(){
        int n = 15;
        int start = 0;
        int end = n;

        while(start<=end){
            int result = (start+end)/2;
            System.out.println(result);
            if(result*result == n || start == end){
                System.out.println(result);
                break;
            }else if((result*result)>n){
                end = result-1;
            }else if((result*result)<n){
                start = result+1;
            }
        }
    }
    
    //Find repeated times of a number
    public void timesRepeated(){
        int arr[] = {2,4,4,4,4,5,6};
        int search = 4;
        int start = 0; int end = arr.length-1;
        int firstOccur = 0; int lastOccur=0;  
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]== search){
                firstOccur = mid;
                end = mid-1;
            }else if(arr[mid]<search){
                start= mid+1;
            }else if(arr[mid]>search){
                end = mid-1;
            }
        }
        start = 0; end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]== search){
                lastOccur = mid;
                start = mid+1;
            }else if(arr[mid]<search){
                start= mid+1;
            }else if(arr[mid]>search){
                end = mid-1;
            }
        }
        System.out.println(lastOccur-firstOccur+1);
    }
    
    //Find the missed Numbers
    public void missing(){
        int arr[]={1,6,4,2,1};
        int start = 0;int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(arr[mid]);
                break;
            }else if(arr[mid]>arr[mid-1]){
                start = mid+1;
            }else if(arr[mid]<arr[mid-1]){
                end=mid-1;
            }
            
        }
    }

    
    
    public static void main(String[] args) {
        PracticeQuestions obj = new PracticeQuestions();
        obj.occur2();
    }
    
}
