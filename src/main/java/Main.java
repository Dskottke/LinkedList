public class Main {
    public static void main(String[] args) {

    LinkedList list = new LinkedList();
    list.addObjectAtLast("a");
    list.addObjectAtLast("b");
    list.addObjectAtLast("c");
    list.addObjectAtLast("d");
    list.addObjectAtLast("e");

    list.deleteObject("b");

    System.out.println(list.toString());
    }



}
