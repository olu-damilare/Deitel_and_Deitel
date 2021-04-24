package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<Entry> entries = new ArrayList<>();
    private static int entryIDCounter;
    private String password;

    public void addEntry(Entry entry) {
        String entryID = "DEID" + (++entryIDCounter);
        entry.assignEntryID(entryID);
        entries.add(entry);
    }

    public int getTotalNumberOfEntries() {
        return entries.size();
    }

    public String getEntryID(Entry entry) {
        for (Entry value : entries) {
            if (value.equals(entry))
                return value.getEntryID();
        }
        throw new IllegalArgumentException("Invalid entry");
    }

    public Entry getEntry(String entryID, String password) {
        validatePassword(password);
        Entry entry = findEntryByEntryID(entryID);
        if (entry != null) return entry;
        throw new IllegalArgumentException("Invalid entry ID");
    }

    private Entry findEntryByEntryID(String entryID) {
        for (Entry entry : entries) {
            if (entry.getEntryID().equals(entryID))
                return entry;
        }
        return null;
    }

    private void validatePassword(String password) {
        if(!(password.equals(this.password)))
            throw new IllegalArgumentException("Invalid password");
    }

    public void deleteEntry(String password, String entryID) {
        validatePassword(password);
        Entry entry = findEntryByEntryID(entryID);
        entries.remove(entry);
    }

    public List<Entry> getEntries(String password) {
        validatePassword(password);
        return entries;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
