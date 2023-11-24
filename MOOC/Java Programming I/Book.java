public class Book {
    private int pages;
    private int pupYear;
    private int id;
    private String name;
    private String author;

    //Constructors
    public Book(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Book(String name, int pages, int pupYear){
        this.name = name;
        this.pages = pages;
        this.pupYear = pupYear;
    }
    public Book(String name, int pupYear){
        this.name = name;
        this.pupYear = pupYear;
    }

    //Methods
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public int getId(){
        return this.id;
    }
    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }

        if (!(compared instanceof Book)){
            return false;
        }

        Book comparedCast = (Book) compared;

        if (this.name.equals(((Book) compared).name) && this.pupYear == ((Book) compared).pupYear){
            return true;
        }

        return false;
    }
    @Override
    public String toString(){
        return (this.name + ", " + this.pages + " pages, " + this.pupYear);
    }
}
