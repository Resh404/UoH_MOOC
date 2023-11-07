import java.util.Scanner;

//Exercises from 2013 Object-oriented programming, part 1 (https://tmc.mooc.fi/org/mooc/courses/277)
public class javaPart1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println("Jane Doe");
        String myName = scanner.nextLine();
        System.out.println(myName);

        //Exercise 2
        System.out.println("Hello world! \n(And all the people of the world)");

        //Exercise 3
        System.out.println("     *\n    ***\n   *****\n  *******\n *********\n     *" );

        //Exercise 4
        int chicken = 9000;
        double baconKg= 0.1;
        String aTractor = "Zetor";

        System.out.println("Chicken:\n" + chicken);
        System.out.println("Bacon (kg):\n" + baconKg);
        System.out.println("A tractor:\n" + aTractor);
        System.out.println("\nIn a nutshell:\n" + chicken + "\n" + baconKg + "\n" + aTractor);

        //Exercise 5
        int secsInMin = 60;
        int minInHour = 60;
        int hourInDay = 24;
        int daysInYear = 365;

        int secsInYear = (secsInMin * minInHour * hourInDay * daysInYear);
        System.out.println("There are " + secsInYear + " in a year.");

        //Exercise 6
        int num = 5;
        int num2 = 4;
        int sum = num + num2;
        System.out.println("Sum of " + num + " + " + num2 + " is: " + sum);

        //Exercise 7
        int num3 = 5;
        int num4 = 4;
        int sum2 = num3 * num4;
        System.out.println("Sum of " + num3 + " * " + num4 + " is: " + sum2);

        //Exercise 8
        System.out.println("Type a number: ");
        int num5 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type another number: ");
        int num6 = Integer.parseInt(scanner.nextLine());

        int sum3 = num5 + num6;
        System.out.println("Sum of the numbers: " + sum3);

        //Exercise 9
        System.out.println("Type a number: ");
        int num7 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type another number: ");
        int num8 = Integer.parseInt(scanner.nextLine());

        double sum4 = (double)num7 / num8;
        System.out.println("Division: " + num7 + " / " + num8 + " = " + sum4);

        //Exercise 10
        System.out.println("Type the radius: ");
        int num9 = Integer.parseInt(scanner.nextLine());
        double radiusCir = (double)num9 * 2 * Math.PI;
        System.out.println("Circumference of the circle: " + radiusCir);

        //Exercise 11
        System.out.println("Type a number: ");
        int num10 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type another number: ");
        int num11 = Integer.parseInt(scanner.nextLine());

        double maxVal = Math.max(num10, num11);
        System.out.println("The bigger number of the two numbers given was: " + maxVal);

        //Exercise 12
        System.out.println("Type your name: ");
        String strMat = scanner.nextLine();
        System.out.println("Type your age: ");
        int num12 = Integer.parseInt(scanner.nextLine());

        System.out.println("Type your name: ");
        String strArt = scanner.nextLine();
        System.out.println("Type your age: ");
        int num13 = Integer.parseInt(scanner.nextLine());

        int totalAge = num12 + num13;
        System.out.println(strMat + " and " + strArt + " are " + totalAge + " years old in total.");

        //Exercise 13
        //Exercise 14
        System.out.println("Type a number: ");
        int num14 = Integer.parseInt(scanner.nextLine());

        if (num14 > 0){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }

        //Exercise 15
        System.out.println("How old are you? ");
        int myAge = Integer.parseInt(scanner.nextLine());

        if (myAge >= 18){
            System.out.println("You have reached the age of majority!");
        } else {
            System.out.println("You have not reached the age of majority yet!");
        }

        //Exercise 16
        System.out.println("Type a number: ");
        int num15 = Integer.parseInt(scanner.nextLine());

        if (num15%2 == 0){
            System.out.println("Number " + num15 + " is even.");
        } else {
            System.out.println("Number " + num15 + " is not even.");
        }

        //Exercise 17
        System.out.println("Type the first number: ");
        int num16 = Integer.parseInt(scanner.nextLine());
        System.out.println("Type the second number: ");
        int num17 = Integer.parseInt(scanner.nextLine());

        if  (num16 > num17) {
            System.out.println("Greater number: " + num16);
        } else if (num17 > num16) {
            System.out.println("Greater number: " + num17);
        }else if (num16 == num17){
            System.out.println("The numbers are equal");
        }

        //Exercise 18
        System.out.println("Type the points [0-60]: ");
        int num18 = Integer.parseInt(scanner.nextLine());

        if  (num18 <= 29) {
            System.out.println("Grade: failed");
        } else if (num18 >= 30 && num18 <= 34) {
            System.out.println("Grade: 1");
        }else if (num18 >= 35 && num18 <= 39){
            System.out.println("Grade: 2");
        }else if (num18 >= 40 && num18 <= 44){
            System.out.println("Grade: 3");
        }else if (num18 >= 45 && num18 <= 49){
            System.out.println("Grade: 4");
        }else if (num18 >= 50 && num18 <= 60){
            System.out.println("Grade: 5");
        }

        //Exercise 19
        System.out.println("How old are you? ");
        int checkAge = Integer.parseInt(scanner.nextLine());

        if (checkAge >= 0 && checkAge <= 120){
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

        //Exercise 20
        System.out.println("Type your username: ");
        String strAlex = scanner.nextLine();
        System.out.println("Type your password: ");
        String strPassA = scanner.nextLine();

        if ((strAlex.equals("alex") && strPassA.equals("mightyducks") || strAlex.equals("emily") && strPassA.equals("cat") )){
            System.out.println("You are now logged into the system!");
        } else{
            System.out.println("Your username or password was invalid!");
        }

        //Exercise 21
        System.out.println("Type a year ");
        int leapCheck = Integer.parseInt(scanner.nextLine());

        if ((leapCheck%4 == 0) || (leapCheck%100 == 0 && leapCheck%400 == 0)){
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

        //Exercise 22
        while ((true)) {
            System.out.println("Type the password: ");
            String strCarrot = scanner.nextLine();

            if (strCarrot.equals("carrot")) {
                System.out.println("The secret is: jryy qbar!");
                break;
            } else{
                System.out.println("Wrong!");
            }
        }
        //Exercise 23
        //Exercise 24

    }   
}
