package Project.Exception;

import Project.Record;

public class EmptyRecordException extends RuntimeException{
    Record record;

    public EmptyRecordException(String message, Record record) {
        super(message);
        this.record = record;
    }

    public Record getRecord() {
        return record;
    }
}
