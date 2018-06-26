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
            System.out.println("4. Select");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    //db.SELECT();
                    break;
                case 2:
                    //db.INSERT();
                    break;
                case 3:
                    //db.UPDATE();
                    break;
                case 4:
                    //db.DELETE();
                default:
                    break;
            }
        }
    }
    
    public static void main(String[] args) {
        Database db = new Database();
        db.SELECT("test table");
        System.out.println("end");
        //while(true){
        //        Menu.MainMenu(db);
        //}
    }
}