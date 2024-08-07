public class Question2 {
    Cell firstCell;

    public Question2() {
        this.firstCell = null;
    }

    public void insertOrdered(int value) {
        Cell elementCell = new Cell(value);

        if (empty()) {
            firstCell = elementCell;
        } else {
            Cell aux = firstCell;
            Cell aux2 = firstCell.next;
            if (aux2 == null) {
                if (aux.value < elementCell.value) {
                    insertAtEnding(value);
                } else {
                    insertAtBeginning(value);
                }
            } else {
                while (aux2.next != null && aux2.value < elementCell.value) {
                    aux = aux.next;
                    aux2 = aux2.next;
                }
                if (aux2.next == null && aux2.value < elementCell.value) {
                    insertAtEnding(value);
                } else {
                    aux.next = elementCell;
                    elementCell.next = aux2;
                }
            }
        }
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public void insertAtBeginning(int value) {
        Cell elementCell = new Cell(value);
        elementCell.next = firstCell;
        firstCell = elementCell;
    }

    public void insertAtEnding(int value) {
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
            System.out.println("Value : " + aux.value);
            aux = aux.next;
        }

    }
}
