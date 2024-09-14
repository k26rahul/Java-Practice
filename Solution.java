class Solution {
  public static int median(int[][] matrix, int R, int C) {
    // Binary Search Approach
    int low = matrix[0][0];
    int high = matrix[R - 1][C - 1];
    int desired = (R * C + 1) / 2;

    while (low < high) {
      int mid = low + (high - low) / 2;
      int count = 0;

      // Count elements less than or equal to mid
      for (int i = 0; i < R; i++) {
        count += upperBound(matrix[i], mid);
      }

      if (count < desired) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }

  // Helper function to find the upper bound of 'mid' in a row
  private static int upperBound(int[] row, int mid) {
    int low = 0;
    int high = row.length;
    while (low < high) {
      int m = low + (high - low) / 2;
      if (row[m] <= mid) {
        low = m + 1;
      } else {
        high = m;
      }
    }
    return low;
  }

  public static void main(String[] args) {
    // Test calls
    assert median(new int[][] {{1, 2, 3}}, 1, 3) == 2 : "1";
    assert median(new int[][] {{1}, {2}, {3}}, 3, 1) == 2 : "2";
    assert median(new int[][] {{1, 3, 5}, {2, 6, 9}, {3, 6, 9}}, 3, 3) == 5 : "3";
    assert median(new int[][] {{1, 10, 20}, {2, 15, 30}, {5, 25, 35}, {7, 27, 40}, {12, 29, 50}}, 5,
        3) == 20 : "4";

    System.out.println("✅ All tests passed!");
  }
}
