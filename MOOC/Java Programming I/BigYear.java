import javax.sound.midi.Soundbank;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class BigYear {
    private ArrayList<String> name;
    private ArrayList<String> latinNam;
    private ArrayList<String> pipsObser;
    private Scanner scanner;

    //Constructors
    public BigYear(){
        this.name = new ArrayList<>();
        this.latinNam = new ArrayList<>();
        this.pipsObser = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    //Methods
    public void birdStarter(){
        System.out.println("Commands:\n" +
                "Add - adds a bird\n" +
                "Observation - adds an observation\n" +
                "All - prints all birds\n" +
                "One - prints one bird\n" +
                "Quit - ends the program");

        while (true){
            System.out.print("Command?");
            String input = scanner.nextLine().toLowerCase();

            switch (input){
                case "add":
                    add();
                    break;

                case "observation":
                    System.out.println("Bird observed?");
                    input = scanner.nextLine();
                    obser(input);
                    break;

                case "all":
                    allPips();
                    break;

                case "one":
                    onePip();
                    break;

                case "quit":
                    return;
            }
        }
    }

    public void add(){
        String namIn, latNam;

        System.out.print("Name: ");
        namIn = scanner.nextLine();

        System.out.print("Name in Latin: ");
        latNam = scanner.nextLine();

        name.add(namIn);
        latinNam.add(latNam);
    }

    public void obser(String bird){
    String birdType;

        try (Scanner bipFinder = new Scanner(Paths.get("MOOC/Java Programming I/birds.txt"))){
            while (bipFinder.hasNextLine()){
                birdType = bipFinder.nextLine();

                if (birdType.equals(bird)){
                    pipsObser.add(bird);
                    return;
                }
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
            return;
        }

        System.out.println("Not a bird!");
    }

    public void allPips(){
        for (int i = 0; i < name.size(); i++){
            int pipCounter = 0;

            for (int j = 0; j < pipsObser.size(); j++){
                if (name.get(i).equals(pipsObser.get(j))){
                    pipCounter++;
                }
            }

            System.out.println(name.get(i) + " (" + latinNam.get(i) + "): " + pipCounter +  " observations");
        }
    }

    public void onePip() {
        System.out.println("bird?");
        String thePip = scanner.nextLine();
        int pipCounter = 0, pipFound = 0;

        for (int i = 0; i < name.size(); i++) {
            if (thePip.equals(name.get(i))) {
                pipFound = i;
            }

            if (thePip.equals(pipsObser.get(i))) {
                pipCounter++;
            }
        }

        System.out.println(name.get(pipFound) + " (" + latinNam.get(pipFound) + "): " + pipCounter + " observations");
    }
}
