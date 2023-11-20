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
        Item bookV2 = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        System.out.println("The book's name: " + bookV2.getName());
        System.out.println("The book's weight: " + bookV2.getWeight());

        System.out.println("Book: " + bookV2);
        System.out.println("Phone: " + phone);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(bookV2);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        //Suitcase suitcase = new Suitcase(10);
        //suitcase.addItem(book);
        //suitcase.addItem(phone);
        //suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        Item heaviest = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(bookV2);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();

        //Exercise 9
        System.out.println("\nExercise 9");
        SimpleDictionary diction = new SimpleDictionary();
        diction.add("one", "yksi");
        diction.add("two", "kaksi");

        System.out.println(diction.translate("one"));
        System.out.println(diction.translate("two"));
        System.out.println(diction.translate("three"));

        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI textUI = new TextUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike"));

        //Exercise 10
        System.out.println("\nExercise 10");
        TodoList list = new TodoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        System.out.println();
        list.print();

        //Exercise 11
        System.out.println("\nExercise 11");
        TodoList doIt = new TodoList();
        UserInterface ui = new UserInterface(doIt, scanner);
        ui.start();

        //Exercise 12
        System.out.println("\nExercise 12");
        GradeRegister register = new GradeRegister();
        register.addGradeBasedOnPoints(93);
        register.addGradeBasedOnPoints(91);
        register.addGradeBasedOnPoints(92);
        register.addGradeBasedOnPoints(88);

        System.out.println(register.averageOfGrades());

        GradeRegister register2 = new GradeRegister();
        register2.addGradeBasedOnPoints(93);
        register2.addGradeBasedOnPoints(91);
        register2.addGradeBasedOnPoints(92);

        System.out.println(register2.averageOfPoints());

        GradeRegister register3 = new GradeRegister();
        UserInterface uiGrades = new UserInterface(scanner, register3);
        uiGrades.gradeStarter();

        //Exercise 13
        System.out.println("\nExercise 13");
        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println("Drawing jokes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJoke());
        }

        System.out.println("");
        System.out.println("Printing jokes:");
        manager.printJokes();

        JokeManager jokeMan = new JokeManager();
        UserInterface JokeUi = new UserInterface(scanner, jokeMan);

        JokeUi.JokeStarter();

        //Exercise 14
        System.out.println("\nExercise 14"); //???


    }
}