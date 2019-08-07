package AnimalKingdom;

public class Bird extends Animal {

    public Bird(String name, int yearDiscovered, int id){
        this.name = name;
        this.id = id;
        this.yearDiscovered = yearDiscovered;
    }

    public String animalReproduction() {
        return name = " reproduces through the laying of eggs!";
    }

    public String animalMovement() {
        return name + " flies to move!";
    }

    public String animalBreathing() {
        return name + " uses their lungs to breathe!";
    }
}
