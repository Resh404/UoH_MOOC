import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.nio.file.Path;

//Exercises from Java Programming I part 5 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class javaPart5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
/*
        //Exercise 1
        Timer timerEx1 = new Timer();

        while (true) {
            System.out.println(timerEx1);
            timerEx1.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
*/
        //Exercise 2
        System.out.println("\nExercise 2");
        BookV2 bookEx2 = new BookV2("J. K. Rowling",
                "Harry Potter and the Sorcerer's Stone", 223);

        System.out.println(bookEx2);

        //Exercise 3
        System.out.println("\nExercise 3");
        Cube oSheaJackson = new Cube(4);
        System.out.println(oSheaJackson.volume());
        System.out.println(oSheaJackson);

        System.out.println();

        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);

        //Exercise 4
        System.out.println("\nExercise 4");
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }

        //Exercise 4
        System.out.println("\nExercise 4");
        ProductV2 tapeMeasure = new ProductV2("Tape measure");
        ProductV2 plaster = new ProductV2("Plaster", "home improvement section");
        ProductV2 tyre = new ProductV2("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);

        //Exercise 5
        System.out.println("\nExercise 5");
        Counter counterEx5 = new Counter();
/*
        //Exercise 6
        System.out.println("\nExercise 6");
        ProductV2 test = new ProductV2("abb", 2);
        test = null;
        test.incWeight();
*/ /*
        //Exercise 7
        System.out.println("\nExercise 7");
        HealthStation childrensHospital = new HealthStation();

        PersonV2 ethan = new PersonV2("Ethan", 1, 110, 7);
        PersonV2 peter = new PersonV2("Peter", 33, 176, 85);

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);

        System.out.println("");

        System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

        System.out.println("\n4 weighings performed from before.");
        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        //Exercise 8
        System.out.println("\nExercise 8");
        PaymentCardV2 petesCard = new PaymentCardV2(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        //Exercise 9
        System.out.println("\nExercise 9");
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);

//##############################################################################################
        PaymentTerminal unicafeExactum2 = new PaymentTerminal();
        double change2 = unicafeExactum2.eatAffordably(10);
        System.out.println("remaining change: " + change2);

        PaymentCardV2 annesCard = new PaymentCardV2(7);

        boolean wasSuccessful2 = unicafeExactum2.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);
        wasSuccessful2 = unicafeExactum2.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);
        wasSuccessful2 = unicafeExactum2.eatAffordably(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);

        System.out.println(unicafeExactum2);

//##############################################################################################
        PaymentTerminal unicafeExactum3 = new PaymentTerminal();
        System.out.println(unicafeExactum3);

        PaymentCardV2 annesCard2 = new PaymentCardV2(2);

        System.out.println("amount of money on the card is " + annesCard2.balance() + " euros");

        boolean wasSuccessful3 = unicafeExactum3.eatHeartily(annesCard2);
        System.out.println("there was enough money: " + wasSuccessful3);

        unicafeExactum3.addMoneyToCard(annesCard2, 100);

        wasSuccessful3 = unicafeExactum3.eatHeartily(annesCard2);
        System.out.println("there was enough money: " + wasSuccessful3);

        System.out.println("amount of money on the card is " + annesCard2.balance() + " euros");

        System.out.println(unicafeExactum3);

        //Exercise 10
        System.out.println("\nExercise 10");
        Pet lucy = new Pet("Lucy", "golden retriever");
        PersonV2 leo = new PersonV2("Leo", lucy);

        System.out.println(leo);

        //Exercise 11
        System.out.println("\nExercise 11");
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true

        //Exercise 12
        System.out.println("\nExercise 12");
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }

        //Exercise 13
        System.out.println("\nExercise 13");
        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        PersonV2 leo2 = new PersonV2("Leo", date, 62, 9);
        PersonV2 lily = new PersonV2("Lily", date2, 65, 8);

        if (leo2.equals(lily)) { //false
            System.out.println("Is this quite correct?");
        }

        PersonV2 leoWithDifferentWeight = new PersonV2("Leo", date, 62, 10);

        if (leo2.equals(leoWithDifferentWeight)) { //false
            System.out.println("Is this quite correct?");
        }

        //Exercise 14
        System.out.println("\nExercise 14");
        ArrayList<Book> booksEx14 = new ArrayList<>();
        String nameEx14 = "";
        int pupliYearEx14 = 0, bookCount = 0;

        while (true){
            System.out.println("Name (empty will stop): ");
            nameEx14 = scanner.nextLine();

            if (nameEx14.isEmpty()){
                System.out.println("Thank you! Books added: " + bookCount);
                break;
            }

            System.out.println("Publication year:");
            pupliYearEx14 = Integer.parseInt(scanner.nextLine());

            Book bookCheckEx14 = new Book(nameEx14, pupliYearEx14);
            boolean bookOnShelfEx14 = false;

            for (int i = 0; i < booksEx14.size(); i++){
                if (booksEx14.get(i).equals(bookCheckEx14)){
                    System.out.println("The book is already on the list. Let's not add the same book again.");
                    bookOnShelfEx14 = true;
                }
            }
            if (!bookOnShelfEx14){
                bookCount++;
                booksEx14.add(bookCheckEx14);
            }
        }

        //Exercise 15
        System.out.println("\nExercise 15");
        ArrayList<Items> itemListEx15 = new ArrayList<>();
        String nameEx15 = "", idEx15 = "";
        boolean equalsFunction = true;

        while (true){
            System.out.println("Identifier? (empty will stop)");
            idEx15 = scanner.nextLine();

            if (idEx15.isEmpty()){
                System.out.println("==Items==");
                for (int i = 0; i < itemListEx15.size(); i++){
                    System.out.println(itemListEx15.get(i));
                }
                break;
            }

            System.out.println("Name? (empty will stop)");
            nameEx15 = scanner.nextLine();

            if (nameEx15.isEmpty()){
                System.out.println("==Items==");
                for (int i = 0; i < itemListEx15.size(); i++){
                    System.out.println(itemListEx15.get(i));
                }
                break;
            }

            Items itemCheckEx15 = new Items(idEx15, nameEx15);

            if (equalsFunction){
                boolean itemOnShelfEx15 = false;

                for (int i = 0; i < itemListEx15.size(); i++){
                    if (itemListEx15.get(i).equals(itemCheckEx15)){
                        System.out.println("The item is already on the list.");
                        itemOnShelfEx15 = true;
                    }
                }

                if (!itemOnShelfEx15){
                    itemListEx15.add(itemCheckEx15);
                }
            }

            if (!equalsFunction){
                itemListEx15.add(itemCheckEx15);
            }
        }

        //Exercise 16
        System.out.println("\nExercise 16");
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println("Try " + date.afterNumberOfDays(790));
*/
        //Exercise 17
        System.out.println("\nExercise 17");
/*        //Part 1
        Money a = new Money(10,0);
        Money b = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
//  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e
*/
/*
        //Part 2
        Money a = new Money(10, 0);
        Money b = new Money(3, 0);
        Money c = new Money(5, 0);

        System.out.println(a.lessThan(b));  // false
        System.out.println(b.lessThan(c));  // true
*/
        //Part 3
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}