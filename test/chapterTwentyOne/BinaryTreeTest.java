package chapterTwentyOne;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeTest {

    @Test
    void testToInsertWithDuplicate(){
        Tree<Integer> tree = new Tree<Integer>();
        Random random = new Random();
        int value =0;
        for (int i = 0; i < 10; i++) {
            value = random.nextInt(100);
            System.out.print(value + " ");
            tree.insert(value);
        }
        System.out.println();
        assertTrue(tree.contains(value));


    }
}
