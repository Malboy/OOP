package HW_Sem_6.FactoryPattern;


public class Farm {
public static Animal getAnimal(String type){
        if(type.equals("CHICKENS"))
        {
        return new Chickens();
        }
        if(type.equals("Cows"))
        {
        return new Cows();
        }
        return null;
        }
}

