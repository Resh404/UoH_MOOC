import java.util.Scanner;

public class LiquidContainers2 {
    Scanner scanner;
    Container conta;
    Container conta2;

    //Constructors
    public LiquidContainers2(){
        this.scanner = new Scanner(System.in);
        this.conta = new Container();
        this.conta2 = new Container();
    }

    //Methods
    public void main(){
        System.out.println("Write \"quit\" to quit.");
        System.out.println("Commands: add x(amount of water, move x, remove x");
        String input, command[], toDo;
        int val;

        while (true){
            System.out.println("First: " + this.conta.toString());
            System.out.println("Second: " + this.conta2.toString());

            input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")){
                return;
            }

            command = input.split(" ");
            toDo = command[0];
            val = Integer.parseInt(command[1]);

            switch (toDo){
                case "add":
                    this.conta.add(val);
                    break;

                case "move":
                    this.conta2.add(val);
                    this.conta.remove(val);
                    break;

                case "remove":
                    this.conta2.remove(val);
                    break;
            }
        }
    }
}
