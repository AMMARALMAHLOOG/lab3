/**
 * Created by Arabic on 26/01/22.
 */
public interface Stack <E>{
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();

}
