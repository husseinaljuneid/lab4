public class QueueAssignment {
    public static void rotate(ArrayQueue q)
    {
        int [] arr=new int[q.size()];
        for (int i = 0; i < 5; i++)
        {
            arr[i]= (int) q.dequeue();
        }

        for (int i = 4; i >=0 ; i--)
        {
            q.enqueue(arr[i]);
        }
    }
}
