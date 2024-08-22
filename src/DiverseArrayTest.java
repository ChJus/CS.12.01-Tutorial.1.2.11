import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiverseArrayTest {
  @Test
  void arraySumOne() {
    int[] arr1 = {1, 3, 2, 7, 3};
    assertEquals(16, DiverseArray.arraySum(arr1));
  }

  @Test
  void arraySumTwo() {
    int[] arr1 = {11, 31, 21, 17, 13};
    assertEquals(93, DiverseArray.arraySum(arr1));
  }

  @Test
  void arraySumThree() {
    int[] arr1 = {};
    assertEquals(0, DiverseArray.arraySum(arr1));
  }

  @Test
  void rowSumsOne() {
    int[][] array2d = {
        {1, 3, 2, 7, 3},
        {10, 10, 4, 6, 2},
        {5, 3, 5, 9, 6},
        {7, 6, 4, 2, 1}
    };

    int[] rowSums = DiverseArray.rowSums(array2d);

    assertEquals(4, rowSums.length);
    assertEquals(16, rowSums[0]);
    assertEquals(32, rowSums[1]);
    assertEquals(28, rowSums[2]);
    assertEquals(20, rowSums[3]);
  }

  @Test
  void rowSumsTwo() {
    int[][] array2d = {
        {10, 3, 2, 17, -3},
        {10, -10, 4, 6, 2},
        {15, 31, 5, 9, 16},
        {0, 6, 14, 2, 11}
    };

    int[] rowSums = DiverseArray.rowSums(array2d);

    assertEquals(4, rowSums.length);
    assertEquals(29, rowSums[0]);
    assertEquals(12, rowSums[1]);
    assertEquals(76, rowSums[2]);
    assertEquals(33, rowSums[3]);
  }

  @Test
  void isDiverseOne() {
    int[][] array2d = {
        {1, 3, 2, 7, 3},
        {10, 10, 4, 6, 2},
        {5, 3, 5, 9, 6},
        {7, 6, 4, 2, 1}
    };

    assertTrue(DiverseArray.isDiverse(array2d));
  }

  @Test
  void isDiverseTwo() {
    int[][] array2d = {
        {1, 1, 5, 3, 4},
        {12, 7, 6, 1, 9},
        {8, 11, 10, 2, 5},
        {3, 2, 3, 0, 6}
    };

    assertFalse(DiverseArray.isDiverse(array2d));
  }
}