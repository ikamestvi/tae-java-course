package homework7;

public class Book {
    private String title;
    private String author;
    private int year;


    public Book(String title){
        this.title=title;
        this.author="Unknown";
        this.year=0;
    }


    public Book(String title, String author){
        this.title=title;
        this.author=author;
        this.year=0;
    }


    public Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }


    @Override
    public String toString() {
        return title+" by "+author+" ("+year+") ";
    }
}
