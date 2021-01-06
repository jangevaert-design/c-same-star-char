public class SameStarChar {
/*

Returns true if for every '*' (star) in the string, if there are chars both immediately before and
after the star, they are the same.
 */

  public static void main(String[] args) {
    SameStarChar sameStar = new SameStarChar();
    String str = "XY*YYYY*Z*";
    System.out.printf("\nfor the String %s the outcome is " + sameStar.sameStarChar(str) + "\n", str);
  }

  public boolean sameStarChar(String str) {

    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == '*') {
        if (str.charAt(i - 1) != str.charAt(i + 1)) {
          return false;
        }
      }
    }
    return true;
  }


}
