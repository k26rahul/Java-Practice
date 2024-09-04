package September_09;

public class Problem_1 {

  public static String reverseString(String inputString) {
    StringBuilder reversed = new StringBuilder(inputString);
    return reversed.reverse().toString();
  }

  public static void runTests() {
    assert reverseString("hello").equals("olleh") : "Test 1 failed";
    assert reverseString("world").equals("dlrow") : "Test 2 failed";
    assert reverseString("Python").equals("nohtyP") : "Test 3 failed";
    assert reverseString("practice").equals("ecitcarp") : "Test 4 failed";
    System.out.println("All tests passed!");
  }

  public static void main(String[] args) {
    System.out.println(reverseString("hello"));
    runTests();
  }
}
