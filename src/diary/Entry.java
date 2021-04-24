package diary;

import java.time.LocalDateTime;

public class Entry {
    private final String entryBody;
    private String entryID;
    private final LocalDateTime localDateTime;

    public Entry(String entryBody) {
        this.entryBody = entryBody;
        localDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return  "Entry ID = " + entryID + '\n' +
                "Time of entry creation = " + localDateTime + '\n' +
                "Entry Body = " + entryBody;
    }

    public String getEntryID() {
        return entryID;
    }

    public void assignEntryID(String entryID) {
        this.entryID = entryID;
    }
}
