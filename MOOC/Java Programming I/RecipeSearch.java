import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    private String path;
    private ArrayList<String> repNames;
    private ArrayList<String> prepTime;
    Scanner scanner;

    //Constructors
    public RecipeSearch(){
        this.path = "";
        this.scanner = new Scanner(System.in);
        this.repNames = new ArrayList<>();
        this.prepTime = new ArrayList<>();
    }

    //Methods
    public void recipeStarter(){
        recipeList();

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");

        while (true){
            String input = scanner.nextLine();

            switch (input){
                case "list":
                    for (int i = 0; i < this.repNames.size(); i++){
                        System.out.println(this.repNames.get(i) + ", cooking time: " + this.prepTime.get(i));
                    }
                    break;

                case "find name":
                    int found = findName();
                    if (found == -1){
                        System.out.println("not found");
                    } else {
                        System.out.println(this.repNames.get(found) + ", cooking time: " + this.prepTime.get(found));
                    }
                    break;

                case "find cooking time":
                    ArrayList<Integer> cookTim= cookTime();
                    System.out.println("Recipes:");
                    for (int i = 0; i < cookTim.size(); i++){
                        System.out.println(this.repNames.get(cookTim.get(i)) +
                        ", cooking time: " + this.prepTime.get(cookTim.get(i)));
                    }
                    break;
                case "find ingredient":
                    ArrayList<Integer> ingRep = findIng();
                    System.out.println("Recipes:");
                    for (int i = 0; i < ingRep.size(); i++){
                        System.out.println(this.repNames.get(ingRep.get(i)) +
                                ", cooking time: " + this.prepTime.get(ingRep.get(i)));
                    }
                    break;

                case "stop":
                    return;
            }
        }
    }

    public void recipeList(){
        System.out.print("Path of file to read: ");
        String input = scanner.nextLine();

        String name, cookTime;
        this.path = input;

        try {
            Scanner fileReader = new Scanner(Paths.get(this.path));

            while (fileReader.hasNextLine()){
                name = fileReader.nextLine();
                cookTime = fileReader.nextLine();

                this.repNames.add(name);
                this.prepTime.add(cookTime);

                while (!fileReader.nextLine().isEmpty()){}
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }
    }

    public int findName(){
        System.out.println("Searched word:");
        String input = scanner.nextLine();

        for (int i = 0; i < repNames.size(); i++){
            if (repNames.get(i).contains(input)){
                return i;
            }
        }

        return -1;
    }

    public ArrayList<Integer> cookTime(){
        ArrayList<Integer> preps = new ArrayList<>();
        System.out.println("Max cooking time:");
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < repNames.size(); i++){
            if (Integer.parseInt(prepTime.get(i)) <= input){
                preps.add(i);
            }
        }

        return preps;
    }

    public ArrayList<Integer> findIng(){
        System.out.println("Ingredient:");
        String input = scanner.nextLine(), looking;
        ArrayList<Integer> ingRep = new ArrayList<>();
        int i = 0;

        try (Scanner reFile = new Scanner(Paths.get(this.path))){
            while (reFile.hasNextLine()){
                looking = reFile.nextLine();

                if (looking.equals(input)){
                    ingRep.add(i);
                }

                if (looking.isEmpty()){
                    i++;
                }
            }
        } catch (Exception e){
            System.out.println("Reading the file " + e.getMessage() + " failed");
        }

        return ingRep;
    }
}
