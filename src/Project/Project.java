package Project;

import Project.Record;

import java.util.Scanner;
import java.util.Vector;


public class Project {
    
    public static void main(String[] args) {
        int choice, index;
        String imie, nazwisko, funkcja;
        int id, zarobki;
        Scanner scan = new Scanner(System.in);
        Vector<Record> db = new Vector<>();
        Record record = new Record();
        while(true){
            System.out.println("What do you want to do?");
            System.out.println("1. Create record");
            System.out.println("2. Update record");
            System.out.println("3. Delete record");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Id:");
                    id = scan.nextInt();
                    System.out.println("Name:");
                    imie = scan.next();
                    System.out.println("Last name:");
                    nazwisko = scan.next();
                    System.out.println("Position:");
                    funkcja = scan.next();
                    System.out.println("Salary");
                    zarobki = scan.nextInt();
                    record = new Record(imie, nazwisko, funkcja, id, zarobki);
                    db.add(record);
                    break;
                case 2:
                    System.out.println("Do you want to select by index, or search for specific entry?");
                    System.out.println("1. Index");
                    System.out.println("2. Search (WHERE)");
                    choice = scan.nextInt();
                    switch (choice){
                        case 1:
                            System.out.println("Provide index. From 0 to " + db.size());
                            index = scan.nextInt();
                            break;
                }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
}