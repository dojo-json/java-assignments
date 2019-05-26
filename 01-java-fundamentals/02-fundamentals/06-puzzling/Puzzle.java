import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Puzzle {
  public ArrayList<Integer> printSum(int[] numbers) {
    final int sum = this.sum(numbers);
    ArrayList<Integer> list = new ArrayList<Integer>();

    System.out.println(String.format("The sum is %d", sum));

    for (int number : numbers) {
      if (number < 10) {
        list.add(number);
      }
    }

    return list;
  }

  private int sum(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }

    return sum;
  }

  public ArrayList<String> shuffleNames(ArrayList<String> names) {
    Collections.shuffle(names);
    ArrayList<String> lessThan = new ArrayList<String>();

    for (String name : names) {
      System.out.println(name);
      if (name.length() > 5) {
        lessThan.add(name);
      }
    }

    return lessThan;
  }

  public int[] tenRand() {
    int[] ten = new int[10];
    final int max = 100;
    final int min = 55;

    for (int i = 0; i < 10; i++) {
      ten[i] = this.rand(min, max);
    }

    return ten;
  }

  public ArrayList<Integer> sortedTen() {
    int[] ten = this.tenRand();
    ArrayList<Integer> list = new ArrayList<Integer>(ten.length);

    for (int number : ten) {
      list.add(number);
    }

    Collections.sort(list);

    System.out.println("Sorted Ten");
    System.out.println(list);

    return list;
  }

  public String[] alpharray() {
    String[] characters = "abcdefghijklmnopqrstuvwxyz".split("");
    String[] vowels = { "a", "e", "i", "o", "u" };
    Collections.shuffle(Arrays.asList(characters));

    System.out.println(Arrays.asList(characters));

    System.out.println(characters[0]);
    System.out.println(characters[characters.length - 1]);

    if (Arrays.asList(vowels).contains(characters[0])) {
      System.out.println("First charcter was a vowel");
    }
    return characters;
  }

  private int rand(int min, int max) {
    Random rand = new Random();

    return rand.nextInt(max - min) + min;
  }

  private int rand(int max) {
    return this.rand(0, max);
  }

  public String randString() {
    String[] characters = this.alpharray();
    String str = "";

    for (int i = 0; i < 5; i++) {
      int randIdx = this.rand(characters.length);
      str += characters[randIdx];
    }

    return str;
  }

  public String[] randStrings() {
    String[] strings = new String[10];

    for (int i = 0; i < 10; i++) {
      strings[i] = this.randString();
    }

    return strings;
  }
}
