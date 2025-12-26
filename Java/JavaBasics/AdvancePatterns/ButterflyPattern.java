//  *                    *
//  *  *              *  *
//  *  *  *        *  *  *
//  *  *  *  *  *  *  *  *
//  *  *  *  *  *  *  *  *
//  *  *  *        *  *  *
//  *  *              *  *
//  *                    *


package JavaBasics.AdvancePatterns;

public class ButterflyPattern {

    public static void Butterfly(int n){
        for(int i= 0 ; i <=n ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i= n ; i >=0 ; i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly(4);
    }
    
}
