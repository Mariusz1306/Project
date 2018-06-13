package Project;

public class DELETE {
    public DELETE(Database db, int index){
        db.deleteByIndex(index);
    }
}
