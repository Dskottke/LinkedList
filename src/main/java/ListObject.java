import lombok.Data;

@Data
public class ListObject {

    Object object;
    ListObject nextObject;

    public ListObject(Object object) {
        this.object = object;
        this.nextObject = null;
    }
}
