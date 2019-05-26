import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleTest {
  public static void main(String[] args) {
    final int[] numbers = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
    final ArrayList<String> names = new ArrayList<String>();
    names.add("Nancy");
    names.add("Jinichi");
    names.add("Fujibayashi");
    names.add("Momochi");
    names.add("Ishikawa");

    Puzzle pz = new Puzzle();

    pz.printSum(numbers);
    pz.shuffleNames(names);
    System.out.println(Arrays.toString(pz.tenRand()));
    pz.sortedTen();
    pz.alpharray();
    System.out.println(Arrays.toString(pz.randStrings()));
  }
}
