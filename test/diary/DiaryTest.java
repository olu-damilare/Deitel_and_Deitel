package diary;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {

    @Test
    void testThatDiaryCanAddEntry(){
        Diary diary = new Diary();
        String entryBody = "";
        Entry entry = new Entry(entryBody);
        diary.addEntry(entry);
        assertEquals(1, diary.getTotalNumberOfEntries());
        String entryID = diary.getEntryID(entry);
        assertEquals(entry, diary.getEntry(entryID, entryID));

        System.out.println(entry);
    }

    @Test
    void testThatDiaryCanTakeMultipleEntries(){
        Diary diary = new Diary();
        String entryBody = "";
        Entry entry = new Entry(entryBody);
        diary.addEntry(entry);
        Entry secondEntry = new Entry(entryBody);
        diary.addEntry(secondEntry);
        assertEquals(2, diary.getTotalNumberOfEntries());
    }


    }

