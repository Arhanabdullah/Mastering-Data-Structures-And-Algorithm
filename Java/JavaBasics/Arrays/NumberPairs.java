package JavaBasics.Arrays;

public class NumberPairs {
    public static void pairs(int n[]){
        for(int i =0 ; i<n.length;i++){
            int current = n[i];
            for(int j =i+1;j<n.length;j++){
                System.out.print("( "+current+","+n[j]+" )");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        pairs(numbers);
    }
}
