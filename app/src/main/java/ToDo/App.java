/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ToDo;

public class App {
    public String getGreeting() {
        return "ToDo List Manager";
    }

    public static void main(String[] args) {
        String input = Menu.mainScreenDisplay();
        Menu.processMenuChoice(input);
    }
}
