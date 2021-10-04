package Exercise.queue;

import java.util.Arrays;

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        if(m>=n) return null;
        if(n-m < g) return null;
        long start = 0;
        long end = 0;

        for (long i = m; i <= n ; i++) {
            if(isPrime(i)){
                start = i;
                for (long j = i; j <= n; j++) {
                    if(j == i) continue;
                    if(isPrime(j)){
                        end = j;
                        break;
                    }
                }
            }
            if(end - start == g){
               return new long[]{start, end};
            }


        }
        return null;

    }



    private static boolean isPrime(long number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }

    
}
