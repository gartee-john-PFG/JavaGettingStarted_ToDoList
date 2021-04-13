package ToDo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Add {

    public static void addToDoList() throws FileNotFoundException {

        //Console input to define name of list
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter name for new ToDo List");
        String fileName = ss.nextLine();

        //Need to create subfolder if it doesn't already exist. For now, it assumes it does exist

        System.out.println("ToDo List File:  " + fileName + ".txt  saved at  C:\\ToDoList_SavedFiles\\");

        //save file - nice to have - let user pick where to store.
        PrintStream out = new PrintStream(
                new FileOutputStream("C:\\ToDoList_SavedFiles\\" +fileName +".txt"));
        System.setOut(out);

        //Console input to define list contents
        //done - return to main menu
    }
}
