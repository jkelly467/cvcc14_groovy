
package test;

public class Book extends NamedThing{
    private String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }
    
    public String getAuthor() { return author; }
}