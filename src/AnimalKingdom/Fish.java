package AnimalKingdom;

public class Fish extends Animal {

    public Fish(String name, int yearDiscovered, int id){
        this.name = name;
        this.id = id;
        this.yearDiscovered = yearDiscovered;
    }

    public String animalReproduction() {
        return name = " reproduces through the laying of eggs!";
    }

    public String animalMovement() {
        return name + " swims to move!";
    }

    public String animalBreathing() {
        return name + " uses their gills to breathe!";
    }
}
