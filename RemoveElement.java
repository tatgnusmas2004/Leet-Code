public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int k = 0;
    if (nums.length == 0) {
      return 0;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    RemoveElement solution = new RemoveElement();
    int[] nums = { 3, 2, 2, 3 };
    System.out.println(solution.removeElement(nums, 2));
  }
}
