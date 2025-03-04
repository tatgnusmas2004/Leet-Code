public class FindIndexOf {
  // phương thức Brute force Search
  // public static int strStr(String haystack, String needle) {
  // int n = hayStack.length();
  // int m = needle.length();

  // for (int i = 0; i <= n - m; i++) {
  // if (hayStack.substring(i, i + m).equals(needle)) {
  // return i;
  // }
  // }
  // return -1;
  // }

  // Phương thức KMPSearch
  // public static int strStr(String haystack, String needle) {
  // if (needle.isEmpty())
  // return 0;

  // int[] lps = computeLPSArray(needle);
  // int i = 0, j = 0;

  // while (i < haystack.length()) {
  // if (haystack.charAt(i) == needle.charAt(j)) {
  // i++;
  // j++;
  // if (j == needle.length())
  // return i - j;
  // } else {
  // if (j > 0)
  // j = lps[j - 1];
  // else
  // i++;
  // }
  // }
  // return -1;
  // }

  // private static int[] computeLPSArray(String pattern) {
  // int[] lps = new int[pattern.length()];
  // int j = 0;

  // for (int i = 0; i < pattern.length(); i++) {
  // while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
  // j = lps[j - 1];
  // }

  // if (pattern.charAt(i) == pattern.charAt(j)) {
  // j++;
  // lps[i] = j;
  // }
  // }
  // return lps;
  // }

  // Phương thức Build In Search
  public static int strStr(String haystack, String needle) {
    return haystack.indexOf(needle);
  }
}
