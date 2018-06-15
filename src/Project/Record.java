package Project;

import Project.Exception.EmptyRecordException;

import java.util.Scanner;

public class Record {

    String id, name, lastName, position, salary;

    public Record() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Id:");
        this.id = scan.next();
        System.out.println("Name:");
        this.name = scan.next();
        System.out.println("Last name:");
        this.lastName = scan.next();
        System.out.println("Position:");
        this.position = scan.next();
        System.out.println("Salary");
        this.salary = scan.next();
    }

    public Record(String id, String name, String lastName, String position, String salary) {
        if (allNull(name, lastName, position, id, salary)) {
            throw new EmptyRecordException("You can't create empty record!", this);
        } else {
            this.name = name;
            this.lastName = lastName;
            this.position = position;
            this.id = id;
            this.salary = salary;
        }
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    boolean allNull(String... args) {
        for (String arg : args) {
            if (arg != null) {
                return false;
            }
        }
        return true;
    }
}
