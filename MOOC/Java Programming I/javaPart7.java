import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Exercises from Java Programming I part 6 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class JavaPart7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("\nExercise 1");
        LiquidContainers liquid = new LiquidContainers();
        liquid.main();

        //Exercise 2
        System.out.println("\nExercise 2");
        Container container = new Container();
        System.out.println(container);

        container.add(50);
        System.out.println(container);
        System.out.println(container.contains());

        container.remove(60);
        System.out.println(container);

        container.add(200);
        System.out.println(container);

        LiquidContainers2 liqd = new LiquidContainers2();
        liqd.main();

        //Exercise 3
        System.out.println("\nExercise 3");
        int[] numbers = {6, 5, 8, 7, 11};
        //int[] numbers = {-1, 6, 9, 8, 12};
        //int[] numbers = {3, 2, 5, 4, 8};
        //int[] numbers = {8, 3, 7, 9, 1, 2, 4};

        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));

        System.out.println(Arrays.toString(numbers));
        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);

        //Exercise 4
        System.out.println("\nExercise 4");
        String[] aStr = {"abawfa","wadwb", "awdawd"};

        //MainProgram.sortArr(arr);
        MainProgram.sortStr(aStr);
        //MainProgram.sortIntegers(intList);
        //MainProgram.sortStrings(strList);

        System.out.println(Arrays.toString(aStr));

        //Exercise 5
        System.out.println("\nExercise 5");
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(-22,"a"));
        books.add(new Book(-9,"b"));
        books.add(new Book(-3,"c"));
        books.add(new Book(0,"d"));
        books.add(new Book(1,"e"));
        books.add(new Book(5,"f"));
        books.add(new Book(7,"g"));
        books.add(new Book(9,"h"));
        books.add(new Book(11,"i"));
        books.add(new Book(16,"j"));
        books.add(new Book(22,"k"));
        books.add(new Book(31,"g"));
        books.add(new Book(44,"h"));
        books.add(new Book(45,"i"));
        books.add(new Book(62,"j"));
        books.add(new Book(71,"k"));

        int myID = SearchAlgorithms.linearSearch(books,7);
        System.out.println(myID);

        myID = SearchAlgorithms.binarySearch(books,71);
        System.out.println(myID);

        //Exercise 6
        System.out.println("\nExercise 6");
        GradeStatistics grading = new GradeStatistics();
        grading.startGrading();

        //Exercise 7
        System.out.println("\nExercise 7");
        //MOOC/Java Programming I/recipes.txt
        RecipeSearch rep = new RecipeSearch();
        rep.recipeStarter();

        //Exercise 8
        System.out.println("\nExercise 8");
        BigYear pips = new BigYear();
        pips.birdStarter();



    }
}
