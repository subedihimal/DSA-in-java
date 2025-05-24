package lecture.class1.assignment;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);

    //1.Write a program to print whether a number is even or odd, also take input from the user.
    public void oddeven(){
        System.out.println("Enter a Number \n");
        int a = input.nextInt();
        input.nextLine();

        if(a % 2 == 0){
            System.out.println("Given Number is even");
        }else{
            System.out.println("Given Number is odd");
        }
    }

    //2. Take name as input and print a greeting message for that particular name.
    public void greeting(){

        System.out.println("Enter your Name: \n");
        String name = input.nextLine();

        System.out.println("Welcome " + name );
    }

    // 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
    public void simpleIntrest(){
        System.out.println("Enter Principle, Time and Rate with space between them");
        int p = input.nextInt();
        int t = input.nextInt();
        int r = input.nextInt();
        input.nextLine();

        System.out.println("Simple Interest " + ((p * t * r)/100));
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.oddeven();
        obj.greeting();
        obj.simpleIntrest();
        obj.input.close();
    }
}
