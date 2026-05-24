import java.util.*;

public class numberHashing{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt(); // Stores the size of the array
        int[] arr = new int[n];
        System.out.println("Enter values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Stores the input into the array
        }
        // Hash function
        int[] hash = new int[n + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1; 
        }

        int q;
        System.out.println("Enter the number of Queries");
        q = sc.nextInt();
        while (q> 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
            q--;
        }
        sc.close();
    }

}
