import java.util.HashMap;
import java.util.List;

public class hashing {
    
    public List<List<Integer>> countFrequencies(int[] nums) {
        int n= nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i<n; i++){
        while ( i<n) {
            int number = nums[i];
            System.out.println(map.get(number));
        }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return null;
    }
}

