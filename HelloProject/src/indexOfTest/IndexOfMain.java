package indexOfTest;
import java.util.Scanner;

public class IndexOfMain
{
    public static void main(String[] args)
    {
        String[] books = {"the book of Java","catch The JAVA!","lonely C#"};
        Scanner sc = new Scanner(System.in);
        String findThis;
        int count = 0;
        while(true) {
            System.out.print("Find your book >> ");
            findThis = sc.nextLine().toLowerCase();
            if(findThis.equals("exit"))
            {
                System.out.println("Bye Bye ^^");
                break;
            }
            for (int i = 0; i < books.length; i++)
            {
                if(count==books.length)
                {
                    System.out.println("Sorry.. We don't have it");
                }
                if (books[i].toLowerCase().contains(findThis))
                {
                    System.out.println(books[i]);
                    count++;
                }
                else {
                    count++;
                    continue;
                }

            }
        }
    }
}
