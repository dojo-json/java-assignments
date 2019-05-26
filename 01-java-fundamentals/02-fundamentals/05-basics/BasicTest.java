public class BasicTest {
  public static void main(String[] args) {
    final int[] iterate = { 1, 45, 23, 67, 10 };
    final int[] max = { -3, -5, -7 };
    final int[] avg = { 2, 10, 3 };
    final int[] y = { 1, 3, 5, 7 };
    final int[] sq = { 1, 5, 10, -2 };
    final int[] neg = { 1, 5, 10, -2 };
    final int[] mma = sq.clone();
    final int[] shift = { 1, 5, 10, 7, -2 };
    Basic b = new Basic();

    b.printUpTo255();
    b.printOdd();
    b.printSum();
    b.iterate(iterate);
    b.findMax(max);
    b.average(avg);
    b.oddArrayList();
    b.oddArray();
    b.greaterThanY(y, 3);
    b.square(sq);
    b.noNegativity(neg);
    b.minMaxAvg(mma);
    b.shift(shift);
  }

}
