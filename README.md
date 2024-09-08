## Running Java Code

There are two ways to run Java code:

1. **VS Code**: Use Java extensions. Write your Java code in separate `.java` files and run them inside VS Code. Install the Java Extension Pack for support.
2. **Jupyter Notebooks**: Install the IJava Kernel from [here](https://github.com/SpencerPark/IJava). Follow the instructions to set it up, then create notebooks and select the Java kernel.

---

## Important Note

Make sure to enable assertions by setting the value `"-ea"` in VS Code. This is essential for running assertions in your Java test cases. You can enable it by navigating to this setting:

vscode://settings/java.debug.settings.vmArgs

**For running assertions in IJava Kernel**:  
You have to edit the `kernel.json` file located at:  
`C:\Users\k26ra\AppData\Local\Programs\Python\Python312\share\jupyter\kernels\java`.  
**Note:** Replace `"k26ra"` with **your own username** in the path.

To enable assertions, the `-ea` flag must be passed in the JVM arguments. In the IJava kernel, this can be done by editing the `kernel.json` and adding the `-ea` flag to the `argv` list.

The updated `kernel.json` would look like this:

```json
{
  "argv": [
    "java",
    "-ea",
    "-jar",
    "C:\\Users\\YourUsername\\AppData\\Local\\Programs\\Python\\Python312\\share\\jupyter\\kernels\\java/ijava-1.3.0.jar",
    "{connection_file}"
  ],
  "display_name": "Java",
  "env": {},
  "interrupt_mode": "message",
  "language": "java"
}
```

---

## Creating Problem Files

1. **Navigate to the Package Directory:**

   - Navigate to the package directory for the set you want to solve the problems, e.g., `Basic_17`.

2. **Create a New Java File:**

   - Create a new file with the `.java` extension, e.g., `Problem_2.java`.
   - Implement your Java class within this file.

   ```java
   package Basic_17;

   public class Problem_2 {

       public static void main(String[] args) {
           // Implementation call
           System.out.println(problemFunction(arguments));

           // Uncomment the following line to run tests
           // runTests();
       }

       // Define your problem-specific method here
       public static ReturnType problemFunction(Parameters) {
           // Your implementation here
       }

       // Define a method for running tests
       public static void runTests() {
           // Test calls
           System.out.println("All tests passed!");
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
