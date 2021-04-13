package ToDo;

import java.util.Scanner;

public class MainMenu {

    public static String mainScreenDisplay() {
        Scanner s = new Scanner(System.in);
        System.out.println("                          Main Menu");
        System.out.println("\n");
        System.out.println("1.  Open ToDo List");
        System.out.println("2.  Display ToDo List");
        System.out.println("3.  Add a ToDo List");
        System.out.println("4.  Edit ToDo List");
        System.out.println("5.  Delete ToDo List");
        System.out.println("6.  Save ToDo List");
        System.out.println("7.  Exit");
        System.out.println("\n");
        System.out.println("Select Option");
        String u = s.nextLine();
        return u;
    }

    static void processMenuChoice(String input) {
        switch (input) {
            case "1":
//                Open ToDo List
                System.out.println(input + " was returned");
                break;
            case "2":
//                Display ToDo List
                System.out.println("Display contents of ToDoList.txt file");
                try {
                    Display.displayToDoList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "3":
//                Add a ToDo List
                //System.out.println(input + " was returned");
                try {
                    Add.addToDoList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "4":
//                Edit ToDo List
                System.out.println(input + " was returned");
                break;
            case "5":
//                Delete ToDo List
                System.out.println(input + " was returned");
                break;
            case "6":
//                Save ToDo List
                System.out.println(input + " was returned");
                break;
            case "7":
//                Exit
                System.out.println(input + " was returned");
                break;
        }
    }
}
