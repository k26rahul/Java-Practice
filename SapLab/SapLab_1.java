package SapLab;

import java.util.Scanner;

public class SapLab_1 {
  // Find max values of each row
  public static int[] solve(int[][] matrix) {
    int[] answers = new int[matrix.length]; // Array for max values

    for (int i = 0; i < matrix.length; i++) {
      int maxInRow = Integer.MIN_VALUE; // Initial max value
      for (int j = 0; j < matrix[i].length; j++) {
        if (matrix[i][j] > maxInRow) {
          maxInRow = matrix[i][j]; // Update max value
        }
      }
      answers[i] = maxInRow; // Store max for row
    }

    return answers;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt(); // Read rows
    int M = scanner.nextInt(); // Read columns

    int[][] matrix = new int[N][M]; // Matrix array

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        matrix[i][j] = scanner.nextInt(); // Read matrix elements
      }
    }

    int[] result = solve(matrix); // Get max values

    for (int value : result) {
      System.out.println(value); // Print max values
    }

    scanner.close(); // Close scanner
  }
}
