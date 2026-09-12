import java.util.Arrays;

public class Search_in_strings {
  public static void main(String[] args) {

    String name = "ayan";
    char target = 'n';

    // boolean ans1 = search1(name, target);
    // System.out.println(ans1);

    System.out.println(Arrays.toString(name.toCharArray()));

  }

  static boolean search1(String str, char target) {
    if (str.length() == 0) {
      return false;
    }

    for (int i = 0; i < str.length(); i++) {
      if (target == str.charAt(i)) {
        return true;
      }
    }
    return false;
  }

  static boolean search2(String str, char target) {
    if (str.length() == 0) {
      return false;
    }

    for (char ch : str.toCharArray()) {
      if (ch == target) {
        return true;
      }
    }
    return false;
  }
}