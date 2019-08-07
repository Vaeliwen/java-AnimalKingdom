package AnimalKingdom;

public class Mammal extends AbstractAnimal {

    public Mammal(String name, int yearDiscovered, int id){
        super(name, yearDiscovered, id);
    }

    @Override
    public String animalBreathing(){
        return getName() + " uses their lungs to breathe!";
    }

    @Override
    public String animalMovement(){
        return getName() + " walks to move!";
    }

    @Override
    public String animalReproduction() {
        return getName() + " reproduces through live birth!";
    }

    @Override
    public String toString(){
        return "Mammal{" +
                "name='" + getName() + "\'" + ", " +
                "discovered=" + getYearDiscovered() + ", " +
                "id=" + getId() + "}";
    }
}
