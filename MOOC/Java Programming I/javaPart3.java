import java.util.Scanner;
import java.util.ArrayList;
//Exercises from Java Programming I part 3 (https://java-programming.mooc.fi/).
//no template could be found for the exercises.
public class javaPart3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //Exercise 1
        inputUsers();

        //Exercise 2
        inputInts();

        //Exercise 3
        //list.get(0);

        //Exercise 4
        readUsers();

        //Exercise 5
        inputUsersEx5();

        //Exercise 6
        inputUsersEx6();

        //Exercise 7
        rememberTheseEx7();

        //Exercise 8
        onlyTheseEx8();

        //Exercise 9
        greatestNumEx9();

        //Exercise 10
        indexOfNumEx10();

        //Exercise 11
        indexOfSmallNumEx11();

        //Exercise 12
        sumOfListEx12();

        //Exercise 13
        avgOfListEx13();

        //Exercise 14
        checkListEx14();

        //Exercise 15
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRangeEx15(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRangeEx15(numbers, 3, 10);

        //Exercise 16
        ArrayList<Integer> numbersEx16 = new ArrayList<>();
        numbersEx16.add(3);
        numbersEx16.add(2);
        numbersEx16.add(6);
        numbersEx16.add(-1);
        System.out.println(sumEx16(numbersEx16));

        numbersEx16.add(5);
        numbersEx16.add(1);
        System.out.println(sumEx16(numbersEx16));

        //Exercise 17
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLastEx17(strings);
        removeLastEx17(strings);

        System.out.println(strings);

        //Exercise 18
        int[] myArr = new int[5];
        myArr[0] = 1;
        myArr[1] = 3;
        myArr[2] = 5;
        myArr[3] = 7;
        myArr[4] = 9;

        swapEx1(myArr);

        //Exercise 19
        indexLookUp(myArr);

        //Exercise 20
        int[] numbersEx20 = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbersEx20);

        //Exercise 21
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

        //Exercise 22
        printArrayInStars(array);

        //Exercise 23
        cakeThrice();

        //Exercise 24
        trueer();

        //Exercise 25
        login(); //alex, sunshine, emma, haskell ,alex, thunderstorm

        //Exercise 26
        splitStr(); //once upon a time, a little program, halted

        //Exercise 27
        avFinder();
        //java is a programming language, navy blue shirt, Do you have a favorite flavor
        //was it a cat?

        //Exercise 28
        firstPart(); //one two three four, this is a very important message

        //Exercise 29
        lastPart(); //one two three four, this is a very important message

        //Exercise 30
        ageOld();
        //sebastian,2 lucas,2 lily,1 hanna,5 gabriel,10

        //Exercise 31
        nameOld();
        //sebastian,2 lucas,2 lily,1 hanna,5 gabriel,10

        //Exercise 32
        nameBirth();
        //sebastian,2017 lucas,2017 lily,2017 hanna,2014 gabriel,2009

    }

    //Exercise 1
    public static void inputUsers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        System.out.println("Input users");

        while (true){
            String userIn = scanner.nextLine();

            if (userIn.isEmpty()){
                System.out.println(users.getFirst());
                break;
            }else {
                users.add(userIn);
            }

        }
    }

    //Exercise 2
    public static void inputInts(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Input numbers");

        while (true){
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0){
                //System.out.println(nums.getFirst());
                System.out.println((nums.get(1)+nums.get(2)));
                break;
            } else {
                nums.add(num);
            }
        }
    }

    //Exercise 4
    public static void readUsers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> e4Users = new ArrayList<>();
        System.out.println("Input users");

        while (true){
            String e4User = scanner.nextLine();

            if (e4User.isEmpty()){
                for (String user : e4Users) {
                    System.out.println(user);
                }
                break;
            } else {
                e4Users.add(e4User);
            }
        }
    }

    //Exercise 5
    public static void inputUsersEx5(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        System.out.println("Input users");
        int lastIndex = 0;

        while (true){
            String userIn = scanner.nextLine();

            if (userIn.isEmpty()){
                lastIndex = users.size();
                System.out.println(users.get(lastIndex-1));
                break;
            }else {
                users.add(userIn);
            }

        }
    }

    //Exercise 6
    public static void inputUsersEx6(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        System.out.println("Input users");
        int lastIndex = 0;

        while (true){
            String userIn = scanner.nextLine();

            if (userIn.isEmpty()){
                lastIndex = users.size();
                System.out.println(users.get(0));
                System.out.println(users.get(lastIndex-1));
                break;
            }else {
                users.add(userIn);
            }

        }
    }

    //Exercise 7
    public static void rememberTheseEx7(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");

        while (true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1){
                for (int user : rNums){
                    System.out.println(user);
                }
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 8
    public static void onlyTheseEx8(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");

        while (true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1){
                System.out.println("From where? ");
                int where = Integer.parseInt(scanner.nextLine());
                System.out.println("To where? ");
                int toWhere = Integer.parseInt(scanner.nextLine());

                for (int i = where; i < toWhere; i++){
                    System.out.println(i);
                }
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 9
    public static void greatestNumEx9(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");
        int greatNum = 0;

        while (true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1){
                for (int i = 0; i < rNums.size(); i++){
                    if (rNums.get(i) > greatNum){
                        greatNum = rNums.get(i);
                    }
                }
                System.out.println("The greatest number: " + greatNum);
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 10
    public static void indexOfNumEx10(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");
        int lookNum = 0;

        while (true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1){
                System.out.println("Search for? ");
                lookNum = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < rNums.size(); i++){
                    if (rNums.get(i) == lookNum){
                        System.out.println(lookNum + " is at index " + i);
                    }
                }
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 11
    public static void indexOfSmallNumEx11(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");
        int lookNum = 9999, smallInt = 0, smallIndex = 0;

        while (true){
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 9999){
                for (int i = 0; i < rNums.size(); i++){
                    if (rNums.get(i) < lookNum){
                        smallInt = lookNum;
                        smallIndex = i;
                    }
                    lookNum = rNums.get(i);
                }
                System.out.println("Smallest number: " + smallInt);
                System.out.println("Found at index: " + smallIndex);
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 12
    public static void sumOfListEx12() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");
        int sum = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                for (int num : rNums) {
                    sum+= num;
                }
                System.out.println("Sum: " + sum);
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 13
    public static void avgOfListEx13() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> rNums = new ArrayList<>();
        System.out.println("Input numbers");
        int sum = 0, totalNums = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == -1) {
                for (int num : rNums) {
                    sum+= num;
                    totalNums++;
                }
                System.out.println("Average: " + (double)(sum/totalNums));
                break;
            } else {
                rNums.add(input);
            }
        }
    }

    //Exercise 14
    public static void checkListEx14(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> users = new ArrayList<>();
        System.out.println("Input users");

        while (true){
            String userIn = scanner.nextLine();

            if (userIn.isEmpty()){
                System.out.println("Search for? ");
                String lookFor = scanner.nextLine();

                for (int i = 0; i < users.size(); i++){
                    if (lookFor.equals(users.get(i))){
                        System.out.println(lookFor + " was found!");
                        break;
                    }
                }
                System.out.println(lookFor + "was not found!");
                break;
            }else {
                users.add(userIn);
            }
        }
    }

    //Exercise 15
    public static void printNumbersInRangeEx15(ArrayList<Integer> nums, int lowLimit, int upLimit){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numbers");

        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) > lowLimit && nums.get(i) < upLimit){
                System.out.println(nums.get(i));
            }
        }
    }

    //Exercise 16
    public static int sumEx16(ArrayList<Integer> numbers){
        System.out.println("Input numbers");
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum;
    }

    //Exercise 17
    public static void removeLastEx17(ArrayList<String> strs){
        System.out.println("Input users");
        if (strs.isEmpty()){
            return;
        } else {
            strs.remove(strs.size()-1);
        }
    }

    //Exercise 18
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

    //Exercise 19
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

    //Exercise 20
    public static void sumOfNumbersInArray(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    //Exercise 21
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

    //Exercise 22
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

    //Exercise 23
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

    //Exercise 24
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

    //Exercise 25
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

    //Exercise 26
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

    //Exercise 27
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

    //Exercise 28
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

    //Exercise 29
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

    //Exercise 30
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

    //Exercise 31
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

    //Exercise 32
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