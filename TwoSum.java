import java.util.HashMap;

public class TwoSum {
  public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>(); // lưu số và chỉ số của nó
    for (int i = 0; i < nums.length; i++) {
      int missing = target - nums[i]; // Tìm số còn thiếu
      if (map.containsKey(missing)) {
        return new int[] { map.get(missing), i };
      }
      map.put(nums[i], i);
    }
    return new int[] {};
  }
}
