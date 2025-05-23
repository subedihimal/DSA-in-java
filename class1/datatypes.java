import java.math.BigInteger;

public class datatypes{
    public static void main(String[] args){
        BigInteger a = new BigInteger("123981233222123123123");
        BigInteger b = new BigInteger("123981233222123123123");
        BigInteger sum = a.add(b);
        System.out.println("\n sum :" + sum);

        System.out.println(a  +"\n");
        // Big Int Stores More almost infinite than long
        // long b = 123981233222123123123L;
        // System.out.println(b);

        //float 4 bytes incloduing point, double can store upto 8 bytes

        boolean c = false;
        System.out.println(c);
    }
}