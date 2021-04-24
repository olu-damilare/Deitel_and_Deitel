package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDiaryTest {
    Diary diary;
    User user;
    @BeforeEach
    void setUp(){
        diary = new Diary();
        user = new User("Timmy", diary);
        }
    @Test
    void testThatUserHasADiary(){
        assertEquals(diary, user.getDiary());
    }

    @Test
    void testThatUserCanSetDiaryPassword(){
        String password = "1234";
        user.setDiaryPassword(password);
        assertEquals(password, user.getDiaryPassword());
    }
    @Test
    void testThatUserMustUsePasswordToViewEntry(){
        String password = "1234";
        user.setDiaryPassword(password);
        assertEquals(password, user.getDiaryPassword());

        String entryBody = """
                Today is another
                day
                """;
        Entry entry = new Entry(entryBody);
        user.writeOnDiary(entry);
        String entryID = user.getEntryID(entry);


        assertEquals(entry, user.getEntry(entryID, password));
        assertEquals(1, user.getTotalNumberOfEntriesOnDiary());
    }

    @Test
    void testThatUserCanWriteOnDiary(){
        String entryBody = """
                Today is another
                day
                """;
        Entry entry = new Entry(entryBody);
        user.writeOnDiary(entry);
        String entryID = user.getEntryID(entry);
        String password = "1234";
        user.setDiaryPassword(password);
        assertEquals(entry, user.getEntry(entryID, password));
        assertEquals(1, user.getTotalNumberOfEntriesOnDiary());

    }

    @Test
    void testThatUserMustUsePasswordToDeleteEntry(){
        String password = "1234";
        user.setDiaryPassword(password);
        assertEquals(password, user.getDiaryPassword());
        String entryBody = """
                Today is another
                day
                """;
        Entry entry = new Entry(entryBody);
        user.writeOnDiary(entry);
        Entry secondEntry = new Entry(entryBody);
        user.writeOnDiary(secondEntry);
        assertEquals(2, user.getTotalNumberOfEntriesOnDiary());

        String entryID = user.getEntryID(entry);
        String secondEntryID = user.getEntryID(secondEntry);

        user.deleteEntryFromDiary(password, entryID);
        assertEquals(1, user.getTotalNumberOfEntriesOnDiary());
        user.deleteEntryFromDiary(password, secondEntryID);
        assertEquals(0, user.getTotalNumberOfEntriesOnDiary());
    }
    @Test
    void testThatUserCanViewAllEntriesWithPassword(){
        String password = "1234";
        user.setDiaryPassword(password);
        assertEquals(password, user.getDiaryPassword());

        String entryBody = """
                Today is another
                day
                """;
        Entry entry = new Entry(entryBody);
        user.writeOnDiary(entry);
        Entry secondEntry = new Entry(entryBody);
        user.writeOnDiary(secondEntry);
        assertEquals(2, user.getTotalNumberOfEntriesOnDiary());

       List<Entry> entries = user.viewEntries(password);
        assertEquals(2, entries.size());
    }
}
