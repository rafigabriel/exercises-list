public class Question1 {

    Cell firstCell;

    public Question1() {
        this.firstCell = null;
    }

    public void add(int value) {
        Cell elementsCell = new Cell(value);
        if (empty()) {
            firstCell = elementsCell;
        } else {
            Cell aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }

            aux.next = elementsCell;
        }
    }

    public boolean empty() {
        return (firstCell == null);
    }

    public boolean removeAtEnding() {

        if (empty()) {
            return false;
        } else {
            Cell prev = firstCell;
            Cell aux = firstCell.next;
            if (aux != null) {
                while (aux.next != null) {
                    prev = aux;
                    aux = aux.next;
                }
                prev.next = null;
            }
            else {
                aux = firstCell;
                firstCell = null;
            }
            return true;
        }

    }

    public void impress() {
        Cell aux = firstCell;
        while (aux != null) {
            System.out.println("Value: " + aux.value);
            aux = aux.next;
        }
    }

}
