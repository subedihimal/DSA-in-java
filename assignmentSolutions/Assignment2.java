import java.util.Scanner;

public class Assignment2{
    Scanner scanner = new Scanner(System.in);
    
    //Calculating Area
    public void area(){
        System.out.println("Enter value of r");
        int a = scanner.nextInt();
        float area = (22/7)*a^2;

        System.out.println(area);
    }
    public void triangle(){
        System.out.println("Enter length");
    } 
    public static void main(String[] args) {
        Assignment2 obj = new Assignment2();
        obj.area();
    }
}