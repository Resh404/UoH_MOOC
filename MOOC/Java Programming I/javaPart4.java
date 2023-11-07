import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
//Exercises from Java Programming I part 3 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class javaPart4 {
    public static void main(String[] args){
        //Exercise 1
        int[] myArr = new int[5];
        myArr[0] = 1;
        myArr[1] = 3;
        myArr[2] = 5;
        myArr[3] = 7;
        myArr[4] = 9;

        swapEx1(myArr);

        //Exercise 2
        indexLookUp(myArr);

        //Exercise 3
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);

        //Exercise 4
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

        //Exercise 5
        printArrayInStars(array);

        //Exercise 6
        cakeThrice();

        //Exercise 7
        trueer();

        //Exercise 8
        login(); //alex, sunshine, emma, haskell ,alex, thunderstorm

        //Exercise 9
        splitStr(); //once upon a time, a little program, halted

        //Exercise 10
        avFinder();
        //java is a programming language, navy blue shirt, Do you have a favorite flavor
        //was it a cat?

        //Exercise 11
        firstPart(); //one two three four, this is a very important message

        //Exercise 12
        lastPart(); //one two three four, this is a very important message

        //Exercise 13
        ageOld();
        //sebastian,2 lucas,2 lily,1 hanna,5 gabriel,10

        //Exercise 14
        nameOld();
        //sebastian,2 lucas,2 lily,1 hanna,5 gabriel,10

        //Exercise 15
        nameBirth();
        //sebastian,2017 lucas,2017 lily,2017 hanna,2014 gabriel,2009

    }

    //Exercise 1
    public static void swapEx1(int[] arr){
        Scanner scanner = new Scanner(System.in);
        int input = 0, input2 = 0, tempVal = 0;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Give two indices to swap: ");
        input = Integer.parseInt(scanner.nextLine());
        input2 = Integer.parseInt(scanner.nextLine());

        tempVal = arr[input];
        arr[input] = arr[input2];
        arr[input2] = tempVal;

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //Exercise 2
    public static void indexLookUp(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for? ");
        int index = Integer.parseInt(scanner.nextLine());

        if (index > arr.length-1){
            System.out.println(index + " was not found");
            return;
        }

        System.out.println(arr[index] + " is at index " + index);
    }

    //Exercise 3
    public static void sumOfNumbersInArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    //Exercise 4
    public static void printNeatly(int[] arr){
        for (int i = 0; i < arr.length; i++){

            if (i != arr.length-1){
                System.out.print(arr[i]+ "," + " ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    //Exercise 5
    public static void printArrayInStars(int[] arr){
        int starCount = 0;

        for (int i = 0; i < arr.length; i++){
            starCount = arr[i];

            for (int j = 0; j < starCount; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Exercise 6
    public static void cakeThrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        int i = 0;

        while (i < 3){
            System.out.print(word);
            i++;
        }

        System.out.println();
    }

    //Exercise 7
    public static void trueer(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("write true to end or anything else to not end");
            String word = scanner.nextLine();

            if (word.equals("true")){
                System.out.println("You got it right!");
                return;
            } else {
                System.out.println("try again!");
            }
        }
    }

    //Exercise 8
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        String al = "alex", passAl = "sunshine", em = "emma", passEm = "haskell";

        System.out.println("Enter username: ");
        String name = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();

        if (name.equals(al) || name.equals(em)){
            if (pass.equals(passAl) || pass.equals(passEm)){
                System.out.println("You have successfully logged in");
            } else {
                System.out.println("Incorrect username or password!");
            }
        } else {
            System.out.println("Incorrect username or password!");
        }
    }

    //Exercise 9
    public static void splitStr(){
        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (true){
            System.out.println("Write a sentence to split");
            str = scanner.nextLine();

            if (str.isEmpty()){
                return;
            }

            String[] newStr = str.split(" ");

            for (int i = 0; i < newStr.length; i++){
                System.out.println(newStr[i]);
            }

            System.out.println("Press Enter to end or enter a new sentence");
        }
    }

    //Exercise 10
    public static void avFinder(){
        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (true){
            System.out.println("write a sentence with/without av");
            str = scanner.nextLine();

            if (str.isEmpty()){
                return;
            }

            String[] newStr = str.split(" ");

            for (int i = 0; i < newStr.length; i++){
                if (newStr[i].contains("av")){
                    System.out.println(newStr[i]);
                }
            }

            System.out.println("Press Enter to end or enter a new sentence");
        }
    }

    //Exercise 11
    public static void firstPart(){
        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (true){
            System.out.println("Write a sentence to get the first word of");
            str = scanner.nextLine();

            if (str.isEmpty()){
                return;
            }

            String[] newStr = str.split(" ");

            System.out.println(newStr[0]);
            System.out.println("Press Enter to end or enter a new sentence");
        }
    }

    //Exercise 12
    public static void lastPart(){
        Scanner scanner = new Scanner(System.in);
        String str = "";

        while (true){
            System.out.println("Write a sentence to get the last word of");
            str = scanner.nextLine();

            if (str.isEmpty()){
                return;
            }

            String[] newStr = str.split(" ");

            System.out.println(newStr[newStr.length-1]);
            System.out.println("Press Enter to end or enter a new sentence");
        }
    }

    //Exercise 13
    public static void ageOld(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int age = 0;

        while (true){
            System.out.println("write names and ages");
            str = scanner.nextLine();

            if (str.isEmpty()){
                System.out.println("Age of the oldest: " + age);
                return;
            }

            String[] newStr = str.split(",");

            for (int i = 0; i < newStr.length; i++){
                if (Integer.parseInt(newStr[1]) > age){
                    age = Integer.parseInt(newStr[1]);
                }
            }
            System.out.println("Press Enter to end or enter a new sentence");
        }
    }

    //Exercise 14
    public static void nameOld(){
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String nam = "", str = "";

        while (true){
            System.out.println("write names and ages");
            str = scanner.nextLine();

            if (str.isEmpty()){
                System.out.println("Name of the oldest: " + nam);
                return;
            }

            String[] newStr = str.split(",");

            for (int i = 0; i < newStr.length; i++){
                if (Integer.parseInt(newStr[1]) > age){
                    age = Integer.parseInt(newStr[1]);
                    nam = newStr[0];
                }
            }

            System.out.println("Press Enter to end or enter a new sentence");
        }
    }

    //Exercise 15
    public static void nameBirth(){
        Scanner scanner = new Scanner(System.in);
        int avgBirth = 0, people = 0, oldLenght = 0;
        String longName = "", str = "";

        while (true){
            System.out.println("write names and birth years");
            str = scanner.nextLine();

            if (str.isEmpty()){
                avgBirth = avgBirth /people;
                System.out.println("Longest name: " + longName);
                System.out.println("Average of the birth years: " + avgBirth);
                return;
            }

            String[] newStr = str.split(",");

            for (int i = 0; i < newStr.length; i++){
                avgBirth += Integer.parseInt(newStr[1]);
                people++;

                if (newStr[0].length() > oldLenght){
                    oldLenght = newStr[0].length();
                    longName = newStr[0];
                }
            }

            System.out.println("Press Enter to end or enter a new sentence");
        }
    }
}
