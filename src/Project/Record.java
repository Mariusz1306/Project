package Project;

import Project.Exception.EmptyRecordException;

import java.util.ArrayList;
import java.util.Scanner;

public class Record {

    ArrayList values = new ArrayList();

    public Record(int number_of_columns, ArrayList columns) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < number_of_columns; i++){
            System.out.println(columns.get(i) + ": ");
            String value = scan.nextLine();
            if (value.length() == 0)
                    value = "null";
            values.add(value);
        }
    }

    public void showRecord(){
        for (int i = 0; i < values.size(); i++){
            System.out.print(values.get(i) + " | ");
        }
    }
}
