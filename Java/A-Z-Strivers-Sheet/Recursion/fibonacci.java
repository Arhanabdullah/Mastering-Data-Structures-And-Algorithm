public class fibonacci {
    public static int fibonacciSeries(int n){
        if(n<=1 ) return n;
        int last = fibonacciSeries(n-1);
        int secondLast = fibonacciSeries(n-2);
        return last+secondLast;
    }
    public static void main(String[] args) {
        int n = 15;
        // Print the Fibonacci series up to n terms
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
}
