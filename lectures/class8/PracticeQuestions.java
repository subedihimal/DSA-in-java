package lectures.class8;

public class PracticeQuestions {
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
        int search = 1;
        int firstOccur = -1;
        int lastOccur = -1;
        int start =0; int end =arr.length-1;
        while (start <= end) {
            int midvalue = start+(end-start)/2;
            if(arr[midvalue] == search){
                end = midvalue;
            }else if (arr[midvalue]<search){
                end = midvalue-1;
            }else if(arr[midvalue]>search){
                start = midvalue+1;
            }
        }
        System.out.println(firstOccur + " " + lastOccur);
    }

    public static void main(String[] args) {
        PracticeQuestions obj = new PracticeQuestions();
        obj.occur2();
    }
    
}
