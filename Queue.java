/**
 * Created by Arabic on 20/02/09.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E element);
    E dequeue();
    E first();
}
