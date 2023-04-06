package latihan12;

/**
 *
 * @author VALENCIA SEFIANA
 */

public class FirstLastList {
    public Link first;
    public Link last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(String dd) {
        Link newLink = new Link(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public int deleteFirst() {
        int temp = (int) first.dDate;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }
    
}

