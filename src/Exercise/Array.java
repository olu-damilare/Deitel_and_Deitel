package Exercise;

public class Array {

    private static final int[][] numbers = new int[6][6];


    public static void setNumber(int row,int column, int value){
        numbers[row][column] = value;
    }

    public static int obtainLonelyInteger(int[] numbers) {
        int uniqueNumber = 0;
        boolean isUnique = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] != numbers[j])
                    isUnique = true;
                else {isUnique = false; break;}
            }
            if(isUnique) return numbers[i];
        }
        return uniqueNumber;
    }

    public static void displayIntArrayTable(int[][] array){
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();

        }
    }
    public int getArraySum(int[][] array){
        int total = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }






    public static void main(String[] args) {
        Array.displayIntArrayTable(numbers);
        System.out.println();

        Array.setNumber(3,4,11);
        Array.displayIntArrayTable(numbers);


            int[] newArray = {2,3,4,5,6};
            int maxSum = 0;
            int minSum;
            int sum = 0;
            for (int i = 0; i < newArray.length; i++) {
                sum += newArray[i];
            }
            maxSum = sum - newArray[0];
            minSum = sum - newArray[1];

            int temp = maxSum;
            if(minSum > maxSum){
                maxSum = minSum;
                minSum = temp;
            }
            for (int i = 1; i < newArray.length; i++) {
                sum += newArray[i];
                maxSum = sum - newArray[i-1];
                minSum = sum - newArray[i ];
                if(sum > maxSum)
                    maxSum = sum;
                else if(sum < minSum)
                    minSum = sum;
            }
            System.out.println(maxSum);
            System.out.println(minSum);


    }
}
