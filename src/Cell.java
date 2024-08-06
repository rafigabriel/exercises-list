public class Cell {
    Cell next;
    Cell prev;
    int value;

    public Cell(int value) {
        this.value = value;
        this.next = null;
    }
}
