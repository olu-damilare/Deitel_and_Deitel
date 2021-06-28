package chapterSixteen;

import chapterSix.Mathematics;

import java.util.*;

public class LinkedListOperation {

    public void insertValue( LinkedList<Integer> numbers, int value){
        numbers.add(value);
        Collections.sort(numbers);
    }

    public int calculateSum(List<Integer> list){
        int sum = 0;
        for(int number: list){
            sum += number;
        }
        return sum;
    }
    
    public double calculateAverage(List<Integer> list){
        return (calculateSum(list) * 1.0) / list.size();
    }

    public List<Integer> cloneInReverse(LinkedList<Integer> list){
        LinkedList<Integer> secondList = (LinkedList<Integer>) list.clone();
        Collections.sort(secondList, Comparator.reverseOrder());
        return secondList;
    }

    public Set<Integer> obtainPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();

        for (int i = 2; i < (number / 2); i++) {
            if (number % i == 0) {
                if (Mathematics.isPrime(i)) {
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }

    public Set<String> sortWordsWithSet(String sentence){
        String[] words = sentence.split("\\s+");
        return new TreeSet<>(Arrays.asList(words));
    }


}
