import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.nio.file.Path;

//Exercises from Java Programming I part 4 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class javaPart5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        //Exercise 1
        Account myAcc = new Account("myAcc",100);
        myAcc.deposit(20);
        System.out.println("My account balanceEx1: " + myAcc.balance()+"\n");

        //Exercise 2
        Account matAcc = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        matAcc.withdraw(100);
        myAccount.deposit(100);

        System.out.println(matAcc);
        System.out.println(myAccount);

        //Exercise 3
        System.out.println("\n");
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();

        //Exercise 4
        System.out.println("\n");
        Door alexander = new Door();

        alexander.knock();
        alexander.knock();

        //Exercise 5
        System.out.println("\n");
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();

        //Exercise 6
        System.out.println("\n");
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        //Exercise 7
        System.out.println("\n");
        DecreasingCounter counter2 = new DecreasingCounter(2);

        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        //Exercise 8
        System.out.println("\n");
        DecreasingCounter counter3 = new DecreasingCounter(100);

        counter3.printValue();

        counter3.reset();
        counter3.printValue();

        counter3.decrement();
        counter3.printValue();

        //Exercise 9
        System.out.println("\n");
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        mortgage.printBalance();

        //Exercise 10
        System.out.println("\n");
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");

        //Exercise 11
        System.out.println("\n");
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }

        //Exercise 12
        System.out.println("\n");
        Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());

        //Exercise 13
        System.out.println("\n");
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);

        //Exercise 14
        System.out.println("\n");
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));

        //Exercise 14
        System.out.println("\n");
        Statistics statistics = new Statistics();
        statistics.addNum(3);
        statistics.addNum(5);
        statistics.addNum(1);
        statistics.addNum(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.getSum());
        System.out.println("Average: " + statistics.getAvg());

        //Exercise 14
        System.out.println("\n");
        int tempNum = 0;
        Statistics newStat = new Statistics();
        System.out.println("Enter numbers: ");

        while (true){
            tempNum = Integer.parseInt(scanner.nextLine());

            if (tempNum == -1){
                System.out.println("Sum: " + newStat.getSum());
                break;
            } else {
                newStat.addNum(tempNum);
            }
        }

        //Exercise 15
        System.out.println("\n");
        int tempNum2 = 0, evenSum = 0, oddSum = 0;
        Statistics newStat2 = new Statistics();
        System.out.println("Enter numbers: ");

        while (true){
            tempNum2 = Integer.parseInt(scanner.nextLine());

            if (tempNum2 == -1){
                System.out.println("Sum: " + newStat2.getSum());
                System.out.println("Sum of even numbers: " + evenSum);
                System.out.println("Sum of odd numbers: " + oddSum);
                break;
            }
            newStat2.addNum(tempNum2);

            if (tempNum2%2 == 0){
                evenSum += tempNum2;
            } else if (tempNum2%2 != 0) {
                oddSum += tempNum2;
            }
        }

        //Exercise 16
        System.out.println("\n");
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);
        //##################################################
        PaymentCard card2 = new PaymentCard(5);
        System.out.println(card2);
        card2.eatHeartily();
        card2.eatAffordably();
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);
        //#####################################################
        card.addMoney(15);
        System.out.println(card);

        card.addMoney(10);
        System.out.println(card);

        card.addMoney(200);
        System.out.println(card);

        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
        //####################################################
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul's card: " + paulCard);
        System.out.println("Matt's card: " + mattCard);
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        System.out.println("Paul's card: " + paulCard);
        System.out.println("Matt's card: " + mattCard);
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        System.out.println("Paul's card: " + paulCard);
        System.out.println("Matt's card: " + mattCard);

        //Exercise 17
        System.out.println("\n");
        System.out.println("Name of item? ");
        ArrayList<Items> itemList = new ArrayList<>();

        while (true){
            String itemNam = scanner.nextLine();

            if (itemNam.isEmpty()){
                for (Items items : itemList) {
                    System.out.println(items);
                }
                break;
            }
            itemList.add(new Items(itemNam));
        }

        //Exercise 18
        System.out.println("\n");
        ArrayList<PersonalInformationCollection> personList = new ArrayList<>();

        while (true){
            System.out.println("First name: ");
            String firNam = scanner.nextLine();

            if (firNam.isEmpty()){
                for (PersonalInformationCollection persons : personList){
                    System.out.println(persons);
                }
                break;
            }

            System.out.println("Last name: ");
            String lasNam = scanner.nextLine();
            System.out.println("Identification number: ");
            int id = Integer.parseInt(scanner.nextLine());
            personList.add(new PersonalInformationCollection(firNam, lasNam, id));
        }

        //Exercise 19
        System.out.println("\n");
        ArrayList<TelevisionProgram> teleList = new ArrayList<>();

        while (true){
            System.out.println("Name: ");
            String movieName = scanner.nextLine();

            if (movieName.isEmpty()){
                System.out.println("Duration: ");
                int maxDuration = Integer.parseInt(scanner.nextLine());

                for (TelevisionProgram tele : teleList){
                    if (tele.getDura() <= maxDuration){
                        System.out.println(tele);
                    }
                }
                break;
            }

            System.out.println("Duration: ");
            int movieDuration = Integer.parseInt(scanner.nextLine());
            teleList.add(new TelevisionProgram(movieName, movieDuration));
        }

        //Exercise 20
        System.out.println("\n");
        ArrayList<Book> bookList = new ArrayList<>();

        while (true){
            System.out.println("Title: ");
            String bookName = scanner.nextLine();

            if (bookName.isEmpty()){
                System.out.println("What information will be printed? ");
                String lookUp = scanner.nextLine();

                for (Book bok : bookList){
                    if (lookUp.equals("everything")){
                        System.out.println(bok);
                    } else if (lookUp.equals("name")) {
                        System.out.println(bok.getName());
                    }
                }
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int pupYear = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(bookName, pages, pupYear));
        }

        //Exercise 21
        System.out.println("\n");
        System.out.println("Put in a string");
        int counter4 = 0;
        while (true){
            String aStr = scanner.nextLine();

            if (aStr.equals("end")){
                System.out.println(counter4);
                break;
            }
            counter4++;
        }

        //Exercise 22
        System.out.println("\n");
        System.out.println("Put in a number");
        int cube = 0;

        while (true){
            String myStr = scanner.nextLine();

            if (myStr.equals("end")){
                break;
            }

            cube = Integer.parseInt(myStr);
            System.out.println((cube * cube * cube));
        }

        //Exercise 23
        //files.txt

        //Exercise 24
        try (Scanner Ex24Scanner = new Scanner(Paths.get("MOOC/Java Programming I/data.txt"))){
            // we read the file until all lines have been read
            while (Ex24Scanner.hasNextLine()) {
                // we read one line
                String row = Ex24Scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Exercise 25
        System.out.println("\n");
        System.out.println("Which file should have its contents printed?");
        String readFile = scanner.nextLine();
        try (Scanner scannerEx25 = new Scanner(Paths.get("MOOC/Java Programming I/" + readFile))){
        while (scannerEx25.hasNextLine()){
            String row2 = scannerEx25.nextLine();
            System.out.println(row2);
        }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        //Exercise 26
        System.out.println("\n");
        ArrayList<String> guests = new ArrayList<>();
        System.out.println("Name of the file: ");
        String chooseFile = scanner.nextLine();

        try (Scanner scannerEx26 = new Scanner(Paths.get("MOOC/Java Programming I/" + chooseFile))){
            while (scannerEx26.hasNextLine()){
                String row3 = scannerEx26.nextLine();
                guests.add(row3);
            }

            System.out.println("Enter names, an empty line quits.");
            while (true){
                String checkGuest = scanner.nextLine();

                if (checkGuest.isEmpty()){
                    break;
                }
                boolean isHere = false;
                for (int i = 0; i < guests.size(); i++){
                    if (guests.get(i).equals(checkGuest)){
                        System.out.println("The name is on the list.");
                        isHere = true;
                    }
                }

                if (!isHere){
                    System.out.println("The name is not on the list.");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        //Exercise 27
        System.out.println("\n");
        ArrayList<String> namListEx27 = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileNamEx27 = scanner.nextLine();

        try (Scanner scannerEx27 = new Scanner(Paths.get("MOOC/Java Programming I/" + fileNamEx27))){
            while (scannerEx27.hasNextLine()){
                String rowEx27 = scannerEx27.nextLine();
                namListEx27.add((rowEx27));
            }

            while (true){
                System.out.println("Search for or press enter to quit: ");
                String lookForEx27 = scanner.nextLine();

                if (lookForEx27.isEmpty()){
                    break;
                }

                boolean lookingEx27 = false;
                for (int i = 0; i < namListEx27.size(); i++){
                    if (namListEx27.get(i).equals(lookForEx27)){
                        System.out.println("Found!");
                        lookingEx27 = true;
                    }
                }

                if (!lookingEx27){
                    System.out.println("Not found.");
                }
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }

        //Exercise 28
        System.out.println("\n");
        ArrayList<Integer> numListEx28 = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileNamEx28 = scanner.nextLine();
        System.out.println("Lower bound: ");
        int lowLEx28 = Integer.parseInt(scanner.nextLine());
        System.out.println("Upper bound: ");
        int upLEx28 = Integer.parseInt(scanner.nextLine());
        int counterEx28 = 0;

        try (Scanner scannerEx28 = new Scanner(Paths.get("MOOC/Java Programming I/" + fileNamEx28))){
            while (scannerEx28.hasNextLine()){
                int rowEx28 = Integer.parseInt(scannerEx28.nextLine());
                numListEx28.add((rowEx28));
            }

            for (int i = 0; i < numListEx28.size(); i++) {
                if (numListEx28.get(i) >= lowLEx28 && numListEx28.get(i) <= upLEx28) {
                    counterEx28++;
                }
            }
            System.out.println("Numbers: " + counterEx28);

        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }

        //Exercise 29
        System.out.println("\n");
        ArrayList<String> namListEx29 = new ArrayList<>();
        ArrayList<Integer> ageListEx29 = new ArrayList<>();
        System.out.println("Name of the file: ");
        String fileNamEx29 = scanner.nextLine();

        try (Scanner scannerEx29 = new Scanner(Paths.get("MOOC/Java Programming I/" + fileNamEx29))){
            while (scannerEx29.hasNextLine()){
                String rowEx29 = scannerEx29.nextLine();
                String[] tempCon = rowEx29.split(",");
                namListEx29.add((tempCon[0]));
                ageListEx29.add(Integer.parseInt(tempCon[1]));
            }

            for (int i = 0; i < namListEx29.size(); i++) {
                String year = "year";
                if (ageListEx29.get(i) > 1){
                    year = "years";
                }
                System.out.println(namListEx29.get(i) + ", age:" + ageListEx29.get(i) + " " + year);
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }

        //Exercise 30
        StoringRecords myRecords = new StoringRecords();
        System.out.println(myRecords.readRecordsFromFile("data.txt"));
*/
        //Exercise 31
        System.out.println("\n");
        int teamCount = 0, W = 0, L = 0;

        ArrayList<String> teamEx31 = new ArrayList<>();
        ArrayList<String> visitingTeamEx31 = new ArrayList<>();
        ArrayList<Integer> teamPointsEx31 = new ArrayList<>();
        ArrayList<Integer> visitingPointsEx31 = new ArrayList<>();

        System.out.println("File: ");
        String fileNamEx31 = scanner.nextLine();
        System.out.println("Team: ");
        String teamNamEx31 = scanner.nextLine();

        try (Scanner scannerEx31 = new Scanner(Paths.get("MOOC/Java Programming I/" + fileNamEx31))){
            while (scannerEx31.hasNextLine()){
                String rowEx31 = scannerEx31.nextLine();
                String[] tempCon = rowEx31.split(",");

                teamEx31.add((tempCon[0]));
                visitingTeamEx31.add(tempCon[1]);
                teamPointsEx31.add(Integer.parseInt(tempCon[2]));
                visitingPointsEx31.add(Integer.parseInt(tempCon[3]));
            }

            for (int i = 0; i < teamEx31.size(); i++) {
                if (teamEx31.get(i).equals(teamNamEx31)) {
                    teamCount++;

                    if (teamPointsEx31.get(i) > visitingPointsEx31.get(i)){
                        W++;
                    } else {
                        L++;
                    }
                }

                if (visitingTeamEx31.get(i).equals(teamNamEx31)){
                    teamCount++;

                    if (teamPointsEx31.get(i) < visitingPointsEx31.get(i)){
                        W++;
                    } else {
                        L++;
                    }
                }
            }

            System.out.println("Games: " + teamCount);
            System.out.println("Wins: " + W);
            System.out.println("Losses " + L);

        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }








    }
}