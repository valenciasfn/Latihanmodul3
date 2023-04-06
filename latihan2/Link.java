package latihan12;

/**
 *
 * @author VALENCIA SEFIANA
 */
public class Link {

    public String dDate;
    public Link next;

    public Link(String d) {
        dDate = d;
    }

    public void displayLink() {
        System.out.print(dDate + " ");
    }
}
