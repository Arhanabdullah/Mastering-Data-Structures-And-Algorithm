package JavaBasics.SortingTechniques;
import java.util.*;
public class InbuildSort {
    public static void print(Integer arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] ={2,4,3,7,6,5,1};
        Arrays.sort(arr);
        print(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        print(arr);
    }
}
