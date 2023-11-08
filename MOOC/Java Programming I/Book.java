public class Book {
    private String name;
    private int pages;
    private int pupYear;
    private String author;

    public Book(String name, int pages, int pupYear){
        this.name = name;
        this.pages = pages;
        this.pupYear = pupYear;
    }
    public Book(String name, int pupYear){
        this.name = name;
        this.pupYear = pupYear;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
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
