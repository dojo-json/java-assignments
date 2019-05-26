public class StringManipulationTest {
  public static void main(String[] args) {
    StringManipulation manip = new StringManipulation();
    char letter = 'o';

    Integer a = manip.getIndexOrNull("Coding", letter);
    Integer b = manip.getIndexOrNull("HelloWorld", letter);
    Integer c = manip.getIndexOrNull("Hi", letter);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    String word = "Hello";
    String subString = "llo";
    String notSubString = "world";
    Integer d = manip.getIndexOrNull(word, subString);
    Integer e = manip.getIndexOrNull(word, notSubString);
    System.out.println(d);
    System.out.println(e);

    String cat = manip.concatSubstring("Hello", 1, 2, "world");

    System.out.println(cat);
  }
}
