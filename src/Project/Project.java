package Project;

import Project.Record;

import java.util.Scanner;
import java.util.Vector;


public class Project {

    static class Menu{
        static Database db;
        static int choice;
        static Scanner scan = new Scanner(System.in);

        static void MainMenu(Database database) {
            db = database;
            System.out.println("What do you want to do?");
            System.out.println("1. Create record");
            System.out.println("2. Update record");
            System.out.println("3. Delete record");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    db.CREATE();
                    break;
                case 2:
                    UpdateMenu();
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
        static void UpdateMenu() {
            System.out.println("Do you want to select by index, or search for specific entry?");
            System.out.println("1. Index");
            System.out.println("2. Search (WHERE)");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    //System.out.println("Provide index. From 0 to " + db.size());
                    //index = scan.nextInt();
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        Database db = new Database();

        while(true){
                Menu.MainMenu(db);
        }
    }
}1