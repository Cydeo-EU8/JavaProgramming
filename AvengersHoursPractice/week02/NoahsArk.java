package week02;

import java.util.ArrayList;

public class NoahsArk {
    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
        dogs.setInfo("dogs",50,10);
        System.out.println(dogs);

        AnimalSpecies cats = new AnimalSpecies("cats",60,15);

        System.out.println("Habitat  of animals: "+AnimalSpecies.habitat);


        ArrayList<AnimalSpecies> NoahsArkAnimalList = new ArrayList();

        NoahsArkAnimalList.add(dogs);
        NoahsArkAnimalList.add(cats);

        AnimalSpecies elephants = new AnimalSpecies();
        elephants.name="Elephant";
        elephants.population=10;
        elephants.growthRate=5;
        NoahsArkAnimalList.add(elephants);

        for (AnimalSpecies each : NoahsArkAnimalList){
            System.out.println("each.name = " + each.name);
        }

        int maxPopulation = NoahsArkAnimalList.get(0).population;
        for(AnimalSpecies each: NoahsArkAnimalList){
            if(each.population>maxPopulation){
                maxPopulation= each.population;
            }
        }

    }
}
