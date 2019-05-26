public class StringManipulation {
  public String trimAndConcat(String str1, String str2) {
    return str1.trim().concat(str2.trim());
  }

  public Integer getIndexOrNull(String str, char c) {
    return this.getIndexOrNull(str, Character.toString(c));
  }

  public Integer getIndexOrNull(String str, String c) {
    Integer idx = str.indexOf(c);

    return idx == -1 ? null : idx;
  }

  public String concatSubstring(String str1, int beginIndex, int endIndex, String str2) {
    return str1.substring(beginIndex, endIndex).concat(str2);
  }
}
