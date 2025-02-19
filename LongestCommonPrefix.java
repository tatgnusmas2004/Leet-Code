public class LongestCommonPrefix {
  // Cách 1
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0)
      return "";

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i >= strs[j].length() || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }

  // Cách 2
  public static String longestCommonPrefix2(String[] strs) {
    if (strs.length == 0)
      return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
        if (prefix.isEmpty())
          return "";
      }
    return prefix;
  }

  public static void main(String[] args) {
    String[] strs = { "fly", "flight", "flow", "flew" };
    LongestCommonPrefix main = new LongestCommonPrefix();
    System.out.println(main.longestCommonPrefix(strs));
  }
}
