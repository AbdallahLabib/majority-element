import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class App {
    public static void main(String[] args) throws Exception {
        majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });
        System.out
                .println(majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
    }

    public static int majorityElement(int[] nums) {
        // Boyer - Moore Voting Algorithm
        //Time: O(n)
        //Space: O(1)
        int majority = nums[0], vote = 1;

        for (int i = 1; i < nums.length; i++) {
            if (vote == 0) {
                majority = nums[i];
            }

            if (majority == nums[i]) {
                vote++;
            } else {
                vote--;
            }
        }
        return majority;

        //Using HashMap
        //Time: O(n)
        //Space: O(n)
        // Map<Integer, Integer> map = new HashMap<>();

        // for (int n : nums) {
        // map.put(n, map.getOrDefault(n, 0) + 1);
        // }

        // int maxValue = map.values().stream().mapToInt(val -> val).max().getAsInt();

        // int maxKey = -1;

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (Objects.equals(maxValue, entry.getValue())) {
        // maxKey = entry.getKey();
        // }
        // }
        // return maxKey;
    }
}
