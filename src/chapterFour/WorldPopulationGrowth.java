package chapterFour;

public class WorldPopulationGrowth {
    public void calculateWorldPopulationGrowth(){
        long previousWorldPopulation = 7674000000l;
        double populationGrowthRate = 1.1;
        int year = 1;
        long worldPopulation = previousWorldPopulation + (((long)populationGrowthRate * previousWorldPopulation)/100);
        long difference =  worldPopulation - previousWorldPopulation;

        System.out.println("Year\t" + "World Population\t\t" + "Population difference");
        System.out.println(year + "\t\t" + worldPopulation + "\t\t\t\t" + difference);

        while(year <= 75){
            previousWorldPopulation = worldPopulation;
            worldPopulation = previousWorldPopulation + (((long)populationGrowthRate * previousWorldPopulation)/100);
            difference =  worldPopulation - previousWorldPopulation;
            System.out.println(year + "\t\t" + worldPopulation + "\t\t\t\t" + difference);
            year++;

        }
    }
}
