public class List1 {
    Cell firstCell;

    public List1() {
        this.firstCell = null;
    }

    //This method inserts at the end of the list.
    public void insert(int value) {
        Cell elementCell = new Cell(value);
        if (empty()) {
            firstCell = elementCell;
        } else {
            Cell aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = elementCell;
        }

    }

    public void print() {
        Cell aux = firstCell;
        while (aux != null) {
            System.out.println("Value: " + aux.value);
            aux = aux.next;
        }
    }

    public boolean empty() {
        return (firstCell == null);
    }

    //This method removes at the end of the list.
    public void remove() {
        if (empty()) {
            firstCell = null;
        } else {
            Cell aux = firstCell;
            while (aux.next.next != null) {
                aux = aux.next;
            }
            aux.next = null;
        }
    }

}
