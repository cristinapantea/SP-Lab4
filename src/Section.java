import interfaces.Element;
import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public String title;
    List<Element> elements = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    public Section() {
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void add() {

    }

    public void remove() {

    }

    public int get() {

        return 0;
    }

    public void print() {
        System.out.println(title);
        for(Element els : elements) {
            els.print();
        }
    }
}
