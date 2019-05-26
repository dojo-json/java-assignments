import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class Basic {
  public void printUpTo255() {
    for (int index = 1; index <= 255; index++) {
      System.out.println(String.format("The current index is %d", index));
    }
  }

  public void printOdd() {
    for (int index = 1; index <= 255; index += 2) {
      System.out.println(String.format("The current odd index is %d", index));
    }
  }

  public void printSum() {
    int sum = 0;

    for (int index = 0; index < 255; index++) {
      sum += index;

      System.out.println(String.format("New number: %d -- sum: %d", index, sum));
    }
  }

  public void iterate(int[] numbers) {
    for (int number : numbers) {
      System.out.println(String.format("The current element is %d", number));
    }
  }

  public int findMax(int[] numbers) {
    int max = numbers[0];

    for (int number : numbers) {
      if (number > max) {
        max = number;
      }
    }

    System.out.println(String.format("The max value is %d", max));

    return max;
  }

  public int findMin(int[] numbers) {
    int min = numbers[0];

    for (int number : numbers) {
      if (number < min) {
        min = number;
      }
    }
    System.out.println(String.format("The min value is %d", min));

    return min;
  }

  public int sum(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
      sum += number;
    }

    return sum;
  }

  public int average(int[] numbers) {
    int sum = this.sum(numbers);
    int average = sum / numbers.length;

    System.out.println(String.format("The average is %d", average));

    return average;

  }

  public ArrayList<Integer> oddArrayList() {
    ArrayList<Integer> array = new ArrayList<Integer>();
    final int fiddyfive = 255;

    for (int index = 1; index <= fiddyfive; index += 2) {
      array.add(index);
    }

    System.out.println(array);

    return array;
  }

  public int[] oddArray() {
    final int fiddyfive = 255;
    final int size = Math.floorDiv(fiddyfive, 2);
    int[] array = new int[size];
    int value = 1;

    System.out.println("size is " + size);

    for (int index = 1; index < size; index++) {
      array[index] = value;
      value += 2;
    }

    System.out.println(Arrays.toString(array));

    return array;
  }

  public int greaterThanY(int[] numbers, int y) {
    int greater = 0;

    for (int number : numbers) {
      if (number > y) {
        greater++;
      }
    }

    System.out.println(String.format("Numbers greater than Y occurred %d times", greater));

    return greater;
  }

  public int[] square(int[] numbers) {
    for (int index = 0; index < numbers.length; index++) {
      final int value = numbers[index];
      numbers[index] = value * value;
    }

    System.out.println(Arrays.toString(numbers));

    return numbers;
  }

  public int[] noNegativity(int[] numbers) {
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] < 0) {
        numbers[index] = 0;
      }
    }

    System.out.println(Arrays.toString(numbers));

    return numbers;
  }

  public int[] minMaxAvg(int[] numbers) {
    int min = this.findMin(numbers);
    int max = this.findMax(numbers);
    int avg = this.average(numbers);
    final int[] result = { max, min, avg };

    return result;
  }

  public int[] shift(int[] numbers) {
    final int wrap = numbers[0];

    for (int i = 0; i < numbers.length - 1; i++) {
      numbers[i] = numbers[i + 1];
    }

    numbers[numbers.length - 1] = wrap;

    System.out.println(Arrays.toString(numbers));

    return numbers;
  }
}
