import java.util.Arrays;

/**
 * Created by Arabic on 20/02/09.
 */
public class ArrayQueue<E> implements Queue<E> {
    final static int CAPACITY=100;
    E[] data;
    int sz=0;
    int f=0;

    public ArrayQueue(int c) {
        data=((E[]) new Object[c]);
    }

    public ArrayQueue() {
        this(CAPACITY);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
        if (sz==data.length)
            throw new IllegalStateException("Queue is full");
        int index=(sz+f)%data.length;
        data[index]=element;
        sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E deleted=data[f];
        data[f]=null;
        f=(f+1)%data.length;
        sz--;
        return deleted;
    }

    @Override
    public E first() {
        if(isEmpty()) return null;

        return data[f];
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
