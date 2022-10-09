import lombok.Data;


@Data
public class LinkedList {

    //DECLARATION
   ListObject firstListElement;

    //CONSTRUCTOR

    public LinkedList() {
    firstListElement= new ListObject(null);
    }

    public LinkedList(ListObject firstListElement) {
        this.firstListElement = firstListElement;
    }

    //METHODS
    public void addObjectAtLast(Object o) {
        if(firstListElement.getObject()==(null)){
            firstListElement.setObject(o);
            return;
        }
        ListObject lastObject = getLastObject();
        ListObject nextObject = new ListObject(o);
        lastObject.setNextObject(nextObject);
    }

    public ListObject getLastObject(){
        ListObject current = firstListElement;
        while(current.getNextObject()!=null){
            current = current.getNextObject();
        }
        return current;
    }
    public void deleteObject(Object o){
        ListObject current = firstListElement;
        ListObject find = new ListObject(o);

        while(!current.getObject().equals(find.getObject()))
            if(current.getNextObject().getObject().equals(o)){

              current.setNextObject(current.getNextObject().getNextObject());
              return;}

            else current = current.getNextObject();
        }

    }





