package chapterFour;

public class WorldPopulationGrowth {
    public void calculateWorldPopulationGrowth(){
        long initialWorldPopulation = 7674000000l;
        long previousWordPopulation = initialWorldPopulation;
        double populationGrowthRate = 1.1;
        int year = 1;
        long worldPopulation = initialWorldPopulation + (((long)populationGrowthRate * initialWorldPopulation)/100);
        boolean isDouble  = true;
        int doublePopulation = 0;
        long difference =  worldPopulation - initialWorldPopulation;


        System.out.println("Year\t" + "World Population\t\t" + "Population difference");
        System.out.println(year + "\t\t" + worldPopulation + "\t\t\t\t" + difference);

        while(year <= 75){
            initialWorldPopulation = worldPopulation;
            worldPopulation = initialWorldPopulation + (((long)populationGrowthRate * initialWorldPopulation)/100);
            difference =  worldPopulation - initialWorldPopulation;
            System.out.println(year + "\t\t" + worldPopulation + "\t\t\t\t" + difference);
            if(worldPopulation >= (2 * previousWordPopulation) && isDouble == true){
                doublePopulation = year;
                isDouble = false;
            }
            year++;

        }

        System.out.println("\n population doubled at year " + doublePopulation );
    }
}
