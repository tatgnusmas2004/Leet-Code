public class Palindrome {
  public boolean isPalindrome(int x) {
    if (x < 0 || (x % 10 == 0) && x != 0) {
      return false;
    }

    int reversedNumber = 0;
    int original = x;

    while (x > reversedNumber) {
      reversedNumber = reversedNumber * 10 + x % 10;
      x /= 10;
    }
    // Kiểm tra nếu phần số đảo ngược bằng phần còn lại của số gốc
    return x == reversedNumber || x == reversedNumber / 10;
  }
}
