import java.math.BigInteger;

public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        for (int i = 0; i < x; i++) {
            BigInteger n = a.add(b);
            System.out.print(n);
            a = b;
            b = n;
            if (i < x - 1) {
                System.out.print(" ");
            }
            if (n.mod(BigInteger.valueOf(2)).equals(BigInteger.ONE)) {
                numOdd += 1;
             }
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
