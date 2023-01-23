package HW_Sem_6.FactoryPattern;

public class Main {
    public static void main(String s[]){
	
        Animal creature = Farm.getAnimal("Cows");
        creature.showNumOfAnimals();
    
        Animal Creature = Farm.getAnimal("Chickens");
        Creature.showNumOfAnimals();

    }
}
