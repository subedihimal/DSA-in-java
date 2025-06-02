package lectures.class2;
public class Pattern{

    //Normal Pattern
    public void pattern1(){
        for(int i=1; i<5 ; i++){
            for(int j=1;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Aphabet
    public void pattern2(){
        char data = 'a';
        for(int i=0; i<5 ; i++){
            for(int j=1;j<5;j++){
                System.out.print((char)(data + (i)));
            }
            System.out.println();
        }
    }
    //abcde in each row
    public void pattern3(){

        for (int i=1; i<=5;i++){
            for(char data = 'a'; data <= 'e'; data++){
                System.out.print(data);
            }
            System.out.println();
        }
    }

    // Continus number
    public void pattern4(){
        for(int i = 0; i<5; i++){
            for(int j = 1; j<=5; j++){
                System.out.print(j +(i*5) + " ");
            }
            System.out.println();
        }
        //you can also make a count variable that increases every time
    }

    //Gap Towards the last
    public void pattern5(){
        for(int i = 1; i<=5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //Opposite pattern
    public void pattern6(){
        for(int i = 1; i<=5; i++){
            for(int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
    //Alphabet Pattern
    public void pattern7(){
        for(char i = 'a'; i<='e'; i++){
            for(int j = 'a'; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
    //Pattern with gap in front
    public void pattern8(){
        for(int i=1; i<=5; i++){
            for(int j= 5-i;j>=1; j--){
                System.out.print('_');
            }
            for(int k=1; k<=i; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern obj = new Pattern();
        obj.pattern8();
    }
}