import java.util.ArrayList;

public class JokeManager {
    private ArrayList<String> jokes;

    //Constructors
    public JokeManager(){
        this.jokes = new ArrayList<>();
    }

    //Methods
    public void addJoke(String joke){
        this.jokes.add(joke);
    }

    public String drawJoke(){
        if (this.jokes.isEmpty()){
            return "Jokes are in short supply..";
        }

        int min = 0, max = jokes.size()-1;
        int rando = (int) (Math.random() * ((max - min) + 1)) + min;

        return jokes.get(rando);
    }

    public void printJokes(){
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
