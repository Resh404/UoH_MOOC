import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList bigList;
    private Scanner scanner;
    private GradeRegister grades;
    private JokeManager joke;

    //Constructors
    public UserInterface(TodoList bigList, Scanner scanner){
        this.bigList = bigList;
        this.scanner = scanner;
    }

    public UserInterface(Scanner scanner, GradeRegister grades){
        this.scanner = scanner;
        this.grades = grades;
    }

    public UserInterface(Scanner scanner, JokeManager joke){
        this.scanner = scanner;
        this.joke = joke;
    }

    //Methods
    public void start(){
        System.out.println("Write \"stop\" to quit.");
        CommandStarter();
    }

    public void JokeStarter(){
        System.out.println("Write \"X\" to quit.");

        while (true){
            System.out.println("Write 1 add joke, 2 to get random joke, 3 to print all jokes.");
            String input = scanner.nextLine().toLowerCase();

            switch (input){
                case "x":
                    return;
                case "1":
                    System.out.println("Add a joke");
                    input = scanner.nextLine();
                    this.joke.addJoke(input);
                    break;
                case "2":
                    this.joke.drawJoke();
                    break;
                case "3":
                    this.joke.printJokes();
            }
        }
    }

    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = grades.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public void gradeStarter(){
        String input;
        int inputPoints;
        System.out.println("Press Enter to quit.");

        while (true){
            System.out.println("Points: ");
            input = scanner.nextLine();

            if (input.isEmpty()){
                this.printGradeDistribution();
                System.out.println("The average of points: " + this.grades.averageOfPoints());
                System.out.println("The average of grades: " + this.grades.averageOfGrades());
                return;
            }

            inputPoints = Integer.parseInt(input);
            this.grades.addGradeBasedOnPoints(inputPoints);
        }
    }

    public void CommandStarter(){
        String input;
        int taskRemover;

        while (true){
            System.out.println("Command: ");
            input = scanner.nextLine();

            switch (input){
                case "stop":
                    return;
                case "add":
                    System.out.println("Next task to add: ");
                    input = scanner.nextLine();
                    this.bigList.add(input);
                    break;
                case "list":
                    this.bigList.print();
                    break;
                case "remove":
                    System.out.println("Input the number of the task to be removed: ");
                    taskRemover = Integer.parseInt(scanner.nextLine());
                    bigList.remove(taskRemover);
                    break;
            }
        }
    }
}
