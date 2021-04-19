package diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<Entry> entries = new ArrayList<>();

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public int getTotalNumberOfEntries() {
        return entries.size();
    }
}
