package September_09;

public class Problem_1 {

  public static String reverseString(String inputString) {
    StringBuilder reversed = new StringBuilder(inputString);
    return reversed.reverse().toString();
  }

  public static void runTests() {
    assert reverseString("hello").equals("olleh");
    assert reverseString("world").equals("dlrow");
    assert reverseString("Python").equals("nohtyP");
    assert reverseString("practice").equals("ecitcarp");
    System.out.println("All tests passed!");
  }

  public static void main(String[] args) {
    System.out.println(reverseString("hello"));
    runTests();
  }
}
