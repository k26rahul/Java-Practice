package Basic_17;

public class Problem_2 {

  public static void main(String[] args) {
    System.out.println(factorial(5));
    runTests();
  }

  public static int factorial(int n) {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void runTests() {
    // Test calls
    assert factorial(0) == 1;
    assert factorial(1) == 1;
    assert factorial(2) == 2;
    assert factorial(3) == 6;
    assert factorial(4) == 24;
    assert factorial(5) == 120;

    System.out.println("✅ All tests passed!");
  }
}
