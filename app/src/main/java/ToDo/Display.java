package ToDo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display {
    public static void displayToDoList() throws Exception {
        String fileToOpen = getFileName();
        String title = fileToOpen + ".txt";

        System.out.println("\n");
        System.out.println("Displaying ToDoList for " + title + ":");
        showFileChosen(title);
    }

    private static void showFileChosen(String title) throws FileNotFoundException {
        File file = new File("C:\\ToDoList_SavedFiles\\" + title);
        Scanner sc = new Scanner(file);
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(" " + sc.nextLine());
        }
        System.out.println(sb);
    }

    private static String getFileName() {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter name (prefix) of file to display");
        String fileToOpen = ss.nextLine();
        return fileToOpen;
    }
}