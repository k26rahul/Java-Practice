## Creating Problem Files

1. **Navigate to the Package Directory:**

   - Navigate to the package directory for the date you want to solve the problems. For today, this would be the `September_09` directory.

2. **Create a New Java File:**

   - Create a new file with the `.java` extension, e.g., `Problem_2.java`.
   - Implement your Java class within this file.

   ```java
   package September_09;

   public class Problem_2 {

       // Define your problem-specific method here
       public static ReturnType problemFunction(Parameters) {
           // Your implementation here
       }

       // Define a method for running tests
       public static void runTests() {
           System.out.println("All tests passed!");
       }

       public static void main(String[] args) {
           // Implementation call
           System.out.println(problemFunction(arguments));

           // Uncomment the following line to run tests
           // runTests();
       }
   }
   ```

   - **Problem-Specific Method:** Define a specific method for the problem you are solving (e.g., `problemFunction`). This method should contain the logic for solving the problem.

   - **Test Method:** Create a `runTests` method that contains assertions to validate your problem function. Each assertion should check if the method returns the expected result. This helps ensure your implementation is correct.

   - **Main Method:** The `main` method should include a call to your problem-specific method with sample input and print the result. After confirming your implementation is correct, you can uncomment the call to `runTests` to run your test cases.

## Running Java Files in VS Code

1. **Open VS Code:**

   - Open your project directory (`Java-Practice`) in VS Code.

2. **Install Java Extensions (if not already installed):**

   - Install the "Java Extension Pack" from the Extensions view (Ctrl+Shift+X) to enable Java development features.

3. **Open the Java File:**

   - Navigate to the file you want to run (e.g., `Problem_2.java`) and open it in the editor.

4. **Run the Java File:**

   - You can use the "Run" button provided by the Java extension. This button appears just above the `main` method in your class. Clicking it will compile and run the file automatically.

   **Note:** After creating a new Java file, you do not need to manually compile it. VS Code automatically handles the compilation and stores the `.class` files in the `bin` directory.
