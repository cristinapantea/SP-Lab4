import interfaces.Element;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    public String title;
    Author author;

    public Book(String title) {
        super();
        this.title = title;
    }

    public void addAuthor(Author name) {
        this.author = name;
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + this.title);
        author.print();
        for(Element els : elements) {
            els.print();
        }
    }

}
