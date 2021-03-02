public class WorldPopulationGrowthRate{
	public static void main(String[] args){

	long worldPopulation = 7674000000l;

	double populationGrowthRate = 1.1;

	long firstYear = worldPopulation + (((long)populationGrowthRate * worldPopulation)/100);	
	long secondYear = firstYear + (((long)populationGrowthRate * firstYear)/100);
	long thirdYear = secondYear + (((long)populationGrowthRate * secondYear)/100);
	long fourthYear = thirdYear + (((long)populationGrowthRate * thirdYear)/100);
	long fifthYear = fourthYear + (((long)populationGrowthRate * fourthYear)/100);
	
	System.out.println("the population for Year one is " + firstYear);
	System.out.println("the population for Year two is " + secondYear);
	System.out.println("the population for Year three is " + thirdYear);
	System.out.println("the population for Year four is " + fourthYear);
	System.out.println("the population for Year five is " + fifthYear);
	}



}