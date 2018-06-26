package Project;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Table {
    ArrayList columns = new ArrayList();
    ArrayList records = new ArrayList();

    public Table() {
        Scanner scan = new Scanner(System.in);
        String delimiter = "[ ]+";
        int number_of_columns = setNumberOfColumns();
        for (int i = 0; i < number_of_columns; i++){
            String column_name;
            System.out.println("Column no. " + (i+1) + " name: ");
            column_name = scan.nextLine();
            columns.add(column_name);
        }
        System.out.println("Create first record: ");
        records.add(new Record(number_of_columns, columns));
    }

    int setNumberOfColumns(){
        Scanner scan = new Scanner(System.in);
        int number_of_columns;
        try {
            System.out.println("How many columns do you want to create?");
            number_of_columns = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("~Try again~");
            number_of_columns = setNumberOfColumns();
        }
        return number_of_columns;
    }

    public void showTable(){
        for (int i = 0; i < columns.size(); i++ ){
            System.out.print(columns.get(i) + " | ");
        }
        System.out.println();
        for (int i = 0; i < records.size(); i++){
            Record record = (Record) records.get(i);
            record.showRecord();
        }
    }
}
