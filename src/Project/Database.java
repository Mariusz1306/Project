package Project;

import Project.Exception.EmptyRecordException;

import java.util.*;

public class Database {
    Hashtable<String, Table> tables = new Hashtable<>();

    public Database() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Create first table in your database: ");
        System.out.println("Name your table: ");
        String table_name = scan.nextLine();
        Table table = new Table();
        tables.put(table_name, table);
    }
/*
    public void INSERT(){
        Scanner scan = new Scanner(System.in);
        String choice, string_tokens[];
        String delimiter = "[ ]+";
        String name = null;
        String lastname = null;
        String position = null;
        String id = null;
        String salary = null;

        System.out.println("Which fields do you want to add? (Type in number delimited by spaces)");
        System.out.println("1: Id:");
        System.out.println("2: Name:");
        System.out.println("3: Last name:");
        System.out.println("4: Position:");
        System.out.println("5: Salary");
        choice = scan.nextLine();
        string_tokens = choice.split(delimiter);
        int[] tokens = new int[string_tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = Integer.parseInt(string_tokens[i]);
        }
        Arrays.sort(tokens);
        tokens = Arrays.stream(tokens).distinct().toArray();

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case 1:
                    System.out.println("Id:");
                    id = scan.next();
                    break;
                case 2:
                    System.out.println("Name:");
                    name = scan.next();
                    break;
                case 3:
                    System.out.println("Last name:");
                    lastname = scan.next();
                    break;
                case 4:
                    System.out.println("Position:");
                    position = scan.next();
                    break;
                case 5:
                    System.out.println("Salary");
                    salary = scan.next();
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        }
        try {
            Record record = new Record(id, name, lastname, position, salary);
            this.addToDatabase(record);
        } catch (EmptyRecordException e){
            System.out.println(e.getMessage());
            this.deleteByRecord(e.getRecord());
        }
    }

    public void DELETE() {
        Scanner scan = new Scanner(System.in);
        int index;

        System.out.println("Type in index of element that you want to delete");
        index = scan.nextInt();

        db.remove(index);
    }

    public void UPDATE() {
        Scanner scan = new Scanner(System.in);
        int index;
        String choice, string_tokens[];
        String delimiter = "[ ]+";
        String name = null;
        String lastname = null;
        String position = null;
        String id = null;
        String salary = null;

        System.out.println("Type in index of element that you want to update");
        index = scan.nextInt();

        System.out.println("Which fields do you want to update? (Type in number delimited by spaces)");
        System.out.println("1: Id:");
        System.out.println("2: Name:");
        System.out.println("3: Last name:");
        System.out.println("4: Position:");
        System.out.println("5: Salary");
        choice = scan.nextLine();
        string_tokens = choice.split(delimiter);
        int[] tokens = new int[string_tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = Integer.parseInt(string_tokens[i]);
        }
        Arrays.sort(tokens);
        tokens = Arrays.stream(tokens).distinct().toArray();

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case 1:
                    System.out.println("Id:");
                    id = scan.next();
                    db.elementAt(index).setId(id);
                    break;
                case 2:
                    System.out.println("Name:");
                    name = scan.next();
                    db.elementAt(index).setName(name);
                    break;
                case 3:
                    System.out.println("Last name:");
                    lastname = scan.next();
                    db.elementAt(index).setLastName(lastname);
                    break;
                case 4:
                    System.out.println("Position:");
                    position = scan.next();
                    db.elementAt(index).setPosition(position);
                    break;
                case 5:
                    System.out.println("Salary");
                    salary = scan.next();
                    db.elementAt(index).setSalary(salary);
                    break;
                default:
                    System.out.println("Wrong number");
                    break;
            }
        }
    }
    */

    public void SELECT(String key) {
        try {
            tables.get(key).showTable();
        } catch (NullPointerException e){
            System.out.println("~There is no table with that name~");
        }
    }

}
