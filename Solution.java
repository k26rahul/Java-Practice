class Solution {
  public static int upperBound(int[] arr, int x, int n) {
    int low = 0, high = n - 1;
    int ans = n;

    while (low <= high) {
      int mid = (low + high) / 2;
      // Check if the middle element is greater than x
      if (arr[mid] > x) {
        ans = mid;
        high = mid - 1; // Move to the left part
      } else {
        low = mid + 1; // Move to the right part
      }
    }
    return ans;
  }

  public static int countSmallEqual(int[][] matrix, int R, int C, int x) {
    int count = 0;
    for (int i = 0; i < R; i++) {
      count += upperBound(matrix[i], x, C); // Count elements less than or equal to x in each row
    }
    return count;
  }

  public static int median(int[][] matrix, int R, int C) {
    int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

    // Determine the minimum and maximum elements in the matrix
    for (int i = 0; i < R; i++) {
      low = Math.min(low, matrix[i][0]); // First element of each row
      high = Math.max(high, matrix[i][C - 1]); // Last element of each row
    }

    int requiredCount = (R * C) / 2; // The index of the median in a sorted list

    // Binary search to find the median
    while (low <= high) {
      int mid = (low + high) / 2;
      int smallEqualCount = countSmallEqual(matrix, R, C, mid);

      if (smallEqualCount <= requiredCount) {
        low = mid + 1; // Move right if there are too few elements <= mid
      } else {
        high = mid - 1; // Move left if there are enough elements <= mid
      }
    }

    return low; // The low pointer will have the median value
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
