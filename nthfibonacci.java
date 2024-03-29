import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;

        if (n < 0) {
            System.out.println("Fibonacci Series Cannot be less than 0");
        }

        if(n == 0) System.out.println(a);
        else if(n == 1) System.out.println(b);
        else {
            int c = 0;
            for(int i = 2; i <= n; i++){
                c = a+b;
                a = b;
                b = c;
            }
            System.out.println(c);
        }
    }
}