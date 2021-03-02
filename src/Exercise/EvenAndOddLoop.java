public class EvenAndOddLoop{
	public static void main(String[] args){
	int number = 1;
		while(number <= 100){
			if(number % 2 == 0){
				System.out.print(" " + number);
				number++;
			}
			else 
				number++;
		}
		System.out.println();
	int oddNumber = 1;
		while(oddNumber <= 100){
			if(oddNumber % 2 == 1){
				System.out.print(" " + oddNumber);
				oddNumber++;
			}
			else 
				oddNumber++;
		}
			
	}
}