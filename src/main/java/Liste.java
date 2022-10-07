public class Liste {

    private String node;
    private Liste next;

    //Constructor
    public Liste() {
    }
    public Liste(String node, Liste next) {
        this.node = node;
        this.next = next;
    }

    //Methods
    @Override
    public String toString() {
        return "Liste{" +
                "node='" + node + '\'' +
                ", next=" + next +
                '}';
    }

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public Liste getNext() {
        return next;
    }

    public void setNext(Liste next) {
        this.next = next;
    }


    }

