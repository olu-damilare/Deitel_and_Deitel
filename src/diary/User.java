package diary;

import java.util.List;

public class User {
    private final Diary diary;

    public User(String userName, Diary diary) {
        this.diary = diary;
    }

    public Diary getDiary() {
        return diary;
    }

    public void writeOnDiary(Entry entryBody) {
        diary.addEntry(entryBody);
    }

    public String getEntryID(Entry entry) {
        return diary.getEntryID(entry);
    }

    public Entry getEntry(String entryID, String password) {
        return diary.getEntry(entryID, password);
    }

    public int getTotalNumberOfEntriesOnDiary() {
        return diary.getTotalNumberOfEntries();
    }

    public void deleteEntryFromDiary(String password, String entryID) {
        diary.deleteEntry(password, entryID);
    }

    public List<Entry> viewEntries(String password) {
        return diary.getEntries(password);
    }

    public void setDiaryPassword(String password) {
        diary.setPassword(password);
    }

    public String getDiaryPassword() {
        return diary.getPassword();
    }
}
