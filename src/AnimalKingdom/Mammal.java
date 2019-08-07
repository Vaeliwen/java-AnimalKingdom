package AnimalKingdom;

public class Mammal extends AbstractAnimal {


    public Mammal(String name, int yearDiscovered, int id){
        super(name, yearDiscovered, id);
    }


    @Override
    public String animalBreathing(){
        return "lungs: " + getName();
    }

    @Override
    public String animalMovement(){
        return "walks: " + getName();
    }

    @Override
    public String animalReproduction() {
        return "live births: " + getName();
    }

    @Override
    public String toString(){
        return "Mammal{" +
                "name='" + getName() + "\'" + ", " +
                "discovered=" + getYearDiscovered() + ", " +
                "id=" + getId() + "}";
    }
}
