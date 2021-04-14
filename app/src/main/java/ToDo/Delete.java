package ToDo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Delete {

    public static void deleteToDoList() throws IOException {
        Scanner ss = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter name (prefix) of file to be deleted.");
        String name = ss.nextLine();
        String title = name + ".txt";
        Path fileToDeletePath = Paths.get("C:\\ToDoList_SavedFiles\\" + title);

        try {
            Files.delete(fileToDeletePath);
        } catch (IOException e) {
            System.out.println("File name not found; cannot delete. Returning to Main Menu.");
            CallMainMenu.returnToMainMenu();;
        }
        System.out.println("The file " + title + " has been Deleted successfully.");
    }
}