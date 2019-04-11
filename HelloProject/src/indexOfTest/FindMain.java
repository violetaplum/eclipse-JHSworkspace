package indexOfTest;
import java.util.Scanner;

class Find
{
    public String find(String[] books)
    {
        Scanner sc = new Scanner(System.in);
        String findThis;
        /*int count = 0;*/
        while(true) {
            System.out.print("Find your book (If you wanna leave Insert 'exit') >> ");
            findThis = sc.nextLine().toLowerCase();
            int count = 0;
            if(findThis.equals("exit"))
            {
                System.out.println("Bye Bye ^^");
                break;
            }
            for (int i = 0; i < books.length; i++)
            {
                if(count==(books.length-1))
                {
                    System.out.println("Sorry.. We don't have it");
                }
                if (books[i].toLowerCase().contains(findThis))
                {
                    System.out.println(books[i]);

                }
                else {
                    ++count;
                }

            }
        }
        return "dd";
    }
}

public class FindMain extends Find
{
    public static void main(String[] args)
    {
        String[] books = {"the book of Java","catch The JAVA!","lonely C#"};
        FindMain fm = new FindMain();
        fm.find(books);

    }
}

