package JavaBasics.Arrays;

public class SubArrays {
    public static void subarray(int n[]){
        for(int i =0 ; i<n.length;i++){
            
            for(int j =i;j<n.length;j++){
                
                for(int k =i;k<j;k++){
                
                System.out.print(n[k]+ "  ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14,16,18};
        subarray(numbers);
    }
    
}
