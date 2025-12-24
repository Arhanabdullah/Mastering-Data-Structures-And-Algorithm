package JavaBasics;
import java.util.*;
public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num = sc.nextInt();
        int numrever=0;
        while (num>0) {
            numrever= num %10;
            num/=10;
            System.out.print(numrever);
        }
        sc.close();
    }
}
