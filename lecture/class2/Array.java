package lecture.class2;

public class Array {
   public static void main(String[] args) {
        
        // Unlike C++, Java doesn't provide the actual address of the array
        // System.out.println(array1); // Gives the hashcode, not the actual memory address
        // int newVal = array1 + 2 * 8; // Won't work in Java as address arithmetic is not allowed

        // Array Data Known (Static Initialization)
        int[] array1 = {3, 4, 5}; 

        // Array Data Not Known (Statically Sized Array)
        int[] array2 = new int[3];  // You can assign values later
        array2[0] = 10;
        array2[1] = 20;
        // array2[2] = 30; 
        // If NOT assigned, it DOES NOT print garbage like in C++.
        // In Java, arrays of primitives are automatically initialized:
        // for int arrays, uninitialized elements default to 0.

        System.out.println("Static Array:");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Dynamic Array:");
        
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
   }
}
