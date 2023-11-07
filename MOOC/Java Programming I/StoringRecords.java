import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {
    public ArrayList<Person> readRecordsFromFile(String file){
        ArrayList<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namListEx30 = new ArrayList<>();
        ArrayList<Integer> ageListEx30 = new ArrayList<>();

        try (Scanner scannerEx30 = new Scanner(Paths.get("MOOC/Java Programming I/" + file))){
            while (scannerEx30.hasNextLine()){
                String rowEx30 = scannerEx30.nextLine();
                String[] tempCon = rowEx30.split(",");
                namListEx30.add((tempCon[0]));
                ageListEx30.add(Integer.parseInt(tempCon[1]));
            }

            for (int i = 0; i < namListEx30.size(); i++) {
                people.add(new Person(namListEx30.get(i),ageListEx30.get(i)));
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }

        return people;
    }
}
