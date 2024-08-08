public class List2 {
    Cell firstCell;

    public List2() {
        this.firstCell = null;
    }

    // This method inserts the elements neatly.
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

    // This method inserts in the beginning of the list.
    public void insertAtBeginning(int value) {
        Cell elementCell = new Cell(value);
        elementCell.next = firstCell;
        firstCell = elementCell;
    }

    // This method removes at the beginning of the list.
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

    // QUESTION 3: This method merges the First List (List1.java) and the Second List (List2.java).
    public void merge(List1 list1) {
        if (empty()) {
            firstCell = list1.firstCell;
        } else {
            Cell aux = firstCell;
            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = list1.firstCell;
        }
    }

    public void mergeOrdered(List1 list1) {
        if (empty()) {
            firstCell = list1.firstCell;
        }
        else {
            Cell aux = firstCell;
            Cell aux2 = firstCell.next;
            if(aux2 == null){
                if(aux.value < list1.firstCell.value){
                    insertAtEnding(list1.firstCell.value);
                }
                else{
                    insertAtBeginning(list1.firstCell.value);
                }
            }
            else{
                while (aux2.next != null && aux2.value < list1.firstCell.value) {
                    aux = aux.next;
                    aux2 = aux2.next;
                }
                if(aux2.next == null && aux.value < list1.firstCell.value){
                    insertAtEnding(list1.firstCell.value);
                }
                else{
                    aux.next = list1.firstCell;
                    list1.firstCell.next = aux2;
                }
            }
        }
    }

    /*
     * public void insertOrdered(int value) {
     * Cell elementCell = new Cell(value);
     * 
     * if (empty()) {
     * firstCell = elementCell;
     * } else {
     * Cell aux = firstCell;
     * Cell aux2 = firstCell.next;
     * if (aux2 == null) {
     * if (aux.value < elementCell.value) {
     * insertAtEnding(value);
     * } else {
     * insertAtBeginning(value);
     * }
     * } else {
     * while (aux2.next != null && aux2.value < elementCell.value) {
     * aux = aux.next;
     * aux2 = aux2.next;
     * }
     * if (aux2.next == null && aux2.value < elementCell.value) {
     * insertAtEnding(value);
     * } else {
     * aux.next = elementCell;
     * elementCell.next = aux2;
     * }
     * }
     * }
     * }
     */
}
