package AnimalKingdom;

public class Main {

    public static void main(String[] args) {

        //Mammals
        Mammal panda = new Mammal("Panda", 1869, 0);
        Mammal zebra = new Mammal("Zebra", 1778, 1);
        Mammal koala = new Mammal("Koala", 1816, 2);
        Mammal sloth = new Mammal("Sloth", 1804, 3);
        Mammal armadillo = new Mammal("Armadillo", 1758, 4);
        Mammal raccoon = new Mammal("Raccoon", 1758, 5);
        Mammal bigfoot = new Mammal("Bigfoot", 2021, 6);

        //Birds
        Bird pigeon = new Bird("Pigeon", 1837, 7);
        Bird peacock = new Bird("Peacock", 1821, 8);
        Bird toucan = new Bird("Toucan", 1758, 9);
        Bird parrot = new Bird("Parrot", 1824, 10);
        Bird swan = new Bird("Swan", 1758, 11);

        //Fish
        Fish salmon = new Fish("Salmon", 1758, 12);
        Fish catfish = new Fish("Catfish", 1817, 13);
        Fish perch = new Fish("Perch", 1758, 14);
    }
}
