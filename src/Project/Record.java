package Project;

import java.util.Scanner;

public class Record {

    String name, lastName, position;
    int id, salary;

    public Record() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Id:");
        this.id = scan.nextInt();
        System.out.println("Name:");
        this.name = scan.next();
        System.out.println("Last name:");
        this.lastName = scan.next();
        System.out.println("Position:");
        this.position = scan.next();
        System.out.println("Salary");
        this.salary = scan.nextInt();
    }

    public Record(String name, String lastName, String position, int id, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
