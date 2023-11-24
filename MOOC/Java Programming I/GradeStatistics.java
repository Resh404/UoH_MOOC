import java.util.ArrayList;
import java.util.Scanner;

public class GradeStatistics {
    private Scanner scanner;
    private ArrayList<Integer> grades;

    //Constructors
    public GradeStatistics(){
        this.scanner = new Scanner(System.in);
        this.grades = new ArrayList<>();
    }
    //Methods
    public void startGrading(){
        System.out.println("Enter points totals, -1 to stops:");
        int avgGrades = 0, avgCounter = 0, avgPassing = 0, passingCounter = 0, allCounter = 0, input;
        double passProcent = 0.0;
        String nullPassing = "";

        while (true){
            input = Integer.parseInt(scanner.nextLine());

            if (input == -1){
                if (avgGrades > 0){
                    avgGrades = avgGrades/avgCounter;
                }

                if (avgPassing > 0){
                    passProcent = 100 * ((double) passingCounter/allCounter);
                    avgPassing = avgPassing/passingCounter;
                    nullPassing = Integer.toString(avgPassing);
                }

                if (avgPassing == 0){
                    nullPassing = "-";
                }

                System.out.println("Point average (all): " + avgGrades);
                System.out.println("Point average (passing): " + nullPassing);
                System.out.println("Pass percentage: " + passProcent);
                stars();
                return;
            }

            if (input > 0){
                avgGrades += input;
                avgCounter++;
            }

            if (input > 50){
                avgPassing += input;
                passingCounter++;
            }

            allCounter++;

            if (input >= 0 && input <= 100){
                this.grades.add(toGrades(input));
            }
        }
    }

    public void stars(){
        int maxGrade = 5;

        for (int i = 0; i < 6; i++){
            System.out.print(maxGrade + ": ");

            for (int j = 0; j < grades.size(); j++){
                if (grades.get(j) == maxGrade){
                    System.out.print("*");
                }
            }
            System.out.println();
            maxGrade = maxGrade -1;
        }
    }
    public int toGrades(int grade){
        if (grade < 50){
            return 0;
        } else if (grade >= 50 && grade < 60) {
            return 1;
        } else if (grade >= 60 && grade < 70) {
            return 2;
        } else if (grade >= 70 && grade < 80) {
            return 3;
        } else if (grade >= 80 && grade < 90) {
            return 4;
        } else if (grade >= 90) {
            return 5;
        }

        return -1;
    }
}
