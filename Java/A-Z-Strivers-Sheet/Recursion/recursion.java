public class recursion {
    public static void print1ToN(int n) {
        if (n == 0) {
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void printNTo1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    public static int NnumbersSum(int N) {
        if (N == 0) {
            return 0;
        }
        return N + NnumbersSum(N - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        
        print1ToN(n);
        printNTo1(n);
        System.out.println(NnumbersSum(n));
    }
}
