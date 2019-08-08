package AnimalKingdom;

public class Fish extends AbstractAnimal {


    public Fish(String name, int yearDiscovered, int id){
        super(name, yearDiscovered, id);
    }



    @Override
    public String animalReproduction() {
        return "eggs: " + getName();
    }

    @Override
    public String animalMovement() {
        return "swims: " + getName();
    }

    @Override
    public String animalBreathing() {
        return "gills: " + getName();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + getName() + "\'" + ", " +
                "discovered=" + getYearDiscovered() + ", " +
                "id=" + getId() + "}";
    }
}
