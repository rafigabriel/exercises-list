public class App {
    public static void main(String[] args) {

        // QUESTION 1:
            LinkedList linkedList = new LinkedList();
            List list1 = new List();
            int[] elements = { 12, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
            for (int i = 0; i < elements.length; i++) {
                list1.insert(elements[i]);
            }
            System.out.println("First list created:");
            System.out.println("-----------------------------------------------");
            list1.print();
            System.out.println("-----------------------------------------------");
            list1.remove();
            list1.remove();
            System.out.println("First list after some removals:");
            System.out.println("-----------------------------------------------");
            list1.print();

         
        // --------------------------------------------------------------------------

        // QUESTION 2:

            List list2 = new List();
            list2.insertOrdered(10);
            list2.insertOrdered(45);
            list2.insertOrdered(366);
            list2.insertOrdered(988);
            list2.insertOrdered(444);
            list2.insertOrdered(22);
            System.out.println("-----------------------------------------------");
            System.out.println("Second list created and the elements were inserted neatly:");
            System.out.println("-----------------------------------------------");
            list2.print();
            System.out.println("-----------------------------------------------");
        //--------------------------------------------------------------------------

        List mergedLists = linkedList.merge(list1, list2);
        System.out.println("Merged lists: ");
        mergedLists.print();

        
    }
}
