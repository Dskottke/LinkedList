public class Liste {

    private String data;
    private Liste next;

    //Constructor
    public Liste() {
    }
    public Liste(String data, Liste next) {
        this.data = data;
        this.next = next;
    }

    //Methods
    @Override
    public String toString() {
        return "Liste{" +
                "node='" + data + '\'' +
                ", next=" + next +
                '}';
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Liste getNext() {
        return next;
    }

    public void setNext(Liste next) {
        this.next = next;
    }
    public void addNode(String data){
        Liste current = this;

        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new Liste(data,null));
    }

    }

