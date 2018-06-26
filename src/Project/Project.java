package Project;

import java.util.Scanner;


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
            System.out.println("4. Select");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    db.INSERT();
                    break;
                case 2:
                    db.UPDATE();
                    break;
                case 3:
                    db.DELETE();
                    break;
                case 4:
                    db.SELECT();
                default:
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
}