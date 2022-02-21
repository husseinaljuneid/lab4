import java.util.Scanner;
/**
 * Created by Arabic on 20/02/09.
 */
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<Character> q = new ArrayQueue<>(5);
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <5 ; i++)
        {
            System.out.println("Enter Elements : ");
            q.enqueue(in.next().charAt(0));
            System.out.println("first = "+q.first());
            System.out.println("Size is : "+q.size());
        }
        System.out.println("Elements of Queue Were : ");
        while (!q.isEmpty())
        {
            System.out.print(q.dequeue()+"\t");
        }

    }
}
