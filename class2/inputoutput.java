import java.util.Scanner;

public class inputoutput{
    public static void main(String[] args){
        //Taking Input From User
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter a number: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.println("Enter another number");
        int b = Integer.parseInt(input.nextLine());
        
        System.out.println("Enter a String");
        String c = input.nextLine();

        System.out.println(a +" "+ b +" "+ c);
        input.close();
    }
}