package JavaBasics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose Factorial you want to find out: ");
        int n = sc.nextInt();
        int factorial=1;
        for(int i=1; i<=n;i++){
            factorial*=i;
        }
        System.out.println("The Factorial of the number "+ n+ " is: " +factorial);


        sc.close();
    }
}
