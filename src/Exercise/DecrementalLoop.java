package Exercise;

public class DecrementalLoop {
    public static void main(String[] args) {
        int number = 1;
//        for (int i = 10; i >= number ; i--) {
//            System.out.println(i);
//        }
       int  counter = 10;
        while(counter >= number){
            if(number == 5)
                continue;
            System.out.println(number);

        }

    }
}
