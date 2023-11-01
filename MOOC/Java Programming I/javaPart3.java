import java.util.Scanner;
import java.util.ArrayList;
//Exercises from Java Programming I part 2 (https://java-programming.mooc.fi/).
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

        //Exercise 16
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLastEx17(strings);
        removeLastEx17(strings);

        System.out.println(strings);


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
}
