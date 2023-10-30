import java.util.Scanner;

//Exercises from Java Programming I part 2 (https://java-programming.mooc.fi/)
public class javaPart2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Exercises 1
        System.out.println("Type a number: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= num; i++ ){
            System.out.println(i);
        }

        //Exercises 2
        System.out.println("Type a number: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num2; i <= 100; i++ ){
            System.out.println(i);
        }

        //Exercises 3
        System.out.println("Where to? ");
        int num3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num3; i++ ){
            System.out.println(i);
        }

        //Exercises 4
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

        //Exercises 5
        System.out.println("Last number? ");
        int num6 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i <= num6; i++ ){
            sum += i;
        }
        System.out.println("The sum is: " + sum);

        //Exercises 6
        System.out.println("Last number? ");
        int num7 = Integer.parseInt(scanner.nextLine());
        int tempNum, total = 1;

        for (int i = 0; i < num7; i++ ){
            if (num7 == 0){
                total = 1;
                break;
            }
            tempNum = i * total;
            total += tempNum;
        }
        System.out.println("Factorial: " + total);

        //Exercises 7
        System.out.println("Giver numbers: ");
        int stop = 0;

        while (stop != -1) {
            stop = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");
    }
}
