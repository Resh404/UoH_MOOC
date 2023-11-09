import java.util.ArrayList;
import java.util.Scanner;

//Exercises from Java Programming I part 6 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class javaPart6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("\nExercise 1");
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();

        //Exercise 2
        System.out.println("\nExercise 2");
        Stacked stacking = new Stacked();
        stacking.add("1");
        stacking.add("2");
        stacking.add("3");
        stacking.add("4");
        stacking.add("5");

        while (!stacking.isEmpty()) {
            System.out.println(stacking.take());
        }

        //Exercise 3
        System.out.println("\nExercise 3");
        MessagingService msgSer = new MessagingService();

        //Exercise 4
        System.out.println("\nExercise 4");
        SimpleCollection simCol = new SimpleCollection("alphabet");
        System.out.println(simCol);

        System.out.println();

        simCol.add("a");
        System.out.println(simCol);

        System.out.println();

        simCol.add("b");
        System.out.println(simCol);

        System.out.println();

        simCol.add("c");
        System.out.println(simCol);

        //Exercise 5
        System.out.println("\nExercise 5");
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());

        //Exercise 6
        System.out.println("\nExercise 6");
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());

        //Exercise 7
        System.out.println("\nExercise 7");
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new PersonV2("Lea", 183));
        room.add(new PersonV2("Kenya", 182));
        room.add(new PersonV2("Auli", 186));
        room.add(new PersonV2("Nina", 172));
        room.add(new PersonV2("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (PersonV2 person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.shortest());
        System.out.println("");
        for (PersonV2 person : room.getPersons()) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (PersonV2 person : room.getPersons()) {
            System.out.println(person);
        }

        //Exercise 8
        System.out.println("\nExercise 8");


    }
}