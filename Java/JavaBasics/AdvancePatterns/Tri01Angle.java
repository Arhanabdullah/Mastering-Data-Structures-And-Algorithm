//  1 
//  0  1
//  1  0  1
//  0  1  0  1
//  1  0  1  0  1



package JavaBasics.AdvancePatterns;

public class Tri01Angle {
    public static void tri01angle(){

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2 !=0){
                    if(j%2 !=0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");
                    }
                }
                else{
                    if(i%2 ==0){
                    if(j%2 !=0){

                        System.out.print(" 0 ");
                    }
                    else{
                        System.out.print(" 1 ");
                    }
                }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        tri01angle();
    }
}
