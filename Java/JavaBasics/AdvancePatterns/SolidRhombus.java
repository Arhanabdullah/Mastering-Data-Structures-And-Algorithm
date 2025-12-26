//                 *  *  *  *  *  * 
//              *  *  *  *  *  *
//           *  *  *  *  *  *
//        *  *  *  *  *  *
//     *  *  *  *  *  *
//  *  *  *  *  *  *


package JavaBasics.AdvancePatterns;

public class SolidRhombus{
    public static void Rhombus(int n){
    for(int i= 0 ; i <=n ; i++){
            
            for(int j=1;j<=(n-i);j++){
                System.out.print("   ");
            }
            for(int j=n;j>=0;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Rhombus(5);
    }
}
