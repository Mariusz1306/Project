package Project;

import java.util.Vector;

public class Database {
    Vector<Record> db;

    public Database(){
        this.db = new Vector<Record>();
    }

    public Database(Vector<Record> record) {
        this.db = record;
    }

    public Database(Database database){
        this.db = database.db;
    }

    public Vector<Record> getDb() {
        return db;
    }

    public void setDb(Vector<Record> db) {
        this.db = db;
    }

    public void addToDatabase(Record record){
        db.add(record);
    }

    public void deleteByIndex(int index){
        db.remove(index);
    }
}
