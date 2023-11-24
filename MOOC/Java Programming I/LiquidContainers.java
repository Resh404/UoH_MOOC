import java.util.Scanner;

public class LiquidContainers {
    private int first;
    private int second;
    Scanner scanner;

    //Constructors
    public LiquidContainers(){
        this.first = 0;
        this.second = 0;
        this.scanner = new Scanner(System.in);
    }

    //Methods
    public void main(){
        System.out.println("Write \"quit\" to quit.");
        System.out.println("Commands: add x(amount of water, move x, remove x");
        String input, command[], toDo;
        int max = 100, val, min = 0, temp;

        while (true){
            System.out.println("First: " + this.first + "/" + max);
            System.out.println("Second: " + this.second + "/" + max);

            input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")){
                return;
            }

            command = input.split(" ");
            toDo = command[0];
            val = Integer.parseInt(command[1]);
            temp = this.first + Math.abs(val);

            switch (toDo){
                case "add":
                    if (temp < max){
                        this.first = temp;
                    } else if (temp >= max) {
                        this.first = max;
                    }
                    break;
                case "move":
                    if (this.first > min){
                        this.second = val;
                        this.first -= this.second;
                        if (this.first < min){
                            this.first = min;
                        }
                    } else if (temp >= max) {
                        this.second = max;
                        this.first = min;
                    }
                    break;
                case "remove":
                    if (this.second > min){
                        this.second -= val;

                        if (this.second < min){
                            this.second = min;
                        }
                    }
                    break;
            }
        }
    }
}
