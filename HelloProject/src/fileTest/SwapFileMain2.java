package fileTest;
import java.io.*;

public class SwapFileMain2 {
    public static void main(String[] args) throws IOException{
        //aa.txt --> imsi.txt copy
        String str1=null;
        BufferedReader br1
                = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/aa.txt"));

        PrintWriter pw1= new PrintWriter
                (new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/cc.txt")));

        while( (str1=br1.readLine()) != null )
        {
            pw1.println(str1);///////////////////
        }
        br1.close();
        pw1.close();




        //bb.txt --> aa.txt copy
        BufferedReader br2
                = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/bb.txt"));
        PrintWriter pw2= new PrintWriter
                (new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/aa.txt")));
        while( (str1=br2.readLine()) != null )
        {
            pw2.println(str1);///////////////////
        }
        br2.close();
        pw2.close();

        //imsi.txt --> bb.txt copy
        BufferedReader br3
                = new BufferedReader(new FileReader("C:/Users/KGITBANK/Downloads/cc.txt"));
        PrintWriter pw3= new PrintWriter
                (new BufferedWriter(new FileWriter("C:/Users/KGITBANK/Downloads/bb.txt")));
        while( (str1=br3.readLine()) != null )
        {
            pw3.println(str1);///////////////////
        }
        br3.close();
        pw3.close();

        File f1=new File("C:/Users/KGITBANK/Downloads/cc.txt"); //imsi.txt에대한 객체생성
        if(f1.delete())
            System.out.println("Bye C.txt");
        else
            System.out.println("Error Occured");
    }
}

