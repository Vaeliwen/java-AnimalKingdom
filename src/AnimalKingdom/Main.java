package AnimalKingdom;

import java.util.*;

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

        ArrayList<AbstractAnimal> animalArrayList = new ArrayList<AbstractAnimal>();

               animalArrayList.add(panda);
        animalArrayList.add(zebra);
        animalArrayList.add(koala);
        animalArrayList.add(sloth);
        animalArrayList.add(armadillo);
        animalArrayList.add(raccoon);
        animalArrayList.add(bigfoot);
        animalArrayList.add(pigeon);
        animalArrayList.add(peacock);
        animalArrayList.add(toucan);
        animalArrayList.add(parrot);
        animalArrayList.add(swan);
        animalArrayList.add(salmon);
        animalArrayList.add(catfish);
        animalArrayList.add(perch);

        System.out.println("*** TESTS ***");
        System.out.println();

        Collections.sort(animalArrayList, (o1, o2) -> o2.getYearDiscovered() - o1.getYearDiscovered());

        animalArrayList.forEach(a -> System.out.println(a.toString()));
        System.out.println();

        Collections.sort(animalArrayList, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        animalArrayList.forEach(a -> System.out.println(a.toString()));
        System.out.println();

        Collections.sort(animalArrayList, (o1, o2) -> o1.animalMovement().compareToIgnoreCase(o2.animalMovement()));

        animalArrayList.forEach(a -> System.out.println(a.animalMovement()));
        System.out.println();

        animalArrayList.forEach(a -> {if (a.animalBreathing().equals("lungs: " + a.getName())) {
            System.out.println(a.animalBreathing());
        }});
        System.out.println();

        animalArrayList.forEach(a -> {if (a.animalBreathing().equals("lungs: " + a.getName()) && a.getYearDiscovered() == 1758) {
            System.out.println(a.animalBreathing());
        }});
        System.out.println();

        animalArrayList.forEach(a -> {if (a.animalBreathing().equals("lungs: " + a.getName()) && a.animalReproduction().equals("eggs: " + a.getName())) {
            System.out.println(a.animalBreathing());
        }});
        System.out.println();

        Collections.sort(animalArrayList, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        animalArrayList.forEach(a -> {if (a.getYearDiscovered() == 1758) {
            System.out.println(a.toString());
        }});
        System.out.println();

        animalArrayList.forEach(a -> {
            if (a.animalMovement().equals("walks: " + a.getName())) {
                System.out.println(a.toString());
            }});




    }
}
