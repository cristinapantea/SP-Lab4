import interfaces.Element;

public class Paragraph implements Element {
    public String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public int get() {
        return 0;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }
}

