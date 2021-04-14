package ToDo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Add {

    public static void addToDoList() throws FileNotFoundException {
        PrintStream original = System.out;
        String fileName = getFileName();
        String data = getListText();
        String title = fileName + ".txt";

        displayFileTitleLocation(title);
        createFolderSaveFile(title);
        addListTextToFile(data, title);

        System.setOut(original);
    }

    private static void createFolderSaveFile(String title) throws FileNotFoundException {
        try {
            Files.createDirectories(Paths.get("C:\\ToDoList_SavedFiles\\"));
        } catch (IOException e) {
            System.out.println("Unable to create folder C:\\ToDoList_SavedFiles\\.");
            e.printStackTrace();
        }

        PrintStream out = new PrintStream(
                new FileOutputStream("C:\\ToDoList_SavedFiles\\" + title));
        System.setOut(out);
    }

    private static void addListTextToFile(String data, String title) throws FileNotFoundException {
        PrintStream writeToFile = new PrintStream("C:\\ToDoList_SavedFiles\\" + title);
        writeToFile.append(data);
    }

    private static void displayFileTitleLocation(String title) {
        System.out.println("ToDo List File:  " + title + "  saved at  C:\\ToDoList_SavedFiles\\");
    }

    private static String getListText() {
        System.out.println("Enter To Do List Text. Text should be entered on a single line. When done, press Enter.");
        Scanner ln = new Scanner(System.in);
        String data;
        data = ln.nextLine();
        return data;
    }

    private static String getFileName() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter name for new ToDo List, then press Enter.");
        String fileName;
        fileName = ss.nextLine();
        return fileName;
    }
}