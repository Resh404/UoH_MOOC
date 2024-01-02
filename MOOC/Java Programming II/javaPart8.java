import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//Exercises from Java Programming II part 8 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class JavaPart8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("\nExercise 1");
        HashMap<String, String> mapNam = new HashMap<>();
        mapNam.put("matthew", "matt");
        mapNam.put("michael", "mix");
        mapNam.put("arthur", "artie");

        System.out.println(mapNam.get("matthew"));

        //Exercise 2
        System.out.println("\nExercise 2");
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part : text.split(" ")) {
            if (abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            }

            System.out.print(part);
            System.out.print(" ");
        }

        System.out.println();

        //Exercise 3
        System.out.println("\nExercise 3");
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".e");

        //Exercise 4
        System.out.println("\nExercise 4");
        HashMap<String, BookV3> hashmap2 = new HashMap<>();
        hashmap2.put("sense", new BookV3("Sense and Sensibility", 1811, "..."));
        hashmap2.put("prejudice", new BookV3("Pride and prejudice", 1813, "...."));

        Program.printValues(hashmap2);
        System.out.println("---");
        Program.printValueIfNameContains(hashmap2, "prejud");

        //Exercise 5
        System.out.println("\nExercise 5");
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        //Exercise 6
        System.out.println("\nExercise 6");
        SimpleDateV3 d = new SimpleDateV3(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDateV3(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDateV3(1, 2, 2000)));

        //Exercise 7
        System.out.println("\nExercise 7");
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        finnishPlates.add(li1);
        finnishPlates.add(li2);

        LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        if (!finnishPlates.contains(newLi)) {
            finnishPlates.add(newLi);
        }
        System.out.println("finnish: " + finnishPlates);
        // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        HashMap<LicensePlate, String> owners = new HashMap<>();
        owners.put(li1, "Arto");
        owners.put(li3, "Jürgen");

        System.out.println("owners:");
        System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));

        System.out.println();
        VehicleRegistry vhR = new VehicleRegistry();
        System.out.println(vhR.add(li1, "Arto"));
        System.out.println(vhR.add(li2, "Arto"));
        System.out.println(vhR.add(li3, "Jürgen"));
        System.out.println(vhR.add(li2, "Jürgen"));
        System.out.println();

        System.out.println(vhR.get(li1));
        System.out.println(vhR.remove(li1));
        System.out.println();

        vhR.printLicensePlates();
        vhR.printOwners();

        //Exercise 8
        System.out.println("\nExercise 8");
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));

        //Exercise 9
        System.out.println("\nExercise 9");
        StorageFacility facility = new StorageFacility();
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        System.out.println(facility.contents("a14"));
        System.out.println(facility.contents("f156"));
        System.out.println();

        facility.remove("f156", "rollerblades");

        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());
    }
}
