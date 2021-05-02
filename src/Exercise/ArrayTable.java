package Exercise;

public class ArrayTable {
    public static void main(String[] args) {
        Array array = new Array();
        int[][] table = {{1,2,3,4,5}, {1,0,1,1,1,2}, {4,5,6}, {7,8,9,10,11,12}};

        array.displayIntArrayTable(table);

        System.out.println("sum is " + array.getArraySum(table));

    }

}
