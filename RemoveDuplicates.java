public class RemoveDuplicates {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[j]) {
        j++;
        nums[j] = nums[i];
      }
    }
    return j + 1;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = { 0, 0, 1, 1, 1, 2, 3, 4, 4, 5, 5 };
    System.out.println(solution.removeDuplicates(nums));
  }
}
