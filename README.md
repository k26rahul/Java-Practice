## Creating Problem Files

1. **Navigate to the Package Directory:**

   - Navigate to the package directory for the date you want to solve the problems. For today, this would be the `September_09` directory.

2. **Create a New Java File:**

   - Create a new file with the `.java` extension, e.g., `Problem_2.java`.
   - Implement your Java class within this file.

   ```java
   package September_09;

   public class Problem_2 {
       public static void main(String[] args) {
           // Your code here
       }
   }
   ```

## Running Java Files in VS Code

1. **Open VS Code:**

   - Open your project directory (`Java-Practice`) in VS Code.

2. **Install Java Extensions (if not already installed):**

   - Install the "Java Extension Pack" from the Extensions view (Ctrl+Shift+X) to enable Java development features.

3. **Open the Java File:**

   - Navigate to the file you want to run (e.g., `Problem_2.java`) and open it in the editor.

4. **Run the Java File:**

   - You can use the "Run" button provided by the Java extension. This button appears just above the `main` method in your class. Clicking it will compile and run the file automatically.
   - Alternatively, you can use the terminal to run the compiled class file:
     ```bash
     java -cp bin September_09.Problem_2
     ```

   **Note:** After creating a new Java file, you do not need to manually compile it. VS Code automatically handles the compilation and stores the `.class` files in the `bin` directory.
