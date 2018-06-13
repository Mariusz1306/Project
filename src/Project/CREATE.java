package Project;

public class CREATE {
    public CREATE(Database db){
        Record record = new Record();
        db.addToDatabase(record);
    }
}
