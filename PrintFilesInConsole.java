import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Arabic on 20/02/09.
 */
public class PrintFilesInConsole {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayQueue<String>q=new ArrayQueue<>(4);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter file path to print : ");
        for (int i = 0; i <4 ; i++)
        {
            q.enqueue(in.next());
        }
        while (!q.isEmpty())
        {
            Scanner fileScanner=new Scanner(new File(q.dequeue()));
                    while(fileScanner.hasNextLine())
                        System.out.println(fileScanner.nextLine());
        }
    }
}
