package lectures.class3;

public class Problems {
    
    //Finding Reverse of an Array
    public void reverseArray(){
        int array1[] = {6,11,7,4,8,9};
        int array2[] = new int[6];

        int j = 0;

        for(int i=array1.length-1; i>=0; i--){
            array2[j]=array1[i];
            j++;
        }
        for(int i = 0; i< array1.length; i++){
            System.out.println("Previous Array :" + array1[i]);
        }
        for(int i = 0; i< array2.length; i++){
            System.out.println("New Array :" + array2[i]);
        }
        
    }

    //Reverse array with only one array
    public void revArray(){
        int arr[] = {6,8,14,11,3,9};
        int i = 0;
        int j = 5;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
         for(int k = 0; k< arr.length; k++){
            System.out.println( arr[k] + " ");
        }
    

    }
    //Second Largest and Largest Element
    public void sLarge(){
        int arr[] = {2,3,6,8,11};
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 0; i < 5; i++){
            if(arr[i] > largest){
              largest = arr[i];    
            }
        }
        for(int i = 0; i < 5; i++){
            if(arr[i] < largest & arr[i] > secondLargest  ){
                secondLargest   = arr[i];    
            }
        }
        System.out.println("Largest Number is: " + largest + "\n Second Largest Number is: " + secondLargest);
    }

    //Missing number in array
    public void missing(){
        int arr[] = {1,2,4,5,6};

        for(int i = 1; i<5; i++){
            if(!(i == arr[i-1])){
                System.out.println("Missing Element is " + i);
                break;
            }
        }
        //LS : Find the Sum of 1-6 and the sum in the arr and minus to find the missing number
    } 

    //Rotate by 1
    public void rotate(){
        int arr[] = {1,2,3,4,5,6};

        int last = arr[5];

        for(int i=5; i>=1; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        for(int n: arr){
            System.out.println(n);
        }
        
    }
    
    //Passing and printing Arrays
    public void passArray(){
        int arr[] = {1,2,3,4,5,6};
        arrPrinter(arr);
    }
    public void arrPrinter(int hello[]){
        
        for(int n: hello){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Problems obj = new Problems();
        obj.sLarge();
    }
    
}
