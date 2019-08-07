package AnimalKingdom;

public class Bird extends AbstractAnimal {

    public Bird(String name, int yearDiscovered, int id){
        super(name, yearDiscovered, id);
    }

    @Override
    public String animalReproduction() {
        return getName() + " reproduces through the laying of eggs!";
    }

    @Override
    public String animalMovement() {
        return getName() + " flies to move!";
    }

    @Override
    public String animalBreathing() {
        return getName() + " uses their lungs to breathe!";
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + getName() + "\'" + ", " +
                "discovered=" + getYearDiscovered() + ", " +
                "id=" + getId() + "}";
    }
}
