// 12345
// 1234
// 123
// 12
// 1


package JavaBasics.AdvancePatterns;

public class InvertedHalvedPyramid_Numbers {
    public static void inverted_half_pyramid_numbers() {
        for (int i = 6; i >= 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if(i-j>=1){
                    System.out.print( j );
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid_numbers();
    }
}