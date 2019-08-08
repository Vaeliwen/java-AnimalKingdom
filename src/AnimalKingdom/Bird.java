package AnimalKingdom;

public class Bird extends AbstractAnimal {



    public Bird(String name, int yearDiscovered, int id){
        super(name, yearDiscovered, id);
    }

    @Override
    public String animalReproduction() {
        return "eggs: " + getName();
    }

    @Override
    public String animalMovement() {
        return "flies: " + getName();
    }

    @Override
    public String animalBreathing() {
        return "lungs: " + getName();
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + getName() + "\'" + ", " +
                "discovered=" + getYearDiscovered() + ", " +
                "id=" + getId() + "}";
    }
}
