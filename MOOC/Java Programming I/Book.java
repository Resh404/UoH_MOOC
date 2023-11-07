public class Book {
    private String name;
    private int pages;
    private int pupYear;

    public Book(String name, int pages, int pupYear){
        this.name = name;
        this.pages = pages;
        this.pupYear = pupYear;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return (this.name + ", " + this.pages + " pages, " + this.pupYear);
    }
}
