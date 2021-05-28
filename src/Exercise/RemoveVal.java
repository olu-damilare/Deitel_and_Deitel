package tddClasses;

public class RemoveVal {
    public static int remove(int[] numbers, int number) {
      if(numbers == null)  return 0;
        int notValCount = 0;
        for (int j : numbers)
            if (j != number)
                notValCount++;
        return notValCount;
    }
}
