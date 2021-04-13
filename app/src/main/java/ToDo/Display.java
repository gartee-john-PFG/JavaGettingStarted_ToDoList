package ToDo;

import java.io.File;
import java.util.Scanner;

//nice to have - display a list of saved user files and let user enter name of one to display

public class Display {
    public static void displayToDoList() throws Exception {
        File file = new File("C:\\Users\\k330620\\Documents\\Java_class\\JavaGettingStarted_ToDoList\\app\\src\\main\\java\\ToDo\\ToDoList.txt");
        Scanner sc = new Scanner(file);
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(" " + sc.nextLine());
        }
        System.out.println(sb);
    }
}
