public class LinkedList {

    public List merge(List list1, List list2) {
        if (list1.empty()) {
            return list2;
        }
        if(list2.empty()){
            return list1;
        }
        
        Cell aux = list1.firstCell;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = list2.firstCell;
        return list1;
    }
}
