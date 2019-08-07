package AnimalKingdom;

public class Mammal extends Animal {

    public Mammal(String name, int yearDiscovered, int id){
        this.name = name;
        this.id = id;
        this.yearDiscovered = yearDiscovered;
    }

    public String animalBreathing(){
        return name + " uses their lungs to breathe!";
    }

    public String animalMovement(){
        return name + " walks to move!";
    }

    public String animalReproduction() {
        return name + " reproduces through live birth!";
    }
}
