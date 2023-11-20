import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> pointsExam;

    //Constructors
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.pointsExam = new ArrayList<>();
    }

    //Methods
    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.pointsExam.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received: this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades(){
        double sum = 0, counter = 0;

        if (grades.isEmpty()){
            return -1;
        }

        for (int i = 0; i < grades.size(); i++){
            sum += grades.get(i);
            counter++;
        }

        return sum/counter;
    }

    public double averageOfPoints(){
        double sum = 0, counter = 0;

        if (pointsExam.isEmpty()){
            return -1;
        }

        for (int i = 0; i < pointsExam.size(); i++){
            sum += pointsExam.get(i);
            counter++;
        }

        return sum/counter;
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}