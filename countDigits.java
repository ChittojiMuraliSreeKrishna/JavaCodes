import java.util.*;

class Main {
    public static int countDigits(int n) {
        if(n == 0) return 1;
        if (n < 0) n = n;
        int res = 0;
        while(n!=0){
            n = n/10;
            res++;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("The number of digits in " + n + "are:" + countDigits(n));
    }
}