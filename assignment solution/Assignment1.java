import java.util.Scanner;

public class Assignment1 {
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

    //4. Program to take number and operator and do calculations
    public void operatorCalculator(){
        System.out.println("Enter Two Numbers Seperated By space");
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        System.out.println("Enter the operator");
        String operator = input.nextLine();
        int result = 0;

        switch (operator) {
            case "+":
                result = a + b;
            break;

            case "-":
                result = a-b;
            break;

            case "/":
                result = a / b;
            break;

            case "*":
                result = a*b;
            break;
        
            default:
            System.out.println("Invalid Operator Input");
                break;
        }
        System.out.println(result);
    }
    
    // 5. Take 2 numbers as input and print the largest number.
    public void largest(){
        System.out.println("Enter two number with space");
        int a = input.nextInt();
        int b = input.nextInt();

        if(a>b){
            System.out.println(a + "Is Greatest");
        }else{
            System.out.println(b + "Is Greatest");
        }
    }

    //6. Input currency in rupees and output in USD.
    public void Convertor(){
        System.out.println("Enter Rs Amount");
        int a = input.nextInt();
        input.nextLine();
        float dollar = a / 136.56f;
        System.out.println("USD : " + dollar);
    }

    //7. To calculate Fibonacci Series up to n numbers.
    public void Fibonacci(){
        System.out.println("Enter number to witch to print the Fibonacci");
        int n = input.nextInt();
        input.nextLine();

        int fnum = 0;
        int snum = 1;
        int total = 0;

        for(int i = 1; i<n; i++){
            total = fnum + snum;
            fnum = snum;
            snum = total;
        }
        System.out.println(total);
    }


    public static void main(String[] args){
        Assignment1 obj = new Assignment1();
        
        obj.Fibonacci();


        obj.input.close();
    }
}
