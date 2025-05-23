package lecture.class1;
import java.util.Scanner;

public class Main{
    public void datatypes(){
        byte g = 3;          //8 bit smaill integer
        short h = 13;      //16 bit integer
        int a = 1;           // 32 bit
        float b = 1.33f;     // 32 bit
        double c = 1.2199320;// 64 bit
        boolean d = false;   // 1 bit
        char e = 'A';        // 16 bit
        String f = "Hello";  // Dependent on content

        System.out.println(a + " " + b + " " + c + " "+ d + " " + e + " "+ f + " " + g + " " + h);
        a = e; 
        System.out.println(a); // Output 65

        e = (char)a;           //Assigning higher to lower need to explictly mention can cause loss of data
        System.out.println(); 
    }
    public void inputoutput(){

    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.datatypes();
    }
}