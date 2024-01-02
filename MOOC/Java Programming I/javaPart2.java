import java.util.Scanner;
//Exercises from Java Programming I part 2 from "More loops" (https://java-programming.mooc.fi/)
public class JavaPart2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("Type a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++ ){
            System.out.println(i);
        }

        //Exercise 2
        System.out.println("Type a number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num2; i <= 100; i++ ){
            System.out.println(i);
        }

        //Exercise 3
        System.out.println("Where to? ");
        int num3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num3; i++ ){
            System.out.println(i);
        }

        //Exercise 4
        System.out.println("Where to? ");
        int num4 = Integer.parseInt(scanner.nextLine());
        System.out.println("Where from? ");
        int num5 = Integer.parseInt(scanner.nextLine());

        for (int i = num5; i <= num4; i++ ){
            if (num4 < num5){
                break;
            } else{
                System.out.println(i);
            }
        }

        //Exercise 5
        System.out.println("Last number? ");
        int num6 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <= num6; i++ ){
            sum += i;
        }
        System.out.println("The sum is: " + sum);

        //Exercise 6
        System.out.println("Last number? ");
        int num7 = Integer.parseInt(scanner.nextLine());
        int tempNum, total = 1;

        for (int i = 1; i <= num7; i++ ){
            if (num7 == 0){
                total = 1;
                break;
            }

            tempNum = i * total;
            total = tempNum;
        }
        System.out.println("Factorial: " + total);

        //Exercise 7
        System.out.println("Giver numbers: ");
        int stop = 0;

        while (stop != -1) {
            stop = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");

        //Exercise 8
        System.out.println("Giver numbers: ");
        int stop2 = 0, sum2 = 0;

        while (stop2 != -1) {
            stop2 = Integer.parseInt(scanner.nextLine());

            if (stop2 != -1) {
                sum2 += stop2;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum2);

        //Exercise 9
        System.out.println("Giver numbers: ");
        int stop3 = 0, sum3 = 0, count = 0;

        while (stop3 != -1) {
            stop3 = Integer.parseInt(scanner.nextLine());

            if (stop3 != -1) {
                sum3 += stop3;
                count++;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum2);
        System.out.println("Numbers: " + count);

        //Exercise 10
        System.out.println("Giver numbers: ");
        int stop4 = 0, sum4 = 0, count2 = 0, avg = 0;

        while (stop4 != -1) {
            stop4 = Integer.parseInt(scanner.nextLine());

            if (stop4 != -1) {
                sum4 += stop4;
                count2++;
            }
        }
        avg = sum4 / count2;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum2);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);

        //Exercise 11
        System.out.println("Giver numbers: ");
        int stop5 = 0, sum5 = 0, count3 = 0, avg2 = 0, even = 0, odd = 0;

        while (stop5 != -1) {
            stop5 = Integer.parseInt(scanner.nextLine());

            if (stop5 != -1) {
                sum5 += stop5;
                count3++;
            }

            if (stop5%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        avg = sum4 / count2;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum2);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        //Exercise 12
        printText();

        //Exercise 13
        printText2();

        //Exercise 14
        printUntilNumber(5);

        //Exercise 15
        printFromNumberToOne(5);

        //Exercise 16
        division(3,5);

        //Exercise 17
        divisibleByThreeInRange(3,6);

        //Exercise 18
        int numUno = numberUno();
        System.out.println(numUno);
        //Exercise 19
        String aWord = word();
        System.out.println(aWord);

        //Exercise 20
        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);

        //Exercise 21
        int answer2 =  smallest(2, 7);
        System.out.println("Smallest: " + answer2);

        //Exercise 22
        int answer3 =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer3);

        //Exercise 23
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);

        //Exercise 24
        printStars(5);
        printStars(3);
        printStars(9);

        //Exercise 25
        printSquare(4);

        //Exercise 26
        printRectangle(17, 3);

        //Exercise 27
        printTriangle(4);

        //Exercise 28
        printSpaces(0);

        //Exercise 29
        printTriangle2(4);

        //Exercise 30
        christmasTree(4);
        christmasTree(10);


    }

    //Exercise 12
    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }

    //Exercise 13
    public static void printText2(){
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int numTimes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numTimes; i++ ){
            System.out.println("In a hole in the ground there lived a method");
        }
    }

    //Exercise 14
    public static void printUntilNumber(int num){
        int i = 0;

        while (i <= num){
            System.out.println(i);
            i++;
        }
    }

    //Exercise 15
    public static void printFromNumberToOne(int num){
        while (true){
            if (num < 1){
                break;
            }

            System.out.println(num);
            num--;
        }
    }

    //Exercise 16
    public static void division(int nume, int deno){
        double result = (double) nume / deno;
        System.out.println(result);
    }

    //Exercise 17
    public static void divisibleByThreeInRange(int start, int end){
        int i = start;

        while (true){
            if (i > end){
                break;
            }

            if (i%3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Exercise 18
    public static int numberUno(){
        return 1;
    }

    //Exercise 19
    public static String word(){
        return "Hi!";
    }

    //Exercise 20
    public static int sum(int fi, int se, int thi, int fo){
        return fi+se+thi+fo;
    }

    //Exercise 21
    public static int smallest(int num, int num2){
        while (true){
            if (num < num2){
                return num;
            } else if (num2 < num) {
                return num2;
            }
        }
    }

    //Exercise 22
    public static int greatest(int num, int num2, int num3){
        while (true){
            if (num > num2 && num > num3){
                return num;
            } else if (num2 > num && num2 > num3) {
                return num2;
            } else if (num3 > num && num3 > num2) {
                return num3;
            }
        }
    }

    //Exercise 23
    public static double average(int num, int num2, int num3, int num4){
        double total = sum(num, num2, num3, num4);
        return total/4;
    }

    //Exercise 24
    public static void printStars(int num){
        for (int i = 0; i <= num; i++){
            System.out.print("*");

        }
        System.out.println("");
    }

    //Exercise 25
    public static void printSquare(int size){
        for (int i = 0; i < size; i++){
            printStars(size);
        }
    }

    //Exercise 26
    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++){
            printStars(width);
        }
    }

    //Exercise 27
    public static void printTriangle(int size){
        for (int i = 0; i < size; i++){
            printStars(i);
        }
    }

    //Exercise 28
    public static void printSpaces(int num){
        for (int i = 0; i < num; i++){
            System.out.print(" ");
        }
    }

    //Exercise 29
    public static void printTriangle2(int size){
        int tempSize = size;

        for (int i = 0; i < size; i++) {
            printSpaces(tempSize);
            printStars(i);
            tempSize--;
        }
    }

    //Exercise 30
    public static void christmasTree(int height){
        int tempHeight = height, tempBranch = 0;

        for (int i = 0; i < height; i++){
            printSpaces(tempHeight);
            printStars(i + tempBranch);
            tempHeight--;
            tempBranch++;
        }

        printSpaces(height-1);
        printStars(2);
        printSpaces(height-1);
        printStars(2);
    }

}