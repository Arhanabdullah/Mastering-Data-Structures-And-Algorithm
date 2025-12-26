
//                *  *  *  *  *  * 
//             *              *
//          *              *
//       *              *
//    *              *
// *  *  *  *  *  *

package JavaBasics.AdvancePatterns;

public class HollowRhombus {
    public static void hRhombus(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= (n - i); j++) {
                System.out.print("   ");
            }
            for (int j = n; j >= 0; j--) {
                if (i == 0 || i == n || j == 0 || j == n) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hRhombus(5);
    }

}
