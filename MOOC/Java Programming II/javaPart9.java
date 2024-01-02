import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Exercises from Java Programming II part 9 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class JavaPart9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("\nExercise 1");
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
        System.out.println();

        C cc = new C();

        cc.a();
        cc.b();
        cc.c();

        //Exercise 2
        System.out.println("\nExercise 2");
/*        PersonV3 ada = new PersonV3("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        PersonV3 esko = new PersonV3("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        System.out.println();

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
        System.out.println();

        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie); */

        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
        System.out.println();

        ArrayList<PersonV3> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        PersonV3.printPersons(persons);

        //Exercise 3
        System.out.println("\nExercise 3");
/*        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        System.out.println(juice);           // balance = 988.7, space left 11.3 */

/*        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955
        System.out.println(); */

        // the usual:
/*        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]
        // so we only get the initial state of the history set by the constructor... */

        // the usual:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // and now we have the history:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]
        System.out.println();

        juice.printAnalysis();

        //Exercise 4
        System.out.println("\nExercise 4");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new ItemV3("Saludo", 5));
        coffeeBox.add(new ItemV3("Pirkka", 5));
        coffeeBox.add(new ItemV3("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new ItemV3("Saludo")));
        System.out.println(coffeeBox.isInBox(new ItemV3("Pirkka")));
        System.out.println(coffeeBox.isInBox(new ItemV3("Kopi Luwak")));
        System.out.println();

        OneItemBox box = new OneItemBox();
        box.add(new ItemV3("Saludo", 5));
        box.add(new ItemV3("Pirkka", 5));

        System.out.println(box.isInBox(new ItemV3("Saludo")));
        System.out.println(box.isInBox(new ItemV3("Pirkka")));

    }
}