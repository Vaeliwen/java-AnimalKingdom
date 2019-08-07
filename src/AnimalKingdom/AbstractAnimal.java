package AnimalKingdom;

public abstract class AbstractAnimal {

    private int id;
    private String name;
    private int yearDiscovered;

     public AbstractAnimal(String name, int yearDiscovered, int id){
        this.name = name;
        this.id = id;
        this.yearDiscovered = yearDiscovered;
    }

    public abstract String animalMovement();
    public abstract String animalBreathing();
    public abstract String animalReproduction();

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
    public int getYearDiscovered(){
        return yearDiscovered;
    }

}
