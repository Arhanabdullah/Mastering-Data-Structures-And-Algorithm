package JavaBasics.Arrays;
import java.util.*;
public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]= new int[3];
        for(int i=0; i<marks.length;i++){
            System.out.println("Enter the marks");
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
        sc.close();
    }
}
