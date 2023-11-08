public class Song {
    private String name;
    private String porto;
    private int length;
    public Song(String name, int length){
        this.name = name;
        this.length = length;
    }

    public Song(String name, String porto, int length){
        this.name = name;
        this.length = length;
        this.porto = porto;
    }
    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Song)){
            return false;
        }

        Song comparedConverted = (Song) compared;

        if (this.name.equals(((Song) compared).name) && this.length == ((Song) compared).length
                && this.porto.equals(((Song) compared).porto)){
            return true;
        }

        return false;
    }
}
