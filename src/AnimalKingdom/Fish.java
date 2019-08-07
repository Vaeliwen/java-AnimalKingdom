package AnimalKingdom;

public class Fish extends AbstractAnimal {

    public Fish(String name, int yearDiscovered, int id){
        super(name, yearDiscovered, id);
    }

    @Override
    public String animalReproduction() {
        return getName() + " reproduces through the laying of eggs!";
    }

    @Override
    public String animalMovement() {
        return getName() + " swims to move!";
    }

    @Override
    public String animalBreathing() {
        return getName() + " uses their gills to breathe!";
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + getName() + "\'" + ", " +
                "discovered=" + getYearDiscovered() + ", " +
                "id=" + getId() + "}";
    }
}
