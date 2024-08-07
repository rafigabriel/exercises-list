public class Question1 {
    Cell firstCell;

    public Question1() {
        this.firstCell = null;
    }

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
