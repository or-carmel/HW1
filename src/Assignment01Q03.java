public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");
        
        int numOdd = 0;
        int a = 1;
        int b = 0;
        for (int i = 0; i < x; i++) {
            int n = a + b;
            System.out.print(n);
            a = b;
            b = n;
            if (i < x - 1) {
                System.out.print(" ");
            }
             if (n % 2 == 1) {
                numOdd += 1;
             }
        }
        System.out.println();
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
