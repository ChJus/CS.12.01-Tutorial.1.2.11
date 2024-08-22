import java.util.ArrayList;

public class DiverseArray {
  // Calculates sum of values in 1D array
  static int arraySum(int[] array) {
    int sum = 0;
    for (int i : array) sum += i;
    return sum;
    // Alternative fast solution:
    // return Arrays.stream(array).sum();
  }

  // Computes row-wise sum using DiverseArray.arraySum()
  static int[] rowSums(int[][] grid) {
    int[] rowSum = new int[grid.length];
    for (int i = 0; i < rowSum.length; i++) {
      rowSum[i] = arraySum(grid[i]);
    }
    return rowSum;
  }

  // Evaluate whether row sums are unique in grid
  static boolean isDiverse(int[][] grid) {
    // Keep a list of unique sums.
    // An alternative would be using HashSet/TreeSet,
    // which keeps only unique items (comparing to size of set
    // would reveal if there were duplicate sum values)
    ArrayList<Integer> sums = new ArrayList<>();
    for (int i = 0; i < grid.length; i++) {
      if (sums.contains(arraySum(grid[i]))) return false;
      sums.add(arraySum(grid[i]));
    }
    return true;
  }
}
