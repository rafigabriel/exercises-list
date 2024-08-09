public class LinkedList {

    public List merge(List list1, List list2) {

        if (list1.empty()) {
            return list2;
        }
        if (list2.empty()) {
            return list1;
        }

        Cell aux = list1.firstCell;
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = list2.firstCell;
        return list1;
    }

    public List mergeOrdered(List list1, List list2){

        if (list1.empty()) {
            return list2;
        }
        if (list2.empty()) {
            return list1;
        }
        List listsMergedOrdered = new List();
        Cell aux = list1.firstCell;
        Cell aux2 = list2.firstCell;

        while (aux != null && aux2 != null) {

            if(aux.value < aux2.value){
                listsMergedOrdered.insertOrdered(aux.value);
                aux = aux.next;
            }
            else{
                listsMergedOrdered.insertOrdered(aux2.value);
                aux2 = aux2.next;
            }
        }
        return listsMergedOrdered;
    }   
}
