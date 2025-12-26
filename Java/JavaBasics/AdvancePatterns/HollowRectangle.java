// pehle row columns me alg alg krlo 
// fir check karo ki kaha kaha print krwana h
// iss condition me sirf boundary lines me print krwana h so agr rows ki value 1 ya total_rows ho toh * print krna h
// Similarly columns ki value 1 ya total_columns ho toh * print krna h
//baaki jagah me blank space print krna h

//  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  * 
//  *                                                        * 
//  *                                                        * 
//  *                                                        * 
//  *                                                        * 
//  *                                                        * 
//  *                                                        * 
//  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  * 

package JavaBasics.AdvancePatterns;

public class HollowRectangle {
    public static void Hollow_Rectangle(int total_rows,int total_columns){
        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_columns; j++) {
                if(i==1||i==total_rows||j==1||j==total_columns){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rectangle(8,20);
    }
}
