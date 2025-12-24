package JavaBasics;

import java.util.Scanner;

public class TypePromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a= 'a';
        short b = 32;
        int c =21;
        int d = a-b-c;
        System.out.println(d);

        int x =10;
        float y = 34.32f;
        double z = 21;
        long p = 41;
        double ans = x+y+z+p;
        System.out.println(ans);
        
        sc.close();
    }
}
